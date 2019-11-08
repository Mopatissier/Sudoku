package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

public class Position16x16 {

    private int position;

    public Position16x16(int line, int column) {

        this.position = line*16 + column;
    }

    public Position16x16(int pos) {

        this.position = pos;
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
