package test.java.is.task.tictactoe;

import main.java.is.task.tictactoe.Square;
import org.junit.Test;

import static org.junit.Assert.*;


public class SquareTest {

    @Test
    public void testGetSquareNumber_SquareEmpty_returnZero()  {
        Square s = new Square();

        assertEquals(0, s.getSquareNumber());
    }

}
