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

    public String[] Sudoku9x9Resolution1(){

        String[] tab = new String[45];

        tab[0] = "1,1,8";
        tab[1] = "1,3,2";
        tab[2] = "1,4,5";
        tab[3] = "1,6,4";
        tab[4] = "1,7,6";
        tab[5] = "2,3,1";
        tab[6] = "2,5,8";
        tab[7] = "2,6,3";
        tab[8] = "2,7,9";
        tab[9] = "2,8,7";
        tab[10] = "2,9,5";
        tab[11] = "3,1,5";
        tab[12] = "3,3,3";
        tab[13] = "3,4,7";
        tab[14] = "3,7,8";
        tab[15] = "4,1,1";
        tab[16] = "4,3,9";
        tab[17] = "4,5,7";
        tab[18] = "5,2,4";
        tab[19] = "5,4,8";
        tab[20] = "5,5,6";
        tab[21] = "5,7,2";
        tab[22] = "5,8,9";
        tab[23] = "5,9,1";
        tab[24] = "6,1,2";
        tab[25] = "6,2,8";
        tab[26] = "6,4,9";
        tab[27] = "6,6,1";
        tab[28] = "6,7,5";
        tab[29] = "6,9,7";
        tab[30] = "7,1,6";
        tab[31] = "7,4,4";
        tab[32] = "7,5,3";
        tab[33] = "7,8,5";
        tab[34] = "7,9,9";
        tab[35] = "8,3,4";
        tab[36] = "8,4,6";
        tab[37] = "8,5,5";
        tab[38] = "8,7,3";
        tab[39] = "8,8,2";
        tab[40] = "9,1,9";
        tab[41] = "9,2,3";
        tab[42] = "9,3,5";
        tab[43] = "9,5,2";
        tab[44] = "9,8,6";

        return tab;

    }

    public String[] Sudoku9x9Resolution2(){

        String[] tab = new String[81];
        String value;

        value = "032960150100802607076000002600475020720081430500000701950706013000000080301058006";

        for(int i = 0; i < tab.length; i++) {
            tab[i] = "" + (i/9+1) + ',' + (i%9+1) + ',' + value.charAt(i);
        }

        return tab;

    }

    public String[] Sudoku9x9Resolution3(){

        String[] tab = new String[81];
        String value;

        value = "005000300004205706010089500001024800002870140708000005470050002500300400003490058";

        for(int i = 0; i < tab.length; i++) {
            tab[i] = "" + (i/9+1) + ',' + (i%9+1) + ',' + value.charAt(i);
        }

        return tab;

    }

    public String[] Sudoku9x9Resolution4(){

        String[] tab = new String[81];
        String value;

        value = "500080619400000000708390000030907000900020730100000004080400100040500300609203005";

        for(int i = 0; i < tab.length; i++) {
            tab[i] = "" + (i/9+1) + ',' + (i%9+1) + ',' + value.charAt(i);
        }

        return tab;

    }

    public String[] Sudoku9x9Resolution5(){

        String[] tab = new String[81];
        String value;

        value = "001080000009200480000060007010043020700500310003000700060070502030400100800000009";

        for(int i = 0; i < tab.length; i++) {
            tab[i] = "" + (i/9+1) + ',' + (i%9+1) + ',' + value.charAt(i);
        }

        return tab;

    }

    public String[] Sudoku9x9Resolution6(){

        String[] tab = new String[81];
        String value;

        value = "400600100000001090000320000020060800050700009839000010610000085000000400000250900";

        for(int i = 0; i < tab.length; i++) {
            tab[i] = "" + (i/9+1) + ',' + (i%9+1) + ',' + value.charAt(i);
        }

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
