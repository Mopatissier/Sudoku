package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

public class Sudoku4x4 {

    public static final char VIDE = 0;
    private char[] sudoku = new char[16];

    public Sudoku4x4(){

        for (int i = 0; i < 16; i++)
            this.sudoku[i] = 0;
    }

    public boolean add(Position4x4 p, char valeur) {

        boolean caseLibre = true;

        if(this.sudoku[p.getPos()] == VIDE)
            this.sudoku[p.getPos()] = valeur;
        else
            caseLibre = false;

        return caseLibre;

    }

    public char remove(Position4x4 p) {
        char tempo;

        tempo = this.sudoku[p.getPos()];
        this.sudoku[p.getPos()] = 0;

        return tempo;
    }

    public char get(Position4x4 p) {

        return this.sudoku[p.getPos()];

    }

    public boolean isComplet() {

        boolean complet = false;
        int i = 0;

        while(i < 16 && this.sudoku[i] != VIDE)
            i ++;

        if(i == 16)
            complet = true;

        return complet;
    }


}

