package be.technifutur.devmob9.poo.sudoku.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueSetTest {

    @Test
    public void testNewValueSetIsEmpty(){
        assertTrue(new ValueSet().isEmpty());
    }

    @Test
    public void testNewValueSetAdd1(){
        ValueSet set = new ValueSet();

        assertEquals(0, set.size());
        assertTrue(set.add('1'));
        assertFalse(set.isEmpty());
        assertEquals(1, set.size());
        assertTrue(set.contains('1'));
        assertTrue(set.add('2'));
        assertEquals(2, set.size());
        assertTrue(set.remove('2'));
        assertTrue(set.remove('1'));
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());

    }

    @Test
    public void testNewValueSetAdd2(){
        ValueSet set = new ValueSet();

        assertEquals(0, set.size());
        assertTrue(set.add('a'));
        assertFalse(set.isEmpty());
        assertEquals(1, set.size());
        assertTrue(set.contains('a'));
        assertTrue(set.add('d'));
        assertEquals(2, set.size());
        assertTrue(set.remove('d'));
        assertFalse(set.remove('d'));
        assertTrue(set.remove('a'));
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());

    }
}