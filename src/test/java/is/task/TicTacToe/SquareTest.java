package test.java.is.task.TicTacToe;

import main.java.is.task.TicTacToe.Square;
import org.junit.Test;

import static org.junit.Assert.*;


public class SquareTest {

    @Test
    public void testGetSquareNumber_SquareEmpty_returnZero()  {
        Square s = new Square();

        assertEquals(0, s.getSquareNumber());
    }

    @Test
    public void testGetMarked_SquareEmpty_returnFalse()  {
        Square s = new Square();

        assertFalse(s.getMarked());
    }


    @Test
    public void testSetSquareNumber_SquareNumberIsOne_returnOne() {
        Square s = new Square();
        s.setSquareNumber(1);

        assertEquals(1, s.getSquareNumber());
    }

    @Test
    public void testSetMarked_IsMarkedIsTrue_returnTrue() {
        Square s = new Square();
        s.setMarked(true);

        assertTrue(s.getMarked());
    }

    @Test
    public void testSetCurrentSquareMark_CurrentSquareMarkIsX_returnX() {
        Square s = new Square();
        s.setCurrentSquareMark("X");

        assertEquals("X", s.getCurrentSquareMark());
    }

    @Test
    public void testSetCurrentSquareMark_CurrentSquareMarkIsO_returnO() {
        Square s = new Square();
        s.setCurrentSquareMark("O");

        assertEquals("O", s.getCurrentSquareMark());
    }
}
