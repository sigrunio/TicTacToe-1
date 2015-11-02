package main.java.is.task.TicTacToe;

import java.lang.System; 

public class Game {

	private static Square gameBoard[][];

    public Game(){
        initializeBoard();
    }

    public Square[][] getGameBoard() {
        return this.gameBoard;
    }

    public void initializeBoard(){
        int squareNumber = 1;
        this.gameBoard = new Square[3][3];

        for (int i = 0;i < 3 ;i++ ) {
            for (int j = 0;j < 3 ;j++) {
                this.gameBoard[i][j] = new Square(squareNumber,'-',false);
                squareNumber++;
            }
        }
    }

    public void displayBoard(){
        System.out.println("-------------");
        for (int i = 0;i < 3 ;i++ ) {
            System.out.print("| ");
            for (int j = 0;j < 3 ;j++) {
                System.out.print(this.gameBoard[i][j].getCurrentSquareMark() + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Checks all the rows on the board for winning strategy
    public boolean checkRowWin(){
        for (int i = 0; i < 3; i++){
            if (checkSquares(gameBoard[i][0],gameBoard[i][1],gameBoard[i][2])){
                return true;
            }
        }
        return false;
    }

        // A function which returns true if three squares are the same
    public boolean checkSquares(Square sq1, Square sq2, Square sq3){
        return (sq1.getCurrentSquareMark() != '-')  &&
                (sq1.getCurrentSquareMark() == sq2.getCurrentSquareMark()) &&
                (sq2.getCurrentSquareMark() == sq3.getCurrentSquareMark());
    }

    // Checks all the columns on the board for winning strategy
    public boolean checkColumnWin(){
        for (int i = 0; i < 3; i++) {
            if(checkSquares(gameBoard[0][i], gameBoard[1][i],gameBoard[2][i])){
                return true;
            }
        }
        return false;
    }

    // Cheks both the diagonals for a winning strategy
    public boolean checkDiagonalWin(){
        return (checkSquares(gameBoard[0][0],gameBoard[1][1], gameBoard[2][2]) == true) || 
        (checkSquares(gameBoard[0][2], gameBoard[1][1],gameBoard[2][0]) == true);
    }

    public boolean checkForTie(){
        // If all the fields are marked then there was a tie
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!gameBoard[i][j].getMarked()){
                    return false;
                }

            }
        }
        return true;
    }
}