package be.technifutur.devmob9.poo.sudoku.util;

public class MyUser implements User{

    private int cpt = 0;
    private String[] test;

    public MyUser(String[] tab) {

        test = tab;

    }

    @Override
    public String saisie() {

        if(cpt > test.length)
            cpt = 0;

        return test[cpt++];
    }

    @Override
    public void affiche(String prompt) {

        System.out.println(prompt);

    }
}
