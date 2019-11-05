package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

public class Sudoku16x16Vue {

    private String tableau;

    public Sudoku16x16Vue() {

        StringBuilder tempo = new StringBuilder();

        tempo.append("╔═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╗\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║   │   │   │   ║   │   │   │   ║   │   │   │   ║   │   │   │   ║\n");
        tempo.append("╚═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╝\n");

        tableau = tempo.toString();

    }

    public void afficher() {

        System.out.println(tableau);

    }

}