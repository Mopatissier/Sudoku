package be.technifutur.devmob9.poo.sudoku;


public interface VisualSudoku {

    char get(Position position4);

    int size();

    Position getPosition(int index) throws PositionException;

    boolean isEmpty(Position pos);
}
