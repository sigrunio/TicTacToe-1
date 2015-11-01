package test.java.is.task.TicTacToe;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.containsString;

import main.java.is.task.TicTacToe.ComputerPlayer;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ComputerPlayerTest {

    // Test if human player has correct mark
    @Test
    public void testPlayerMark(){
        ComputerPlayer c = new ComputerPlayer();
        assertEquals('O', c.getPlayerMark());
    }

    // Test if human player's score is zero at initialization
    @Test
    public void testZeroScoreAtStart(){
        ComputerPlayer c = new ComputerPlayer();
        assertEquals(0, c.getScore());
    }

    // Test if move is in range
    @Test
    public void testIfMoveIsInRange(){
        ComputerPlayer c = new ComputerPlayer();
        assertEquals(true, c.getRandomNumber()<10);
        assertEquals(true, c.getRandomNumber()>0);
    }

}
