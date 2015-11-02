package main.java.is.task.TicTacToe;

public class TicTacToe{

	// our Game to be run
    protected Game game;
    // our players human and computer
    protected HumanPlayer human;
    protected ComputerPlayer computer;

    // Getters and setters
    public ComputerPlayer getComputer() {
        return computer;
    }

    public void setComputer(ComputerPlayer computer) {
        this.computer = computer;
    }
}