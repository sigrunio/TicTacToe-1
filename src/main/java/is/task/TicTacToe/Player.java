package main.java.is.task.TicTacToe;

public class Player {
    protected int score;
    protected char playerMark;

    public Player(){

    }

    public Player(int score, char playerMark){
        this.score = score;
        this.playerMark = playerMark;
    }

    public void incrementScore(){
        this.score += 1;
    }

    public char getPlayerMark() {
        return playerMark;
    }

    public void setPlayerMark(char playerMark) {
        this.playerMark = playerMark;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
