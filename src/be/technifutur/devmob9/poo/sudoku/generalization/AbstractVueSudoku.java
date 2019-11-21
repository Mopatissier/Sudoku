package be.technifutur.devmob9.poo.sudoku.generalization;

import be.technifutur.devmob9.poo.sudoku.Position;
import be.technifutur.devmob9.poo.sudoku.PositionException;
import be.technifutur.devmob9.poo.sudoku.SudokuVueModifiable;
import be.technifutur.devmob9.poo.sudoku.VisualSudoku;
import be.technifutur.devmob9.poo.sudoku.util.User;

public abstract class AbstractVueSudoku implements SudokuVueModifiable {

    private VisualSudoku modele;
    private User user;
    private String tableau;

    public AbstractVueSudoku(VisualSudoku modele, User user) {

        this.tableau = createTab();
        this.modele = modele;
        this.user = user;

        tableau = tableau.replaceAll("\\.", "%s");

    }

    public abstract String createTab();

    @Override
    public void affiche(String message) {

        String tableau;

        Character[] valeur = new Character[modele.size()];

        try {
            for (int i = 0; i < modele.size(); i++) {

                Position pos = modele.getPosition(i);

                if(modele.isEmpty(pos))
                    valeur[i] = ' ';
                else
                    valeur[i] = modele.get(pos);


            }
        } catch(PositionException e) {/* Ne devrait jamais arriver */}

        tableau = String.format(this.tableau, (Object[]) valeur);

        System.out.print(tableau);

        if(!message.equals(""))
            System.out.println(message);

    }

    @Override
    public String saisir(String prompt) {

        System.out.print(prompt);

        return user.saisie();

    }

    public void setUser(User u) {

        user = u;
    }
}
