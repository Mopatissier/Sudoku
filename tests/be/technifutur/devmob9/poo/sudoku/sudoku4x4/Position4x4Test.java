package be.technifutur.devmob9.poo.sudoku.sudoku4x4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Position4x4Test {

    @Test
    public void testCreateL1C3() {
        Position4x4 p = new Position4x4(1, 3);
        assertEquals(1, p.getLine());
        assertEquals(3, p.getColumn());
    }

    @Test
    public void testCreateL2C2() {
        Position4x4 p = new Position4x4(2, 2);
        assertEquals(2, p.getLine());
        assertEquals(2, p.getColumn());
    }

    @Test
    public void TestPosition() {
        Position4x4 p = new Position4x4(1, 3);
        assertEquals(7, p.getPos());
    }

    @Test
    public void TestSector1() {
        Position4x4 p = new Position4x4(1, 2);
        assertEquals(1, p.getSector());
    }

    @Test
    public void TestSector2() {
        Position4x4 p = new Position4x4(2, 3);
        assertEquals(3, p.getSector());
    }

    @Test
    public void TestSectorL1C3() {
        Position4x4 p = new Position4x4(1, 3);
        assertEquals(1, p.getLineSector());
        assertEquals(1, p.getColumnSector());
    }

    @Test
    public void TestSectorL3C0() {
        Position4x4 p = new Position4x4(3, 0);
        assertEquals(1, p.getLineSector());
        assertEquals(0, p.getColumnSector());
    }

}