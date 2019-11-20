package be.technifutur.devmob9.poo.sudoku.util;

import be.technifutur.devmob9.poo.sudoku.sudokuEtoile.PositionEtoile;

public class RemplisSudokus {

    public String[] Sudoku4x4Tab1(){

        String[] tab = new String[16];

        tab[0] = "0,0,1";
        tab[1] = "0,1,2";
        tab[2] = "0,2,3";
        tab[3] = "0,3,4";
        tab[4] = "1,0,2";
        tab[5] = "1,1,3";
        tab[6] = "1,2,4";
        tab[7] = "1,3,1";
        tab[8] = "2,0,3";
        tab[9] = "2,1,4";
        tab[10] = "2,2,1";
        tab[11] = "2,3,2";
        tab[12] = "3,0,4";
        tab[13] = "3,1,1";
        tab[14] = "3,2,2";
        tab[15] = "3,3,3";

        return tab;
    }

    public String[] Sudoku4x4Tab2(){

        String[] tab = new String[16];

        tab[0] = "0,0,a";
        tab[1] = "0,1,b";
        tab[2] = "0,2,c";
        tab[3] = "0,3,d";
        tab[4] = "1,0,b";
        tab[5] = "1,1,c";
        tab[6] = "1,2,d";
        tab[7] = "1,3,a";
        tab[8] = "2,0,c";
        tab[9] = "2,1,d";
        tab[10] = "2,2,a";
        tab[11] = "2,3,b";
        tab[12] = "3,0,d";
        tab[13] = "3,1,a";
        tab[14] = "3,2,b";
        tab[15] = "3,3,c";

        return tab;
    }

    public String[] Sudoku9x9Tab1(){

        String[] tab = new String[81];

        for(int i = 0; i < 81; i ++){
            tab[i] = "" + i/9 + ',' + i%9 + ',' + i%9;
        }

        return tab;
    }

    public String[] Sudoku16x16Tab1(){

        String[] tab = new String[256];

        char val = 0;

        for(int i = 0; i < 256; i ++){

            if((i%16) >= 9)
                val = (char) ('a' + i%16 - 9);
            else
                val = (char) ('1' + i%16);

            tab[i] = "" + i/16 + ',' + i%16 + ',' + val;
        }

        return tab;
    }

    /*public String[] SudokuEtoileTab1(){

        String[] tab = new String[369];
        PositionEtoile p;

        char val = 0;

        for(int i = 0; i < 369; i ++){

            p = new PositionEtoile(i);

            tab[i] = "" + p.getLine() + ',' + p.getColumn() + ',' + p.getColumnSector();

        }

        return tab;
    }*/

}
