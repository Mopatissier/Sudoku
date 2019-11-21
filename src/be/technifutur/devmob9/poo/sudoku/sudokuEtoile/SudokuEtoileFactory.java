package be.technifutur.devmob9.poo.sudoku.sudokuEtoile;

import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;
import be.technifutur.devmob9.poo.sudoku.util.User;
import be.technifutur.devmob9.poo.sudoku.util.ValueSet;

public class SudokuEtoileFactory {

    private SudokuEtoile sEtoileModele = null;
    private SudokuEtoileVue sEtoileVue = null;
    private SudokuEtoileCtrl sEtoileCtrl = null;

    private ValueSet[] set = new ValueSet[131];

    public SudokuEtoile getSudoku(){
        return sEtoileModele;
    }

    public SudokuEtoileCtrl getSudokuCtrl(User user) {

        try {
            for(int i = 0; i < 131; i++) {

                if(i < 41) {
                    set[i] = new ValueSet("secteur");
                } else if (i < 86) {
                    set[i] = new ValueSet("ligne");
                } else {
                    set[i] = new ValueSet("colonne");
                }

            }

            sEtoileModele = new SudokuEtoile();
            for (int i = 0; i < 369; i++) {

                PositionEtoile pos = new PositionEtoile(i);
                Cellule cellule = new Cellule();

                sEtoileModele.setCellule(pos, cellule);

                cellule.addValueSet(set[pos.getSector()]);

                int column = pos.getColumn();
                int line = pos.getLine();

                if(line < 9 && column < 9) {                // Carré en haut à gauche
                    cellule.addValueSet(set[line+41]);
                    cellule.addValueSet(set[column+86]);
                } else if(line < 9 && column > 11) {        // Carré en haut à droite
                    cellule.addValueSet(set[line+50]);
                    cellule.addValueSet(set[(column-12)+95]);
                } else if(line > 11 && column < 9) {        // Carré en bas à gauche
                    cellule.addValueSet(set[(line-12)+59]);
                    cellule.addValueSet(set[column+104]);
                } else if(line > 11 && column > 11){        // Carré en bas à droite
                    cellule.addValueSet(set[(line-12)+68]);
                    cellule.addValueSet(set[(column-12)+113]);
                }

                if(line > 5 && line < 15 && column > 5 && column < 15) {    // Carré au centre
                    cellule.addValueSet(set[(line-7)+77]);
                    cellule.addValueSet(set[(column-7)+122]);
                }


            }

            sEtoileVue = new SudokuEtoileVue(sEtoileModele, user);
            sEtoileCtrl = new SudokuEtoileCtrl(sEtoileModele, sEtoileVue);


        } catch(PositionException e) {/* Ne devrait jamais arriver */}

        return sEtoileCtrl;
    }

    public SudokuEtoileVue getSudokuVue() {
        return sEtoileVue;
    }
}
