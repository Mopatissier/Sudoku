package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

public class Position9x9 {

    private int position;

    public Position9x9(int line, int column) {

        this.position = line*9 + column;
    }

    public Position9x9(int pos) {

        this.position = pos;
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
