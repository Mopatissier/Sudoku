package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sudoku9x9Test {

    @Test
    public void TestRemplisVide() {
        Position9x9 p = new Position9x9(6,8);
        Sudoku9x9 s = new Sudoku9x9();

        assertEquals(s.VIDE, s.get(p));

    }

    @Test
    public void TestAdd() {
        Position9x9 p = new Position9x9(0,4);
        Sudoku9x9 s = new Sudoku9x9();

        s.add(p, '1');
        assertEquals('1', s.get(p));

    }

    @Test
    public void TestRemove() {
        Position9x9 p = new Position9x9(3,2);
        Sudoku9x9 s = new Sudoku9x9();

        s.add(p, '1');
        assertEquals('1', s.remove(p));
        assertEquals(s.VIDE, s.get(p));

    }

}