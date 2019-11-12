package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

public class Position4x4 {

    private int position;

    public Position4x4(int line, int column) {

        this.position = line*4 + column;
    }

    public Position4x4(int pos) {

        this.position = pos;
    }

    public int getLine() {

        return (this.position / 4);
    }

    public int getColumn() {

        return (this.position % 4);
    }

    public int getPos() {

        return this.position;
    }

    public int getSector() {
        int sector = 0;

        sector += this.getColumn()/2;
        sector += (this.getLine()/2)*2;

        return sector;
    }

    public int getLineSector() {

        return (this.getLine()%2);
    }

    public int getColumnSector() {

        return (this.getColumn()%2);
    }


}