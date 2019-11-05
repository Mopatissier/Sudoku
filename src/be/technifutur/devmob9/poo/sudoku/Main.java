package be.technifutur.devmob9.poo.sudoku;

import be.technifutur.devmob9.poo.sudoku.sudoku16x16.Sudoku16x16Vue;
import be.technifutur.devmob9.poo.sudoku.sudoku4x4.Sudoku4x4Vue;
import be.technifutur.devmob9.poo.sudoku.sudoku9x9.Sudoku9x9Vue;
import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.SudokuEtoileVue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sudoku4x4Vue s4x4 = new Sudoku4x4Vue();
        Sudoku9x9Vue s9x9 = new Sudoku9x9Vue();
        Sudoku16x16Vue s16x16 = new Sudoku16x16Vue();
        SudokuEtoileVue sEtoile = new SudokuEtoileVue();

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
                    s4x4.afficher();
                    break;

                case "2" :
                    s9x9.afficher();
                    break;

                case "3" :
                    s16x16.afficher();
                    break;

                case "4" :
                    sEtoile.afficher();
                    break;

                case "5" :
                    break;

                default :
                    System.out.println("Erreur, commande non reconnue.");
            }

            if(!"5".equals(choix))
                entree.nextLine();

        }

    }
}
