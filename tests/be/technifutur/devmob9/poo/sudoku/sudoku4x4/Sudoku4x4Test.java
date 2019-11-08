package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sudoku4x4Test {

    @Test
    public void TestRemplisVide() {
        Position4x4 p = new Position4x4(0,1);
        Sudoku4x4 s = new Sudoku4x4();

        assertEquals(s.VIDE, s.get(p));

    }

    @Test
    public void TestAdd() {
        Position4x4 p = new Position4x4(2,2);
        Sudoku4x4 s = new Sudoku4x4();

        s.add(p, '1');
        assertEquals('1', s.get(p));

    }

    @Test
    public void TestRemove() {
        Position4x4 p = new Position4x4(1,3);
        Sudoku4x4 s = new Sudoku4x4();

        s.add(p, '1');
        assertEquals('1', s.remove(p));
        assertEquals(s.VIDE, s.get(p));

    }

}