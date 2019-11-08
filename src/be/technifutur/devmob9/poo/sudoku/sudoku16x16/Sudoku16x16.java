package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

public class Sudoku16x16 {

    public static final char VIDE = 0;
    private char[] sudoku = new char[256];

    public Sudoku16x16(){

        for (int i = 0; i < 256; i++)
            this.sudoku[i] = 0;
    }

    public void add(Position16x16 p, char valeur) {

        this.sudoku[p.getPos()] = valeur;
    }

    public char remove(Position16x16 p) {
        char tempo;

        tempo = this.sudoku[p.getPos()];
        this.sudoku[p.getPos()] = 0;

        return tempo;
    }

    public char get(Position16x16 p) {

        return this.sudoku[p.getPos()];

    }
}
