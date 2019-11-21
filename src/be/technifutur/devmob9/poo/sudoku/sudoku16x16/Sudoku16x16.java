package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import be.technifutur.devmob9.poo.sudoku.*;
import be.technifutur.devmob9.poo.sudoku.generalization.AbstractSudoku;

public class Sudoku16x16 extends AbstractSudoku implements VisualSudoku, SudokuModifiable {


    public Sudoku16x16() {
        super(256);
    }

    @Override
    public boolean isValid(char value) {

        return (value >= '1' && value <= '9') || (value >= 'a' && value <= 'f');
    }

    @Override
    public Position getPosition(int index) throws PositionException{

        Position16x16 pos = new Position16x16(index);

        return pos;
    }

}
