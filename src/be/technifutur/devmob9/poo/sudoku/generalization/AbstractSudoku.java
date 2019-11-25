package be.technifutur.devmob9.poo.sudoku.generalization;

import be.technifutur.devmob9.poo.sudoku.*;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;

public abstract class AbstractSudoku implements SudokuModifiable, VisualSudoku{

    private Cellule[] cellule;
    private boolean locked = false;

    public AbstractSudoku(int size) {
        this.cellule = new Cellule[size];
    }

    public void setCellule(Position p, Cellule c) {

        cellule[p.getPos()] = c;

    }

    @Override
    public void setValue(Position p, char value) throws IllegalValueException, OccupiedException, LockException, DoublonException {

        if(isValid(value)) {
            cellule[p.getPos()].setValue(value);
        } else {
            throw new IllegalValueException();
        }

    }

    public abstract boolean isValid(char value);


    @Override
    public boolean isComplet() {

        boolean complet = false;
        int i;

        for(i = 0; i < cellule.length && !cellule[i].isEmpty(); i++);

        if(i == cellule.length)
            complet = true;

        return complet;

    }

    @Override
    public char get(Position p) {

        return cellule[p.getPos()].getValue();

    }

    @Override
    public char remove(Position p) throws LockException {

        return cellule[p.getPos()].removeValue();
    }

    public void lock() {

        if(locked) {
            for (int i = 0; i < cellule.length; i++) {
                if (!cellule[i].isEmpty()) {
                    cellule[i].lock();
                    locked = true;
                }
            }
        }
    }

    public boolean isLocked() {
        return locked;
    }

    public int size() {

        return cellule.length;
    }

    @Override
    public boolean isEmpty(Position pos) {

        return cellule[pos.getPos()].isEmpty();
    }

}
