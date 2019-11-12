package be.technifutur.devmob9.poo.sudoku.sudokuEtoile;

public class SudokuEtoile {

    public static final char VIDE = 0;
    private char[] sudoku = new char[369];

    public SudokuEtoile(){

        for (int i = 0; i < 369; i++)
            this.sudoku[i] = VIDE;
    }

    public boolean add(PositionEtoile p, char valeur) {

        boolean caseLibre = true;

        if(this.sudoku[p.getPos()] == VIDE)
            this.sudoku[p.getPos()] = valeur;
        else
            caseLibre = false;

        return caseLibre;
    }

    public char remove(PositionEtoile p) {
        char tempo;

        tempo = this.sudoku[p.getPos()];
        this.sudoku[p.getPos()] = 0;

        return tempo;
    }

    public char get(PositionEtoile p) {

        return this.sudoku[p.getPos()];

    }

    public boolean isComplet() {

        boolean complet = false;
        int i = 0;

        while(i < 369 && this.sudoku[i] != VIDE)
            i ++;

        if(i == 369)
            complet = true;

        return complet;
    }
}
