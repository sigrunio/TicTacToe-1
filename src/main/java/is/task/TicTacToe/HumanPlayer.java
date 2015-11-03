package main.java.is.task.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;import java.lang.Integer;import java.lang.String;import java.lang.System;


public class HumanPlayer extends Player{

    public HumanPlayer(){
        super(0,"X");
    }


    public boolean checkLegalInput(String s){
        int inputNumber = 0;
        try{
            inputNumber = Integer.parseInt(s);
        }
        catch (Exception parseEx){
            System.out.println("Please enter a NUMBER");
            return false;
        }

        if(!checkInputRange(inputNumber)){
            System.out.println("The number you entered was not int the range 1-9");
            return false;
        }
        return true;
    }

    public boolean checkInputRange(int number){
        // Checks if the number is less than 1 or larger than 9
        return !((number < 1) || (number > 9));
    }

    public boolean makeMove(Game g, String s)
    {
        // check if field is taken
        int position = Integer.parseInt(s);
        return g.mapInputToSquare(position,this.getPlayerMark());

    }
}