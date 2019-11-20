package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;
import be.technifutur.devmob9.poo.sudoku.util.User;

public class Sudoku9x9Vue {

    private Sudoku9x9 modele;
    private User user;
    private String tableau;

    public Sudoku9x9Vue(Sudoku9x9 modele, User user){

        StringBuilder tempo = new StringBuilder();

        tempo.append("Sudoku 9x9 :\n\n");

        tempo.append("╔═══╤═══╤═══╦═══╤═══╤═══╦═══╤═══╤═══╗\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╠═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╣\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╠═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╣\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╚═══╧═══╧═══╩═══╧═══╧═══╩═══╧═══╧═══╝\n");

        tableau = tempo.toString();
        this.modele = modele;
        this.user = user;

        tableau = tableau.replaceAll("\\.", "%s");
    }

    public void affiche(String message) {

        String tab;

        Character[] valeur = new Character[81];

        try {
            for (int i = 0; i < 81; i++) {
                char val = modele.get(new Position9x9(i));
                if (val == Cellule.VIDE) {
                    valeur[i] = ' ';
                } else {
                    valeur[i] = val;
                }

            }
        } catch(PositionException e) {/* Ne devrait jamais arriver */}


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
