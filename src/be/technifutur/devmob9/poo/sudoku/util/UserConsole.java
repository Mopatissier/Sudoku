package be.technifutur.devmob9.poo.sudoku.util;

import java.util.Scanner;

public class UserConsole implements User{

    @Override
    public String saisie() {

        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

}
