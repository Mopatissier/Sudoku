package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

public class Sudoku9x9Vue {

    private String tableau;

    public Sudoku9x9Vue(){

        StringBuilder tempo = new StringBuilder();

        tempo.append("╔═══╤═══╤═══╦═══╤═══╤═══╦═══╤═══╤═══╗\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╠═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╣\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╠═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╣\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║   │   │   ║   │   │   ║   │   │   ║\n");
        tempo.append("╚═══╧═══╧═══╩═══╧═══╧═══╩═══╧═══╧═══╝\n");

        tableau = tempo.toString();

    }

    public void afficher() {

        System.out.println(tableau);

    }

}
