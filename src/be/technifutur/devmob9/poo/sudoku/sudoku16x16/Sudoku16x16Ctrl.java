package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

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

            String[] donnees = ajout.split(",");

            line = Integer.parseInt(donnees[0]);
            column = Integer.parseInt(donnees[1]);
            valeur = donnees[2].charAt(0);

            pos = new Position16x16(line, column);

            if(modele.add(pos, valeur)) {
                vue.affiche("");
            } else {
                vue.affiche("Erreur : case déjà remplie !");
            }


        }

        System.out.println("Bravo !");
    }

}
