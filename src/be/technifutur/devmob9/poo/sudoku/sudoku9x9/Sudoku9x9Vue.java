package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import be.technifutur.devmob9.poo.sudoku.SudokuVueModifiable;
import be.technifutur.devmob9.poo.sudoku.VisualSudoku;
import be.technifutur.devmob9.poo.sudoku.generalization.AbstractVueSudoku;
import be.technifutur.devmob9.poo.sudoku.util.User;

public class Sudoku9x9Vue extends AbstractVueSudoku implements SudokuVueModifiable {

    public Sudoku9x9Vue(VisualSudoku modele, User user) {
        super(modele, user);
    }

    @Override
    public String createTab() {

        StringBuilder tempo = new StringBuilder();

        tempo.append("Sudoku 9x9 :\n\n");

        tempo.append("     1   2   3   4   5   6   7   8   9  \n");
        tempo.append("   ╔═══╤═══╤═══╦═══╤═══╤═══╦═══╤═══╤═══╗\n");
        tempo.append(" 1 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append(" 2 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append(" 3 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╠═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╣\n");
        tempo.append(" 4 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append(" 5 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append(" 6 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╠═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╣\n");
        tempo.append(" 7 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append(" 8 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append(" 9 ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("   ╚═══╧═══╧═══╩═══╧═══╧═══╩═══╧═══╧═══╝\n");

        return tempo.toString();

    }

}
