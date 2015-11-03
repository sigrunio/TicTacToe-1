package main.java.is.task.TicTacToe;

public class Square {
   
    protected int squareNumber;
    protected boolean isMarked;
    protected String currentSquareMark;

    public Square() {
        this.squareNumber = 0;
        this.isMarked = false;
   	    this.currentSquareMark = "-";
    }

    public Square(int number, String mark, boolean isMarked){
        this.squareNumber = number;
        this.currentSquareMark = mark;
        this.isMarked = isMarked;
    }
    
    //The Board field
    public int getSquareNumber() {
        return this.squareNumber;
    }

    public void setSquareNumber(int number){
        this.squareNumber = number;
    }

    // The marked status of a square
    public boolean getMarked(){
        return this.isMarked;
    }

    public void setMarked(boolean isMarked){
        this.isMarked = isMarked;
    }

    // The current marked symbol in the square
    public String getCurrentSquareMark(){
        return this.currentSquareMark;
    }

    public void setCurrentSquareMark(String mark){
        this.currentSquareMark = mark;
    }

}
