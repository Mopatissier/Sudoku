package be.technifutur.devmob9.poo.sudoku.sudoku16x16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Position16x16Test {

    @Test
    public void testCreateL1C3() {
        Position16x16 p = new Position16x16(12, 6);
        assertEquals(12, p.getLine());
        assertEquals(6, p.getColumn());
    }

    @Test
    public void testCreateL2C2() {
        Position16x16 p = new Position16x16(3, 15);
        assertEquals(3, p.getLine());
        assertEquals(15, p.getColumn());
    }

    @Test
    public void TestPosition() {
        Position16x16 p = new Position16x16(0, 10);
        assertEquals(10, p.getPos());
    }

    @Test
    public void TestSector1() {
        Position16x16 p = new Position16x16(5, 9);
        assertEquals(6, p.getSector());
    }

    @Test
    public void TestSector2() {
        Position16x16 p = new Position16x16(12, 7);
        assertEquals(13, p.getSector());
    }

    @Test
    public void TestSectorL11C2() {
        Position16x16 p = new Position16x16(11, 2);
        assertEquals(3, p.getLineSector());
        assertEquals(2, p.getColumnSector());
    }

    @Test
    public void TestSectorL8C8() {
        Position16x16 p = new Position16x16(8, 8);
        assertEquals(0, p.getLineSector());
        assertEquals(0, p.getColumnSector());
    }

}