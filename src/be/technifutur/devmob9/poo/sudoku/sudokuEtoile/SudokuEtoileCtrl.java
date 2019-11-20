package be.technifutur.devmob9.poo.sudoku.sudokuEtoile;

import be.technifutur.devmob9.poo.sudoku.*;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;

public class SudokuEtoileCtrl {

    private SudokuEtoile modele;
    private SudokuEtoileVue vue;

    public SudokuEtoileCtrl(SudokuEtoile modele, SudokuEtoileVue vue) {

        this.modele = modele;
        this.vue = vue;

    }

    public void start() {

        String ajout;
        PositionEtoile pos;
        int line = 0;
        int column = 0;
        char valeur = 0;

        vue.affiche("");

        while(!modele.isComplet()) {

            ajout = vue.saisir("Entrez une valeur et ces coordonnées. (Ligne,colonne,valeur) : ");

            try {

                String[] donnees = ajout.split(",");

                line = Integer.parseInt(donnees[0]);
                column = Integer.parseInt(donnees[1]);
                valeur = donnees[2].charAt(0);

                if(valeur == '0')
                    valeur = Cellule.VIDE;

                pos = new PositionEtoile(line, column);

                modele.setValue(pos, valeur);

                vue.affiche("");

            } catch (OccupiedException e) {
                vue.affiche("Erreur : case déjà remplie, veuillez supprimer la valeur avant.");
            } catch(ValueException e) {
                vue.affiche("Erreur : la valeur rentrée doit être entre 1 et 9 compris.");
            } catch(PositionException e) {
                vue.affiche("Erreur : position incorrecte.");
            } catch(ArrayIndexOutOfBoundsException e) {
                vue.affiche("Erreur : veuillez respecter la façon d'encoder les coordonnées.");
            } catch(LockException e) {
                vue.affiche("Erreur : vous ne pouvez pas écrire sur cette case.");
            } catch(DoublonException e) {
                vue.affiche("Erreur : vous ne pouvez pas écrire ce nombre à cet endroit.");
            }


        }

        System.out.println("Bravo !");
    }

}
