package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import be.technifutur.devmob9.poo.sudoku.DoublonException;
import be.technifutur.devmob9.poo.sudoku.LockException;
import be.technifutur.devmob9.poo.sudoku.OccupiedException;
import be.technifutur.devmob9.poo.sudoku.ValueException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;

public class Sudoku4x4 {

    private boolean locked = false;
    private Cellule[] cellule = new Cellule[16];


    public void setCellule(Position4x4 p, Cellule c) {

        cellule[p.getPos()] = c;

    }

    public Cellule getCellule(Position4x4 p) {

        return cellule[p.getPos()];

    }

    public void setValue(Position4x4 p, char valeur) throws ValueException, OccupiedException, LockException, DoublonException {

        if(valeur < '1' || valeur > '4') {
            throw new ValueException();
        } else {
            cellule[p.getPos()].setValue(valeur);
        }

    }

    public char remove(Position4x4 p) throws LockException {
        char tempo;

        tempo = cellule[p.getPos()].getValue();

        try {
            cellule[p.getPos()].setValue(Cellule.VIDE);
        } catch(OccupiedException e) {/* Ne devrait pas arriver.*/}
        catch(DoublonException e) {/* Ne devrait pas arrvier. */}

        return tempo;
    }

    public char get(Position4x4 p) {

        return cellule[p.getPos()].getValue();

    }

    public boolean isComplet() {

        boolean complet = false;
        int i = 0;

        while(i < 16 && cellule[i].getValue() != Cellule.VIDE)
            i ++;

        if(i == 16)
            complet = true;

        return complet;
    }

    public void lock() {

        for(int i = 0; i < 16; i ++) {
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

