package be.technifutur.devmob9.poo.sudoku;

public interface SudokuModifiable {

    boolean isComplet();

    void setValue(Position pos, char valeur) throws  IllegalValueException, OccupiedException, LockException, DoublonException;

    char remove(Position pos) throws LockException;
}
