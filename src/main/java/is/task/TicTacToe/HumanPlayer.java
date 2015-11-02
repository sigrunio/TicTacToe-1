package main.java.is.task.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;import java.lang.Integer;import java.lang.String;import java.lang.System;
import java.io.ByteArrayInputStream;

public class HumanPlayer extends Player{

    public HumanPlayer(){
        super(0,'X');
    }

    protected String move;

   public int askMove(){
        // Instantiate a new reader to get input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a number from 1-9");
        // Try to get the next move from user input
        int positionNumber = 0;

        String s = "";
        try
        {
            String move = this.move;
            ByteArrayInputStream in = new ByteArrayInputStream(move.getBytes());
            System.setIn(in);
            s = br.readLine();
            System.setIn(System.in);
//            positionNumber = Integer.valueOf(s);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        while(!checkLegalInput(s)){
            System.out.println("Please enter a number from 1-9");
            try
            {
                String move = this.move;
                ByteArrayInputStream in = new ByteArrayInputStream(move.getBytes());
                System.setIn(in);
                s = br.readLine();
                System.setIn(System.in);

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        positionNumber = Integer.valueOf(s);
        return positionNumber;

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

    public int makeMove()
    {
        int position;
        position = askMove();
        if (position == 0){
            makeMove();
        }

        return position;
    }

    public void setMove(String move) { this.move = move; }

}

