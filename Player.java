/************************************************************************************* 
   Name: Laxmi Gurung (4597925) ; Santos Thapa (4598869)
   Date: 6 June 2018
   NIT2112 Assignment 1 - Suitcases and Player Game
**************************************************************************************/
import java.text.*;
import java.util.Scanner;
import java.util.Random;

public class Player 
{
   private int caseValue;
   
   public Player(int caseValueIn)
   {
      caseValue = caseValueIn;
   }
 
   public int getCaseValue()
   {
      return caseValue;
   }
 
   // Selecting and printing the winner
   public String winner()
   {
      if (caseValue == 20 || caseValue == 50)
      {
         String winner = ("\nBanker wins the game");
         return winner;
      }
      else
      {
         String winner = ("\nPlayer wins the game");
         return winner;
      }
    } // End of String winner

}
 
