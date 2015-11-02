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

}