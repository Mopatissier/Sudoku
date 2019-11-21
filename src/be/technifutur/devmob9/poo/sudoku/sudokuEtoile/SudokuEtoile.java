package be.technifutur.devmob9.poo.sudoku.sudokuEtoile;

import be.technifutur.devmob9.poo.sudoku.*;
import be.technifutur.devmob9.poo.sudoku.generalization.AbstractSudoku;

public class SudokuEtoile extends AbstractSudoku implements VisualSudoku, SudokuModifiable {


    public SudokuEtoile() {
        super(369);
    }

    @Override
    public boolean isValid(char value) {

        return value >= '1' && value <= '9';
    }

    @Override
    public Position getPosition(int index) throws PositionException{

        PositionEtoile pos = new PositionEtoile(index);

        return pos;
    }

}
