package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import be.technifutur.devmob9.poo.sudoku.*;
import be.technifutur.devmob9.poo.sudoku.generalization.AbstractSudoku;

public class Sudoku9x9 extends AbstractSudoku implements VisualSudoku, SudokuModifiable {


    public Sudoku9x9() {
        super(81);
    }

    @Override
    public boolean isValid(char value) {

        return value >= '1' && value <= '9';
    }

    @Override
    public Position getPosition(int index) throws PositionException{

        Position9x9 pos = new Position9x9(index);

        return pos;
    }

}
