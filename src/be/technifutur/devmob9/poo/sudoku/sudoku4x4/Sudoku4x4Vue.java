package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import java.util.Scanner;

public class Sudoku4x4Vue {

    private Sudoku4x4 modele;
    private String tableau;

    public Sudoku4x4Vue(Sudoku4x4 modele){

        StringBuilder tempo = new StringBuilder();

        tempo.append("╔═══╤═══╦═══╤═══╗\n");
        tempo.append("║   │   ║   │   ║\n");
        tempo.append("╟───┼───╫───┼───╢\n");
        tempo.append("║   │   ║   │   ║\n");
        tempo.append("╠═══╪═══╬═══╪═══╣\n");
        tempo.append("║   │   ║   │   ║\n");
        tempo.append("╟───┼───╫───┼───╢\n");
        tempo.append("║   │   ║   │   ║\n");
        tempo.append("╚═══╧═══╩═══╧═══╝\n");

        this.tableau = tempo.toString();
        this.modele = modele;

    }


    public void affiche(String message) {

        StringBuilder tempo = new StringBuilder();
        int ligne;
        int colonne;
        char valeur;
        Position4x4 pos;

        tempo.append("Sudoku 4x4 :\n\n");

        tempo.append("╔═══╤═══╦═══╤═══╗\n");

        for(ligne = 0; ligne < 4; ligne ++) {
            for(colonne = 0; colonne < 4; colonne ++) {

                if(colonne%2 == 0)
                    tempo.append("║ ");
                else
                    tempo.append("│ ");

                pos = new Position4x4(ligne, colonne);
                valeur = modele.get(pos);

                if(valeur == modele.VIDE)
                    tempo.append(' ');
                else
                    tempo.append(valeur);

                tempo.append(' ');

            }

            tempo.append("║\n");
            if(ligne < 3){

                if(ligne%2 == 0)
                    tempo.append("╟───┼───╫───┼───╢\n");
                else
                    tempo.append("╠═══╪═══╬═══╪═══╣\n");

            }
1
        }

        tempo.append("╚═══╧═══╩═══╧═══╝\n\n");

        tempo.append(message);

        System.out.println(tempo.toString());

    }

    public String saisir(String prompt) {

        Scanner entree = new Scanner(System.in);

        System.out.println(prompt);

        return entree.nextLine();

    }

}
