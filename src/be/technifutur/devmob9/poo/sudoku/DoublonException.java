package be.technifutur.devmob9.poo.sudoku;

public class DoublonException extends SudokuException{

    private String endroit;

    public DoublonException(String message) {
        this.endroit = message;
    }

    public String getEndroit() {
        return endroit;
    }
}
