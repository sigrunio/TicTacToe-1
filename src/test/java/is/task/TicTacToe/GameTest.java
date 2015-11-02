package test.java.is.task.TicTacToe;

import main.java.is.task.TicTacToe.Game;
import main.java.is.task.TicTacToe.Square;
import org.junit.Test;

import static org.junit.Assert.*;


public class GameTest {

	@Test
    public void testGameInitializeBoard() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        assertEquals(1, temp[0][0].getSquareNumber());
        assertEquals(2, temp[0][1].getSquareNumber());
        assertEquals(3, temp[0][2].getSquareNumber());
        assertEquals(4, temp[1][0].getSquareNumber());
        assertEquals(5, temp[1][1].getSquareNumber());
        assertEquals(6, temp[1][2].getSquareNumber());
        assertEquals(7, temp[2][0].getSquareNumber());
        assertEquals(8, temp[2][1].getSquareNumber());
        assertEquals(9, temp[2][2].getSquareNumber());

        assertEquals('-', temp[0][0].getCurrentSquareMark());
        assertEquals('-', temp[0][1].getCurrentSquareMark());
        assertEquals('-', temp[0][2].getCurrentSquareMark());
        assertEquals('-', temp[1][0].getCurrentSquareMark());
        assertEquals('-', temp[1][1].getCurrentSquareMark());
        assertEquals('-', temp[1][2].getCurrentSquareMark());
        assertEquals('-', temp[2][0].getCurrentSquareMark());
        assertEquals('-', temp[2][1].getCurrentSquareMark());
        assertEquals('-', temp[2][2].getCurrentSquareMark());

        assertFalse(temp[0][0].getMarked());
        assertFalse(temp[0][1].getMarked());
        assertFalse(temp[0][2].getMarked());
        assertFalse(temp[1][0].getMarked());
        assertFalse(temp[1][1].getMarked());
        assertFalse(temp[1][2].getMarked());
        assertFalse(temp[2][0].getMarked());
        assertFalse(temp[2][1].getMarked());
        assertFalse(temp[2][2].getMarked());
    }

    @Test
    public void testCheckRowWin_AllSquaresAreXInRow1_ReturnTrue() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[0][1].setCurrentSquareMark('X');
        temp[0][2].setCurrentSquareMark('X');

        assertTrue(g.checkRowWin());
    }





}