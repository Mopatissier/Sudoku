package be.technifutur.devmob9.poo.sudoku.sudokuEtoile;

import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;
import be.technifutur.devmob9.poo.sudoku.util.User;

public class SudokuEtoileVue {

    private String tableau;
    private SudokuEtoile modele;
    private User user;

    public SudokuEtoileVue(SudokuEtoile modele, User user){

        StringBuilder tempo = new StringBuilder();

        tempo.append("Sudoku Etoile :\n\n");

        tempo.append("╔═══╤═══╤═══╦═══╤═══╤═══╦═══╤═══╤═══╗           ╔═══╤═══╤═══╦═══╤═══╤═══╦═══╤═══╤═══╗\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╢           ╟═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╤═══╤═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢───┼───┼───╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢───┼───┼───╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╚═══╧═══╧═══╩═══╧═══╧═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╧═══╧═══╩═══╧═══╧═══╝\n");
        tempo.append("                        ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("                        ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("                        ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("                        ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("                        ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╔═══╤═══╤═══╦═══╤═══╤═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╤═══╤═══╦═══╤═══╤═══╗\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢───┼───┼───╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢───┼───┼───╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╧═══╧═══╬═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╢           ╟═══╪═══╪═══╬═══╪═══╪═══╬═══╪═══╪═══╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╟───┼───┼───╫───┼───┼───╫───┼───┼───╢           ╟───┼───┼───╫───┼───┼───╫───┼───┼───╢\n");
        tempo.append("║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║           ║ . │ . │ . ║ . │ . │ . ║ . │ . │ . ║\n");
        tempo.append("╚═══╧═══╧═══╩═══╧═══╧═══╩═══╧═══╧═══╝           ╚═══╧═══╧═══╩═══╧═══╧═══╩═══╧═══╧═══╝\n");

        tableau = tempo.toString();
        this.modele = modele;
        this.user = user;

        tableau = tableau.replaceAll("\\.", "%s");

    }

    public void affiche(String message) {

        String tab;

        Character[] valeur = new Character[369];

        try {
            for (int i = 0; i < 369; i++) {
                char val = modele.get(new PositionEtoile(i));
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
