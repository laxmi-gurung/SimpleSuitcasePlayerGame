/************************************************************************************* 
   Name: Laxmi Gurung (4597925) ; Santos Thapa (4598869)
   Date: 6 June 2018
   NIT2112 Assignment 1 - Suitcases and Player Game
**************************************************************************************/
import java.text.*;
import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JFrame implements ActionListener
{
   private JButton b1, b2,b3;
	private JLabel instruction;
	private JTextArea text;
   
   int caseValue, caseBank;
   int [] price = {20, 50, 100};
   int bank1, bank2, bankValue1, bankValue2;
      
	public GamePanel()
	{
   
        b1 = new JButton("Suitcase 1");
        b2 = new JButton("Suitcase 2");
        b3 = new JButton("Suitcase 3");
        
        instruction = new JLabel("Click any Suitcase to commence play.");
        text = new JTextArea(10,10);

      // Setting the layout 
      setLayout(new FlowLayout());
		setTitle("Suitecases and Player Game");
		setSize(275,240);
		setVisible(true);		
      
      // Adding components and setting the action command
		add(b1);
      b1.setActionCommand("case1");
      add(b2);
      b2.setActionCommand("case2");
      add(b3);
      b3.setActionCommand("case3");
      add(instruction);
		add(text); 

		// Action listener for b1, b2 and b3
      b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
      	
	} 
   
   // Action Performed
   public void actionPerformed(ActionEvent e)
	{   
      Random rnd = new Random();
      for (int i = price.length - 1; i>0; i--)
      {
         int index = rnd.nextInt(i+1);
         // Simple Swap
         int a = price[index];
         price[index] = price[i];
         price[i] = a;
         
      }
        // When Suitcase 1 is selected
        if ("case1".equals(e.getActionCommand()))
        {
            b1.setEnabled(false);
            b2.setEnabled(true);
            b3.setEnabled(true);
            
            caseNo1();
        }      
        // When Suitcase 2 is selected
        else if ("case2".equals(e.getActionCommand())) 
        {
            b1.setEnabled(true);
            b2.setEnabled(false);
            b3.setEnabled(true);
            
            caseNo2();
        }     
        // When Suitcase 3 is selected
        else
        {
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(false);
            
            caseNo3();
        }
        
        // Printing player's case and case value
        text.setText("\nPlayer has chosen suitcase " + caseBank +" with value " + caseValue);
        
        // Printing bank cases and their value
        text.append("\n\nThe bank has: \nSuitcase " + bank1 + " with value " + bankValue1 + "\nSuitcase " + bank2 + " with value " + bankValue2);
        
        // Calculating and printing the winner
        if (caseValue == 20 || caseValue == 50)
        {
            text.append("\n\nBanker wins the game");   
        }
        else
        {
            text.append("\n\nPlayer wins the game");
        }

	}
   // Prints suitcases value 
   public void caseNo1()
   {  
      // Case number and its value for the player case
      caseValue = price[0];
      caseBank = 1;
      // Case numbers and its values for the banker cases
      bank1 = 2;
      bank2 = 3;
      bankValue1 = price[1];
      bankValue2 = price[2];
   }
   
   public void caseNo2()
   {
      // Case number and its value for the player case
      caseValue = price[1];
      caseBank = 2;
      // Case numbers and its values for the banker cases
      bank1 = 1;
      bank2 = 3;
      bankValue1 = price[0];
      bankValue2 = price[2];
   }
   
   public void caseNo3()
   { 
      // Case number and its value for the player case
      caseValue = price[2];
      caseBank = 3;
      // Case numbers and its values for the banker cases
      bank1 = 1;
      bank2 = 2;
      bankValue1 = price[0];
      bankValue2 = price[1];
   }
     
}  // End of GamePanel 