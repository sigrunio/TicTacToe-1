package test.java.is.task.TicTacToe;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.containsString;
import main.java.is.task.TicTacToe.ComputerPlayer;
import main.java.is.task.TicTacToe.Game;
import main.java.is.task.TicTacToe.HumanPlayer;
import main.java.is.task.TicTacToe.TicTacToe;

import org.junit.Test;


public class TicTacToeTest {
		// Test getters and setters


	@Test
	public void testComputerPlayerSetter(){
		TicTacToe ttt =  new TicTacToe();
	//    ttt.initializeTicTacToe();
		ComputerPlayer cpu =  new ComputerPlayer();
		ttt.setComputer(cpu);
		assertEquals(cpu, ttt.getComputer());

	}

	@Test
	public void testComputerPlayerGetter(){
		TicTacToe ttt =  new TicTacToe();
		
		ComputerPlayer cpu =  new ComputerPlayer();
		assertEquals(ttt.getComputer().getClass(),cpu.getClass());
	}


   @Test
	public void testHumanPlayerSetter(){
		TicTacToe ttt =  new TicTacToe();
		HumanPlayer h = new HumanPlayer();
		ttt.setHuman(h);
		assertEquals(h, ttt.getHuman());
	}

	@Test
	public void testHumanPlayerGetter(){
		TicTacToe ttt =  new TicTacToe();
	  //  ttt.initializeTicTacToe();
		HumanPlayer h =  new HumanPlayer();
		assertEquals(ttt.getHuman().getClass(), h.getClass());
	}


	@Test
	public void testGameSetter(){
		TicTacToe ttt =  new TicTacToe();
		Game g = new Game();
		ttt.setGame(g);
		assertEquals(g, ttt.getGame());

	}

	
	@Test
	public void testGameGetter(){
		TicTacToe ttt =  new TicTacToe();
	 //   ttt.initializeTicTacToe();
		Game g =  new Game();
		assertEquals(ttt.getGame().getClass(), g.getClass());

	}
}
