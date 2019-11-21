package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import be.technifutur.devmob9.poo.sudoku.*;
import be.technifutur.devmob9.poo.sudoku.util.Cellule;

public class Sudoku16x16Ctrl {

    private Sudoku16x16 modele;
    private Sudoku16x16Vue vue;

    public Sudoku16x16Ctrl(Sudoku16x16 modele, Sudoku16x16Vue vue){

        this.modele = modele;
        this.vue = vue;

    }

    public void start() {

        String ajout;
        Position16x16 pos;
        int line = 0;
        int column = 0;
        char valeur = 0;

        vue.affiche("");

        while(!modele.isComplet()) {

            ajout = vue.saisir("Entrez une valeur et ces coordonnées. (Ligne,colonne,valeur) : ");

            try {

                String[] donnees = ajout.split(",");


                if(donnees[0].charAt(0) >= 'A' && donnees[0].charAt(0) <= 'Z')
                    line = donnees[0].charAt(0) - 'A' + 9;
                else
                    line = Integer.parseInt(donnees[0])-1;

                if(donnees[1].charAt(0) >= 'A' && donnees[1].charAt(0) <= 'Z')
                    column = donnees[1].charAt(0) - 'A' + 9;
                else
                    column = Integer.parseInt(donnees[1])-1;

                valeur = donnees[2].charAt(0);

                if(valeur == '0')
                    valeur = Cellule.VIDE;

                pos = new Position16x16(line, column);

                modele.setValue(pos, valeur);

                vue.affiche("");

            } catch (OccupiedException e) {
                vue.affiche("Erreur : case "+ e.getMessage()+ " déjà remplie, veuillez supprimer la valeur avant.");
            } catch(IllegalValueException e) {
                vue.affiche("Erreur : la valeur rentrée doit être entre 1 et f compris.");
            } catch(PositionException e) {
                vue.affiche("Erreur : position incorrecte.");
            } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
                vue.affiche("Erreur : veuillez respecter la façon d'encoder les coordonnées.");
            } catch(LockException e) {
                vue.affiche("Erreur : vous ne pouvez pas écrire sur cette case.");
            } catch(DoublonException e) {
                vue.affiche("Erreur : valeur déjà présente : " + e.getEndroit() + ".");
            }


        }

        System.out.println("Bravo !");
    }

}
