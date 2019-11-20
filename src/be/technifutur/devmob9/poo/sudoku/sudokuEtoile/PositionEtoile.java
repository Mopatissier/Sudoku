package be.technifutur.devmob9.poo.sudoku.sudokuEtoile;

import be.technifutur.devmob9.poo.sudoku.PositionException;

public class PositionEtoile {

    private int position;

    public PositionEtoile(int line, int column) throws PositionException {

        if(line < 0 || line > 20 || column < 0 || column > 20)
            throw new PositionException();

        //Trou nord
        if(column > 8 && column < 12 && line < 6)
            throw new PositionException();

        //Trou sud
        if(column > 8 && column < 12 && line > 14)
            throw new PositionException();

        //Trou ouest
        if(line > 8 && line < 12 && column < 6)
            throw new PositionException();

        //Trou est
        if(line > 8 && line < 12 && column > 14)
            throw new PositionException();


        this.position = decalageEtoile(line, column);

    }

    public PositionEtoile(int pos) throws PositionException {

        if(pos >= 369)
            throw new PositionException();

        this.position = pos;


    }

    public int getLine() {

        return (decalageEtoile(this.position) / 21);
    }

    public int getColumn() {

        return (decalageEtoile(this.position) % 21);
    }

    public int getPos() {

        return this.position;
    }

    public int getSector() {
        int sector = 0;
        int decalage = 0;

        sector += this.getColumn()/3;
        sector += (this.getLine()/3)*7;

        if(sector > 2)
            decalage ++;
        if(sector > 9)
            decalage++;
        if(sector > 20)
            decalage += 2;
        if(sector > 25)
            decalage += 2;
        if(sector > 37)
            decalage ++;
        if(sector > 44)
            decalage++;

        return sector - decalage;
    }

    public int getLineSector() {

        return (this.getLine()%3);
    }

    public int getColumnSector() {

        return (this.getColumn()%3);
    }


    // Dans un tableau de 21x21, retrouve l'indice.
    private int decalageEtoile(int line, int column) {

        int i = 0;
        int decalage;

        // Décalage du trou au nord.
        if(line > 5) {
            decalage = 6;
        } else {
            decalage = line;
            if(column > 11)
                decalage += 1;
        }

        i -= decalage*3;

        // Décalage du trou au sud.
        if(line < 15) {
            decalage = 0;
        } else {
            decalage = line - 15;
            if(column > 11)
                decalage += 1;
        }

        i -= decalage*3;


        //Décalage du trou à l'ouest.
        if(line < 9) {
            decalage = 0;
        } else {
            if(line > 11) {
                decalage = 3;
            } else {
                decalage = line - 8;
            }
        }

        i -= decalage*6;


        //Décalage du trou à l'est.
        if(line < 9) {
            decalage = 0;
        } else {
            if(line > 11) {
                decalage = 3;
            } else {
                decalage = line - 9;
            }
        }

        i -= decalage*6;

        i =  i + column + line * 21;

        return i;
    }

    // Replace la position dans un tableau de 21 x 21.
    private int decalageEtoile(int pos) {

        int i = pos;
        int decalage;

        // Décalage du trou au nord.
        if(i > 98) {
            decalage = 6;
        } else {
            decalage = (i+9)/18;
        }

        i += decalage * 3;


        // Décalage du trou à l'ouest.
        if(i < 189) {
            decalage = 0;
        } else {
            if(i > 206) {
                decalage = 3;
            } else {
                decalage = (i-189)/9 + 1;
            }
        }

        i += decalage * 6;

        // Décalage du trou à l'est.
        if(i < 204) {
            decalage = 0;
        } else {
            if(i > 233) {
                decalage = 3;
            } else {
                decalage = (i-204)/15 + 1;
            }
        }

        i += decalage * 6;

        // Décalage du trou au sud.
        if(i < 324) {
            decalage = 0;
        } else {
            decalage = (i-324)/18 + 1;
        }

        i += decalage * 3;

        return i;
    }

}
