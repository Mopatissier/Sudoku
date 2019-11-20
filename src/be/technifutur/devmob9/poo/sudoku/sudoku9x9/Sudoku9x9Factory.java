package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;
import be.technifutur.devmob9.poo.sudoku.util.User;
import be.technifutur.devmob9.poo.sudoku.util.ValueSet;

public class Sudoku9x9Factory {

    private Sudoku9x9 s9x9Modele = null;
    private Sudoku9x9Vue s9x9Vue = null;
    private Sudoku9x9Ctrl s9x9Ctrl = null;

    private ValueSet[] set = new ValueSet[27];

    public Sudoku9x9 getSudoku(){
        return s9x9Modele;
    }

    public Sudoku9x9Ctrl getSudokuCtrl(User user) {

        try {
            for(int i = 0; i < 27; i++) {
                set[i] = new ValueSet();
            }

            s9x9Modele = new Sudoku9x9();
            for (int i = 0; i < 81; i++) {
                Cellule cellule = new Cellule();
                Position9x9 pos = new Position9x9(i);

                s9x9Modele.setCellule(pos, cellule);

                cellule.addValueSet(set[pos.getLine()]);
                cellule.addValueSet(set[pos.getColumn()+9]);
                cellule.addValueSet(set[pos.getSector()+18]);

            }

            s9x9Vue = new Sudoku9x9Vue(s9x9Modele, user);
            s9x9Ctrl = new Sudoku9x9Ctrl(s9x9Modele, s9x9Vue);


        } catch(PositionException e) {/* Ne devrait jamais arriver */}

        return s9x9Ctrl;
    }

    public Sudoku9x9Vue getSudokuVue() {
        return s9x9Vue;
    }
}
