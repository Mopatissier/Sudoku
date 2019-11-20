package be.technifutur.devmob9.poo.sudoku.util;

import be.technifutur.devmob9.poo.sudoku.DoublonException;
import be.technifutur.devmob9.poo.sudoku.LockException;
import be.technifutur.devmob9.poo.sudoku.OccupiedException;

public class Cellule {

    public static final char VIDE = 0;
    char value = VIDE;
    boolean modifiable = true;
    int tailleSet = 0;

    ValueSet[] set = new ValueSet[5];

    public void setValue(char c) throws OccupiedException, LockException, DoublonException{

        if(this.isLocked())
            throw new LockException();


        if(c == VIDE)
        {

            for(int i = 0; i < tailleSet; i++){
                set[i].remove(value);
            }

        } else {

            if(value != VIDE)
                throw new OccupiedException();

            for(int i = 0; i < tailleSet; i++) {
                if(set[i].contains(c))
                    throw new DoublonException();
            }

            for(int i = 0; i < tailleSet; i++) {
                set[i].add(c);
            }
        }

        value = c;


    }

   public char getValue() {
        return value;
    }

   public void addValueSet(ValueSet set) {

        this.set[tailleSet] = set;

        tailleSet ++;
    }

    public ValueSet[] getValueSet(){

        return set;
    }

    public void lock() {
        modifiable = false;
    }

    public boolean isLocked()
    {
        return !modifiable;
    }

}
