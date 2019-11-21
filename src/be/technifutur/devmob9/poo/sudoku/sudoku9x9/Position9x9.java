package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import be.technifutur.devmob9.poo.sudoku.Position;
import be.technifutur.devmob9.poo.sudoku.PositionException;

public class Position9x9 implements Position {

    private int position;

    public Position9x9(int line, int column) throws PositionException {

        if(line < 0 || line > 8 || column < 0 || column > 8)
            throw new PositionException();

        this.position = line*9 + column;
    }

    public Position9x9(int pos) throws PositionException{

        this(pos/9, pos%9);
    }

    public int getLine() {

        return (this.position / 9);
    }

    public int getColumn() {

        return (this.position % 9);
    }

    public int getPos() {

        return this.position;
    }

    public int getSector() {
        int sector = 0;

        sector += this.getColumn()/3;
        sector += (this.getLine()/3)*3;

        return sector;
    }

    public int getLineSector() {

        return (this.getLine()%3);
    }

    public int getColumnSector() {

        return (this.getColumn()%3);
    }


}
