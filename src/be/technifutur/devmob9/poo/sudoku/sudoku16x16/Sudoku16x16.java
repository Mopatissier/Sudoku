package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import be.technifutur.devmob9.poo.sudoku.DoublonException;
import be.technifutur.devmob9.poo.sudoku.LockException;
import be.technifutur.devmob9.poo.sudoku.OccupiedException;
import be.technifutur.devmob9.poo.sudoku.ValueException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;

public class Sudoku16x16 {

    private boolean locked = false;
    private Cellule[] cellule = new Cellule[256];

    public void setCellule(Position16x16 p, Cellule c) {

        cellule[p.getPos()] = c;

    }

    public Cellule getCellule(Position16x16 p) {

        return cellule[p.getPos()];

    }

    public void setValue(Position16x16 p, char valeur) throws ValueException, OccupiedException, LockException, DoublonException {

        if((valeur < '1' || valeur > '9') && (valeur < 'a' || valeur > 'f')) {
            throw new ValueException();
        } else {
            cellule[p.getPos()].setValue(valeur);
        }

    }

    public char remove(Position16x16 p) throws LockException {
        char tempo;

        tempo = cellule[p.getPos()].getValue();

        try {
            cellule[p.getPos()].setValue(Cellule.VIDE);
        } catch(OccupiedException e) {/* Ne devrait pas arriver.*/}
        catch(DoublonException e) {/* Ne devrait pas arrvier. */}

        return tempo;
    }

    public char get(Position16x16 p) {

        return cellule[p.getPos()].getValue();

    }

    public boolean isComplet() {

        boolean complet = false;
        int i = 0;

        while(i < 256 && cellule[i].getValue() != Cellule.VIDE)
            i ++;

        if(i == 256)
            complet = true;

        return complet;
    }

    public void lock() {

        for(int i = 0; i < 256; i ++) {
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
