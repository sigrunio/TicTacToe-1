package main.java.is.task.TicTacToe;

import java.util.Random;

public class ComputerPlayer extends Player{

    public ComputerPlayer(){
        super(0,"O");
    }


    public int getRandomNumber(){
        Random rn = new Random();
        return rn.nextInt(9) + 1;
    }

    public int makeMove(){
        // get the position that the computer is going to move to
        return getRandomNumber();


        // check if that position is taken and if not make the move
    }
}