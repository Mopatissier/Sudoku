package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;
import be.technifutur.devmob9.poo.sudoku.util.User;

public class Sudoku4x4Vue {

    private Sudoku4x4 modele;
    private User user;
    private String tableau;

    public Sudoku4x4Vue(Sudoku4x4 modele, User user){

        StringBuilder tempo = new StringBuilder();

        tempo.append("Sudoku 4x4 :\n\n");

        tempo.append("╔═══╤═══╦═══╤═══╗\n");
        tempo.append("║ . │ . ║ . │ . ║\n");
        tempo.append("╟───┼───╫───┼───╢\n");
        tempo.append("║ . │ . ║ . │ . ║\n");
        tempo.append("╠═══╪═══╬═══╪═══╣\n");
        tempo.append("║ . │ . ║ . │ . ║\n");
        tempo.append("╟───┼───╫───┼───╢\n");
        tempo.append("║ . │ . ║ . │ . ║\n");
        tempo.append("╚═══╧═══╩═══╧═══╝\n");


        this.tableau = tempo.toString();
        this.modele = modele;

        this.user = user;

        tableau = tableau.replaceAll("\\.", "%s");

    }


    public void affiche(String message) {

        String tab;

        Character[] valeur = new Character[16];

        try {
            for (int i = 0; i < 16; i++) {
                char val = modele.get(new Position4x4(i));
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

        String entree = user.saisie();

        return entree;

    }

    public void setUser(User u) {

        user = u;
    }

}
