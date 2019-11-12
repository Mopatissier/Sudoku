package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

public class Sudoku9x9Ctrl {

    private Sudoku9x9 modele;
    private Sudoku9x9Vue vue;

    public Sudoku9x9Ctrl(Sudoku9x9 modele, Sudoku9x9Vue vue){

        this.modele = modele;
        this.vue = vue;

    }

    public void start() {

        String ajout;
        Position9x9 pos;
        int line = 0;
        int column = 0;
        char valeur = 0;

        vue.affiche("");

        while(!modele.isComplet()) {

            ajout = vue.saisir("Entrez une valeur et ces coordonnées. (Ligne,colonne,valeur) : ");

            String[] donnees = ajout.split(",");

            line = Integer.parseInt(donnees[0]);
            column = Integer.parseInt(donnees[1]);
            valeur = donnees[2].charAt(0);

            pos = new Position9x9(line, column);

            if(modele.add(pos, valeur)) {
                vue.affiche("");
            } else {
                vue.affiche("Erreur : case déjà remplie !");
            }


        }

        System.out.println("Bravo !");
    }
}
