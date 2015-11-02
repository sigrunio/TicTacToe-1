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


	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void runGame(){
		while (!this.getGame().gameOver()){
			int humanPos =  this.getHuman().makeMove();
			while(true){
				if(this.getGame().mapInputToSquare(humanPos,this.getHuman().getPlayerMark())){
					break;
				}
				else {
					humanPos = this.getHuman().makeMove();
				}
			}
			this.getGame().displayBoard();
			// Check if this move resulted in a win
			if(this.getGame().gameOver()){
				System.out.println("Congratulations! You won the computer!");
				this.getHuman().incrementScore();
				break;
			}
			// Make the computer play

			int compPos = this.getComputer().makeMove();
			while(true){
				if(this.getGame().mapInputToSquare(compPos,this.getComputer().getPlayerMark())){
					break;
				}
				else {
					compPos = this.getComputer().makeMove();
				}
			}
			this.getGame().displayBoard();
			if(this.getGame().gameOver()){
				System.out.println("Sorry! The Computer won!");
				this.getComputer().incrementScore();
				break;
			}

			if(this.getGame().checkForTie()){
				System.out.println("The Game resulted in a tie");
			}
		}
	}

	// A main function to run our game
	public static void main(String[] args){
		TicTacToe ttt = new TicTacToe();
		ttt.getGame().displayBoard();

		System.out.println("Human plays as: " + ttt.getHuman().getPlayerMark());
		System.out.println("Computer plays as: " + ttt.getComputer().getPlayerMark());

		ttt.runGame();

		System.out.println("The game ended! The score is:");
		System.out.println("Human: " + ttt.getHuman().getScore()+ " - " +"Computer: " + ttt.getComputer().getScore());

	}
}