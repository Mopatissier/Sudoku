package be.technifutur.devmob9.poo.sudoku;

import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16;
import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16Ctrl;
import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16Factory;
import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16Vue;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4Ctrl;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4Factory;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4Vue;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9Ctrl;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9Factory;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9Vue;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoile;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoileCtrl;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoileFactory;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoileVue;
import be.technifutur.devmob9.poo.sudoku.util.MyUser;
import be.technifutur.devmob9.poo.sudoku.util.RemplisSudokus;
import be.technifutur.devmob9.poo.sudoku.util.UserConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //RemplisSudokus remplissage = new RemplisSudokus();
        //MyUser user = new MyUser(remplissage.SudokuEtoileTab1());

        UserConsole user = new UserConsole();

        Sudoku4x4Factory s4x4 = new Sudoku4x4Factory();
        Sudoku4x4Ctrl s4x4Ctrl = s4x4.getSudokuCtrl(user);

        Sudoku9x9Factory s9x9 = new Sudoku9x9Factory();
        Sudoku9x9Ctrl s9x9Ctrl = s9x9.getSudokuCtrl(user);

        Sudoku16x16Factory s16x16 = new Sudoku16x16Factory();
        Sudoku16x16Ctrl s16x16Ctrl = s16x16.getSudokuCtrl(user);

        SudokuEtoileFactory sEtoile = new SudokuEtoileFactory();
        SudokuEtoileCtrl sEtoileCtrl = sEtoile.getSudokuCtrl(user);

        Scanner entree = new Scanner(System.in);
        String choix = "0";

        while(!"5".equals(choix)) {

            System.out.println("Quel sorte sudoku voulez-vous générer ?");
            System.out.println("1) 4x4");
            System.out.println("2) 9x9");
            System.out.println("3) 16x16");
            System.out.println("4) Etoile");
            System.out.println("5) Quitter");

            choix = entree.nextLine();

            switch (choix) {
                case "1" :
                    s4x4Ctrl.start();
                    choix = "5";
                    break;

                case "2" :
                    s9x9Ctrl.start();
                    choix = "5";
                    break;

                case "3" :
                    s16x16Ctrl.start();
                    choix = "5";
                    break;

                case "4" :
                    sEtoileCtrl.start();
                    choix = "5";
                    break;

                case "5" :
                    break;

                default :
                    System.out.println("Erreur, commande non reconnue.");
            }

        }
    }
}
