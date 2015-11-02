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

    public String displayBoard(){
        String board = "";
        board = strCat(board, "-------------<\br>");
        for (int i = 0;i < 3 ;i++ ) {
            board = strCat(board, "| ");
            for (int j = 0;j < 3 ;j++) {
                board = strCat(board, this.gameBoard[i][j].getCurrentSquareMark() + " | ");
            }
            board = strCat(board, "<\br>");
            board = strCat(board, "-------------<\br>");
        }
        System.out.print(board);
        return board;
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

    // map the input
    public boolean mapInputToSquare(int squarePosition, char playerMark){
        // loop through the squares and check each squares position
        // if the square is free we mark it if not we ask the user again for input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                // if this is the square we want to mark check if it's free
                if(gameBoard[i][j].getSquareNumber() == squarePosition){
                    if(gameBoard[i][j].isMarked){
                  
                        System.out.println("This field is taken");
                        return false;
                    } // if it isn't marked we can mark it with our player and return true
                    else{
                        gameBoard[i][j].setCurrentSquareMark(playerMark);
                        System.out.println(gameBoard[i][j].getCurrentSquareMark());
                        gameBoard[i][j].setMarked(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean gameOver(){
        return checkColumnWin() || checkRowWin() || checkDiagonalWin();
    }

    private String strCat(String board, String addBoard){
        //string cat function
        board += addBoard;
        return board;
    }
}