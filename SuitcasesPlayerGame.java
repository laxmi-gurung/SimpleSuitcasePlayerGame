/************************************************************************************* 
   Name: Laxmi Gurung (4597925) ; Santos Thapa ()
   Date: 6 June 2018
   NIT2112 Assignment 1 - Suitcases and Player Game
**************************************************************************************/
import java.text.*;
import java.util.*;
import javax.swing.*;
import java.util.Random;

public class SuitcasesPlayerGame
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       // Values for each suitcase
       int[] price= {20, 50, 100};
       
       // Printing the welcome message
       System.out.println("******* Welcome to the Suitcases and Player Game *******");  
       // Prompting user to input the suitcase number
       System.out.print("Please select a suitcase: ");
       int caseNo = scan.nextInt();
       
       /* If user inputs a number greater than 3,
          program assumes that it is suitcase 3. */
       if (caseNo>3)
       {
         caseNo = 3;
       }
       
       // Constructing an object for the game
       Suitcase pickedCase = new Suitcase(caseNo);
       
       // Shuffling the values in price[]
       pickedCase.randomValue(price);
       
       // Getting the caseValue from the Suitcase Class
       int value = pickedCase.caseValue;

       // Printing toScreen from toString
       String playerCase = (pickedCase.toString());
       System.out.println(playerCase);
       
       pickedCase.bankCaseValue(price);
 
       // Printing out the banker's cases and their values
       String bankerCase = pickedCase.bankerCases();
       System.out.println(bankerCase);
       
       Player gameOutcome = new Player(value);
       
       // Printing the winner
       String winner = gameOutcome.winner();
       System.out.println(winner);
    }
}
