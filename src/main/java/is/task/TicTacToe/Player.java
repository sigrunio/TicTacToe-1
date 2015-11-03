package main.java.is.task.TicTacToe;

public class Player {
    protected int score;
    protected String playerMark;

    public Player(){

    }

    public Player(int score, String playerMark){
        this.score = score;
        this.playerMark = playerMark;
    }

    public void incrementScore(){
        this.score += 1;
    }

    public String getPlayerMark() {
        return playerMark;
    }

    public void setPlayerMark(String playerMark) {
        this.playerMark = playerMark;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
