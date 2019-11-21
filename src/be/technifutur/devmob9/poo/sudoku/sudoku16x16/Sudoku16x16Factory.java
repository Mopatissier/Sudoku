package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;
import be.technifutur.devmob9.poo.sudoku.util.User;
import be.technifutur.devmob9.poo.sudoku.util.ValueSet;

public class Sudoku16x16Factory {

    private Sudoku16x16 s16x16Modele = null;
    private Sudoku16x16Vue s16x16Vue = null;
    private Sudoku16x16Ctrl s16x16Ctrl = null;

    private ValueSet[] set = new ValueSet[48];

    public Sudoku16x16 getSudoku(){
        return s16x16Modele;
    }

    public Sudoku16x16Ctrl getSudokuCtrl(User user) {

        try {
            for(int i = 0; i < 48; i++) {

                if(i < 16) {
                    set[i] = new ValueSet("ligne");
                } else if (i < 32) {
                    set[i] = new ValueSet("colonne");
                } else {
                    set[i] = new ValueSet("secteur");
                }

            }

            s16x16Modele = new Sudoku16x16();
            for (int i = 0; i < 256; i++) {
                Position16x16 pos = new Position16x16(i);
                Cellule cellule = new Cellule();

                s16x16Modele.setCellule(pos, cellule);

                cellule.addValueSet(set[pos.getLine()]);
                cellule.addValueSet(set[pos.getColumn()+16]);
                cellule.addValueSet(set[pos.getSector()+32]);

            }

            s16x16Vue = new Sudoku16x16Vue(s16x16Modele, user);
            s16x16Ctrl = new Sudoku16x16Ctrl(s16x16Modele, s16x16Vue);


        } catch(PositionException e) {/* Ne devrait jamais arriver */}

        return s16x16Ctrl;
    }

    public Sudoku16x16Vue getSudokuVue() {
        return s16x16Vue;
    }

}
