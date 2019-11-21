package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import be.technifutur.devmob9.poo.sudoku.SudokuVueModifiable;
import be.technifutur.devmob9.poo.sudoku.VisualSudoku;
import be.technifutur.devmob9.poo.sudoku.generalization.AbstractVueSudoku;
import be.technifutur.devmob9.poo.sudoku.util.User;

public class Sudoku4x4Vue extends AbstractVueSudoku implements SudokuVueModifiable {

    public Sudoku4x4Vue(VisualSudoku modele, User user) {
        super(modele, user);
    }

    @Override
    public  String createTab(){

        StringBuilder tempo = new StringBuilder();

        tempo.append("Sudoku 4x4 :\n\n");

        tempo.append("     1   2   3   4  \n");
        tempo.append("   ╔═══╤═══╦═══╤═══╗\n");
        tempo.append(" 1 ║ . │ . ║ . │ . ║\n");
        tempo.append("   ╟───┼───╫───┼───╢\n");
        tempo.append(" 2 ║ . │ . ║ . │ . ║\n");
        tempo.append("   ╠═══╪═══╬═══╪═══╣\n");
        tempo.append(" 3 ║ . │ . ║ . │ . ║\n");
        tempo.append("   ╟───┼───╫───┼───╢\n");
        tempo.append(" 4 ║ . │ . ║ . │ . ║\n");
        tempo.append("   ╚═══╧═══╩═══╧═══╝\n");

        return tempo.toString();

    }

}
