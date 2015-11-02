package main.java.is.task.TicTacToe;

public class TicTacToe{

	// our Game to be run
    protected Game game;
    // our players human and computer
    protected HumanPlayer human;
    protected ComputerPlayer computer;
    

	public TicTacToe() {
        // instantiate a game
        this.game = new Game();
        this.human = new HumanPlayer();
        this.computer = new ComputerPlayer();

    }

    // Getters and setters
    public ComputerPlayer getComputer() {
        return computer;
    }

    public void setComputer(ComputerPlayer computer) {
        this.computer = computer;
    }

    public HumanPlayer getHuman() {
        return human;
    }

    public void setHuman(HumanPlayer human) {
        this.human = human;
    }

}