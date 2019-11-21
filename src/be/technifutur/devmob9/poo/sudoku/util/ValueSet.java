package be.technifutur.devmob9.poo.sudoku.util;

public class ValueSet {

    private int data ;
    private String name;

    public ValueSet() {
        data = 0;
        name = "";
    }

    public ValueSet(String name) {
        data = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean add(char c){

        int old = data;
        int value;

        if(c >= 'a' && c <= 'f')
            value = c - 'a' + 10;
        else
            value = c - '0';

        data = data | (1 << (value-1));

        return old!=data;
    }

    public boolean remove(char c){

        int old = data;
        int value;

        if(c >= 'a' && c <= 'f')
            value = c - 'a' + 10;
        else
            value = c - '0';

        data = data & ~(1 << (value - 1));

        return old!=data;
    }

    public boolean contains(char c){

        int value ;
        int result;

        if(c >= 'a' && c <= 'f')
            value = c - 'a' + 10;
        else
            value = c - '0';

        result = data & (1 << (value-1));
        result = result >> (value-1);

        return result == 1;

    }

    public boolean isEmpty() {

        return this.data == 0;
    }

    public int size(){

        return Integer.bitCount(data);

    }
}