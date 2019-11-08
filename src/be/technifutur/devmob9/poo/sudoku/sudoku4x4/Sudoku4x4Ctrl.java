package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

public class Sudoku4x4Ctrl {

    private Sudoku4x4 modele;
    private Sudoku4x4Vue vue;


    public Sudoku4x4Ctrl(Sudoku4x4 modele, Sudoku4x4Vue vue) {

        this.modele = modele;
        this.vue = vue;

    }

    public void start() {

        String ajout;
        Position4x4 pos;
        int line = 0;
        int column = 0;
        char valeur = 0;

        while(!modele.isComplet()) {

            ajout = vue.saisir("Entrez une valeur et ces coordonnées. (Ligne.colonne.valeur)");

            String[] donnees = ajout.split("\\.");

            line = Integer.parseInt(donnees[0]);
            column = Integer.parseInt(donnees[1]);
            valeur = donnees[2].charAt(0);

            pos = new Position4x4(line, column);

            if(modele.add(pos, valeur)) {
                vue.affiche("");
            } else {
                vue.affiche("Erreur : case déjà remplie !");
            }


        }
    }

}
