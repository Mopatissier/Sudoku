package be.technifutur.devmob9.poo.sudoku;

import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16;
import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16Ctrl;
import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16Vue;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4Ctrl;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4Vue;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9Ctrl;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9Vue;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoile;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoileCtrl;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoileVue;
import be.technifutur.devmob9.poo.sudoku.util.MyUser;
import be.technifutur.devmob9.poo.sudoku.util.RemplisSudokus;
import be.technifutur.devmob9.poo.sudoku.util.UserConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RemplisSudokus remplissage = new RemplisSudokus();
        MyUser user = new MyUser(remplissage.SudokuEtoileTab1());

        //UserConsole user = new UserConsole();

        Sudoku4x4 s4x4Modele = new Sudoku4x4();
        Sudoku4x4Vue s4x4Vue = new Sudoku4x4Vue(s4x4Modele, user);
        Sudoku4x4Ctrl s4x4Ctrl = new Sudoku4x4Ctrl(s4x4Modele, s4x4Vue);

        Sudoku9x9 s9x9Modele = new Sudoku9x9();
        Sudoku9x9Vue s9x9Vue = new Sudoku9x9Vue(s9x9Modele, user);
        Sudoku9x9Ctrl s9x9Ctrl = new Sudoku9x9Ctrl(s9x9Modele, s9x9Vue);

        Sudoku16x16 s16x16Modele = new Sudoku16x16();
        Sudoku16x16Vue s16x16Vue = new Sudoku16x16Vue(s16x16Modele, user);
        Sudoku16x16Ctrl s16x16Ctrl = new Sudoku16x16Ctrl(s16x16Modele, s16x16Vue);


        SudokuEtoile sEtoileModele = new SudokuEtoile();
        SudokuEtoileVue sEtoileVue = new SudokuEtoileVue(sEtoileModele, user);
        SudokuEtoileCtrl sEtoileCtrl = new SudokuEtoileCtrl(sEtoileModele, sEtoileVue);

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
