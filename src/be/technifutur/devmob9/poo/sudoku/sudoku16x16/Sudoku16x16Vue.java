package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import be.technifutur.devmob9.poo.sudoku.SudokuVueModifiable;
import be.technifutur.devmob9.poo.sudoku.VisualSudoku;
import be.technifutur.devmob9.poo.sudoku.generalization.AbstractVueSudoku;
import be.technifutur.devmob9.poo.sudoku.util.User;

public class Sudoku16x16Vue extends AbstractVueSudoku implements SudokuVueModifiable {

    public Sudoku16x16Vue(VisualSudoku modele, User user) {
        super(modele, user);
    }

    @Override
    public String createTab() {

        StringBuilder tempo = new StringBuilder();

        tempo.append("Sudoku 16x16 :\n\n");

        tempo.append("     1   2   3   4   5   6   7   8   9   A   B   C   D   E   F   G  \n");
        tempo.append("   ╔═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╗\n");
        tempo.append(" 1 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" 2 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" 3 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" 4 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append(" 5 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" 6 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" 7 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" 8 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append(" 9 ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" A ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" B ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" C ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append(" D ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" E ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" F ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append(" G ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("   ╚═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╝\n");

        return tempo.toString();

    }

}
