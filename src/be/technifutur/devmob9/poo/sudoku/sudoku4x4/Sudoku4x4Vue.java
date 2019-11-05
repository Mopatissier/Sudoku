package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

public class Sudoku4x4Vue {

    private String tableau;

    public Sudoku4x4Vue(){

        StringBuilder tempo = new StringBuilder();

        tempo.append("╔═══╤═══╦═══╤═══╗\n");
        tempo.append("║   │   ║   │   ║\n");
        tempo.append("╟───┼───╫───┼───╢\n");
        tempo.append("║   │   ║   │   ║\n");
        tempo.append("╠═══╪═══╬═══╪═══╣\n");
        tempo.append("║   │   ║   │   ┃\n");
        tempo.append("╟───┼───╫───┼───╢\n");
        tempo.append("║   │   ║   │   ║\n");
        tempo.append("╚═══╧═══╩═══╧═══╝\n");

        tableau = tempo.toString();

    }

    public void afficher() {

        System.out.println(tableau);

    }

}
