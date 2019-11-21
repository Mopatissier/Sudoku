package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import be.technifutur.devmob9.poo.sudoku.Position;
import be.technifutur.devmob9.poo.sudoku.PositionException;

public class Position16x16 implements Position {

    private int position;

    public Position16x16(int line, int column) throws PositionException {

        if(line < 0 || line > 15 || column < 0 || column > 15)
            throw new PositionException();

        this.position = line*16 + column;
    }

    public Position16x16(int pos) throws PositionException {

        this(pos/16, pos%16);
    }

    public int getLine() {

        return (this.position / 16);
    }

    public int getColumn() {

        return (this.position % 16);
    }

    public int getPos() {

        return this.position;
    }

    public int getSector() {
        int sector = 0;

        sector += this.getColumn()/4;
        sector += (this.getLine()/4)*4;

        return sector;
    }

    public int getLineSector() {

        return (this.getLine()%4);
    }

    public int getColumnSector() {

        return (this.getColumn()%4);
    }


}
