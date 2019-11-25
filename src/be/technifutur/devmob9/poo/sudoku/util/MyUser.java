package be.technifutur.devmob9.poo.sudoku.util;

import java.util.Scanner;

public class MyUser implements User{

    private String[] test;
    private int cpt = 0;

    public MyUser(String[] tab) {

        test = tab;

    }

    @Override
    public String saisie() {

        String saisie;
        Scanner scan = new Scanner(System.in);

        if(cpt < test.length) {
            saisie = test[cpt++];
        } else {
            saisie = scan.nextLine();
        }

        return saisie;
    }

}
