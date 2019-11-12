package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import be.technifutur.devmob9.poo.sudoku.util.User;

public class Sudoku16x16Vue {

    private Sudoku16x16 modele;
    private User user;
    private String tableau;

    public Sudoku16x16Vue(Sudoku16x16 modele, User user) {

        StringBuilder tempo = new StringBuilder();

        tempo.append("Sudoku 16x16 :\n\n");

        tempo.append("╔═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╗\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╠═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╣\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╫───┼───┼───┼───╢\n");
        tempo.append("║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║ . │ . │ . │ . ║\n");
        tempo.append("╚═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╝\n");

        tableau = tempo.toString();
        this.modele = modele;
        this.user = user;

        tableau = tableau.replaceAll("\\.", "%s");

    }

    public void affiche(String message) {

        String tab;

        Character[] valeur = new Character[256];

        for(int i = 0; i < 256; i++) {
            char val = modele.get(new Position16x16(i));
            if(val == modele.VIDE) {
                valeur[i] = ' ';
            } else {
                valeur[i] = val;
            }

        }

        tab = String.format(tableau, (Object[]) valeur);

        System.out.print(tab);

        if(!message.equals(""))
            System.out.println(message);


    }

    public String saisir(String prompt) {

        System.out.print(prompt);

        return user.saisie();

    }

    public void setUser(User u) {

        user = u;
    }

}
