package be.technifutur.devmob9.poo.sudoku.sudoku9x9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Position9x9Test {

    @Test
    public void testCreateL6C2() {
        Position9x9 p = new Position9x9(6, 2);
        assertEquals(6, p.getLine());
        assertEquals(2, p.getColumn());
    }

    @Test
    public void testCreateL0C8() {
        Position9x9 p = new Position9x9(0, 8);
        assertEquals(0, p.getLine());
        assertEquals(8, p.getColumn());
    }

    @Test
    public void TestPosition() {
        Position9x9 p = new Position9x9(5, 6);
        assertEquals(51, p.getPos());
    }

    @Test
    public void TestSector1() {
        Position9x9 p = new Position9x9(3, 7);
        assertEquals(5, p.getSector());
    }

    @Test
    public void TestSector2() {
        Position9x9 p = new Position9x9(0, 5);
        assertEquals(1, p.getSector());
    }

    @Test
    public void TestSectorL4C3() {
        Position9x9 p = new Position9x9(4, 3);
        assertEquals(1, p.getLineSector());
        assertEquals(0, p.getColumnSector());
    }

    @Test
    public void TestSectorL8C2() {
        Position9x9 p = new Position9x9(8, 2);
        assertEquals(2, p.getLineSector());
        assertEquals(2, p.getColumnSector());
    }

}