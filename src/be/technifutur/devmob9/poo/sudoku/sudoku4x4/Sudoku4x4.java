package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import be.technifutur.devmob9.poo.sudoku.*;
import be.technifutur.devmob9.poo.sudoku.generalization.AbstractSudoku;

public class Sudoku4x4 extends AbstractSudoku implements VisualSudoku, SudokuModifiable {


    public Sudoku4x4() {
        super(16);
    }

    @Override
    public boolean isValid(char value) {

        return value >= '1' && value <= '4';
    }

    @Override
    public Position getPosition(int index) throws PositionException{

        Position4x4 pos = new Position4x4(index);

        return pos;
    }

}

