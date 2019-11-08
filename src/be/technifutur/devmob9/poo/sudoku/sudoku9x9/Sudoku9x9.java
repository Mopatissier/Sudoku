package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

public class Sudoku9x9 {

    public static final char VIDE = 0;
    private char[] sudoku = new char[81];

    public Sudoku9x9(){

        for (int i = 0; i < 81; i++)
            this.sudoku[i] = 0;
    }

    public void add(Position9x9 p, char valeur) {

        this.sudoku[p.getPos()] = valeur;
    }

    public char remove(Position9x9 p) {
        char tempo;

        tempo = this.sudoku[p.getPos()];
        this.sudoku[p.getPos()] = 0;

        return tempo;
    }

    public char get(Position9x9 p) {

        return this.sudoku[p.getPos()];

    }
}
