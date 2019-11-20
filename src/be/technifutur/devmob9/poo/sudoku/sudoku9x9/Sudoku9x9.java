package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import be.technifutur.devmob9.poo.sudoku.DoublonException;
import be.technifutur.devmob9.poo.sudoku.LockException;
import be.technifutur.devmob9.poo.sudoku.OccupiedException;
import be.technifutur.devmob9.poo.sudoku.ValueException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;

public class Sudoku9x9 {

    private boolean locked = false;
    private Cellule[] cellule = new Cellule[81];

    public void setCellule(Position9x9 p, Cellule c) {

        cellule[p.getPos()] = c;

    }

    public Cellule getCellule(Position9x9 p) {

        return cellule[p.getPos()];

    }

    public void setValue(Position9x9 p, char valeur) throws ValueException, OccupiedException, LockException, DoublonException {

        if(valeur < '1' || valeur > '9') {
            throw new ValueException();
        } else {
            cellule[p.getPos()].setValue(valeur);
        }

    }

    public char remove(Position9x9 p) throws LockException {
        char tempo;

        tempo = cellule[p.getPos()].getValue();

        try {
            cellule[p.getPos()].setValue(Cellule.VIDE);
        } catch(OccupiedException e) {/* Ne devrait pas arriver.*/}
        catch(DoublonException e) {/* Ne devrait pas arrvier. */}

        return tempo;
    }

    public char get(Position9x9 p) {

        return cellule[p.getPos()].getValue();

    }

    public boolean isComplet() {

        boolean complet = false;
        int i = 0;

        while(i < 81 && cellule[i].getValue() != Cellule.VIDE)
            i ++;

        if(i == 81)
            complet = true;

        return complet;
    }

    public void lock() {

        for(int i = 0; i < 81; i ++) {
            if(cellule[i].getValue() != Cellule.VIDE) {
                cellule[i].lock();
                locked = true;
            }
        }
    }

    public boolean isLocked() {

        return locked;
    }
}
