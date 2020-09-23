/************************************************************************************* 
   Name: Laxmi Gurung (4597925) ; Santos Thapa (4598869)
   Date: 6 June 2018
   NIT2112 Assignment 1 - Suitcases and Player Game
**************************************************************************************/
import java.text.*;
import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class Suitcase
{
   private int[] price;
   private int caseNo;
   int caseValue;
   int bank1, bank2, bankValue1, bankValue2;
   
   // Constructor with one parameter: case number
   public Suitcase(int caseNoIn)
   {
      caseNo = caseNoIn;
      caseValue = 0;
   }
   // Method getCaseNo 
   public int getCaseNo()
   {
      return caseNo;
   }
   // Method randomValue with single parameter: price[]
   // Shuffles the values in the array price[]
   public void randomValue(int price[])
   {   
      // Generating a random array number: i
      Random rnd = new Random();
      for (int i = price.length - 1; i>0; i--)
      {
         int index = rnd.nextInt(i+1);
         // Simple Swap
         int a = price[index];
         price[index] = price[i];
         price[i] = a;
         
      }
      caseValue = price[caseNo-1];
   }
   
   // Method getCaseValue
   public int getCaseValue()
   {
      return caseValue;
   }
   
   // Method playerCase 
   public String toString()
   {
      // Creaing a string: toScreen
      String toScreen = "\nPlayer has chosen suitcase " + caseNo + " with value " + caseValue; 
      return toScreen;
   }
   
   // Selects the case number the player selected and stores the banker's case nos and valued
   public void bankCaseValue(int price[])
   {
      // If suitcase 1 is picked
      if(caseNo == 1)
      {
         bank1 = 2;
         bank2 = 3;
         bankValue1 = price[1];
         bankValue2 = price[2];
      }
      // If suitcase 2 is picked
      else if (caseNo == 2)
      {
         bank1 = 1;
         bank2 = 3;
         bankValue1 = price[0];
         bankValue2 = price[2];
      }
      // If suitcase 3 is picked
      else
      {
         bank1 = 1;
         bank2 = 2;
         bankValue1 = price[0];
         bankValue2 = price[1];
      }
   
   } // End of bankCaseValue method
   
   // Prints banker's cases and its value
   public String bankerCases()
   {
      String bankCase = ("\nThe bank has: \nSuitcase " + bank1 + " with value " + bankValue1 + "\nSuitcase " + bank2 + " with value " + bankValue2);
      return bankCase;
   }
     
} // End of Siutcase class

