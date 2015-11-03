package test.java.is.task.TicTacToe;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import static org.hamcrest.CoreMatchers.containsString;

import main.java.is.task.TicTacToe.HumanPlayer;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class HumanPlayerTest {

    // Test if human player has correct mark
    @Test
    public void testPlayerMark(){

        HumanPlayer h = new HumanPlayer();
        assertEquals('X', h.getPlayerMark());
    }

    // Test if human player's score is zero at initialization
    @Test
    public void testZeroScoreAtStart(){
        HumanPlayer h = new HumanPlayer();
        assertEquals(0, h.getScore());
    }

    // Test if it accepts a legal input
    @Test
    public void testAcceptForLegalInput(){
        HumanPlayer h = new HumanPlayer();
        assertEquals(true, h.checkLegalInput("5"));
    }

    // Test if it accepts a non integer input, string (it should not)
    @Test
    public void testAcceptNonIntegerInputString(){
        HumanPlayer h = new HumanPlayer();
        assertEquals(false, h.checkLegalInput("string"));
    }

    // Test if it accepts a non integer input, char (it should not)
    @Test
    public void testAcceptNonIntInputChar(){
        HumanPlayer h = new HumanPlayer();
        assertEquals(false, h.checkLegalInput("G"));

    }

    // Test if it accepts a non integer input, symbol (it should not)
    @Test
    public void testAcceptNonIntInputSymbol(){
        HumanPlayer h = new HumanPlayer();
        assertEquals(false, h.checkLegalInput("#"));

    }

    // Test if it accepts an integer input that is out of range (it should not)
    @Test
    public void testAcceptNIntInputOutOfRange(){
        HumanPlayer h = new HumanPlayer();
        assertEquals(false, h.checkLegalInput("23"));
    }



}
