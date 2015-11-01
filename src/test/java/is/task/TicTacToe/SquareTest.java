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
}
