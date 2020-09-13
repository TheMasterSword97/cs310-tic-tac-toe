package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
      if(isXTurn == true)
            {
                System.out.println("Player X Turn: ");
            }
      else
            {
                System.out.println("Player O Turn:");
            }
      
      System.out.println("Enter the row and col space with numbers, used spaces to separated the row and col");
      
      Scanner Move = new Scanner(System.in);
      
      int row = Move.nextInt();
      int col = Move.nextInt(); 
      
      
      
      return new TicTacToeMove(row, col);
    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
