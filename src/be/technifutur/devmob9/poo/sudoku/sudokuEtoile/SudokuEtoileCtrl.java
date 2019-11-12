package be.technifutur.devmob9.poo.sudoku.sudokuEtoile;

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

            String[] donnees = ajout.split(",");

            line = Integer.parseInt(donnees[0]);
            column = Integer.parseInt(donnees[1]);
            valeur = donnees[2].charAt(0);

            pos = new PositionEtoile(line, column);

            if(modele.add(pos, valeur)) {
                vue.affiche("");
            } else {
                vue.affiche("Erreur : case déjà remplie !");
            }


        }

        System.out.println("Bravo !");
    }
}
