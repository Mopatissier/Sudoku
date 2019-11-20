package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;
import be.technifutur.devmob9.poo.sudoku.util.User;
import be.technifutur.devmob9.poo.sudoku.util.ValueSet;

public class Sudoku4x4Factory {

    private Sudoku4x4 s4x4Modele = null;
    private Sudoku4x4Vue s4x4Vue = null;
    private Sudoku4x4Ctrl s4x4Ctrl = null;

    private ValueSet[] set = new ValueSet[12];

    public Sudoku4x4 getSudoku(){
        return s4x4Modele;
    }

    public Sudoku4x4Ctrl getSudokuCtrl(User user) {

        try {
            for(int i = 0; i < 12; i++) {
                set[i] = new ValueSet();
            }

            s4x4Modele = new Sudoku4x4();
            for (int i = 0; i < 16; i++) {
                Cellule cellule = new Cellule();
                Position4x4 pos = new Position4x4(i);

                s4x4Modele.setCellule(pos, cellule);

                cellule.addValueSet(set[pos.getLine()]);
                cellule.addValueSet(set[pos.getColumn()+4]);
                cellule.addValueSet(set[pos.getSector()+8]);

            }

            s4x4Vue = new Sudoku4x4Vue(s4x4Modele, user);
            s4x4Ctrl = new Sudoku4x4Ctrl(s4x4Modele, s4x4Vue);


        } catch(PositionException e) {/* Ne devrait jamais arriver */}

        return s4x4Ctrl;
    }

    public Sudoku4x4Vue getSudokuVue() {
        return s4x4Vue;
    }
}
