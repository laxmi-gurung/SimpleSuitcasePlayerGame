/************************************************************************************* 
   Name: Laxmi Gurung (4597925) ; Santos Thapa (4598869)
   Date: 6 June 2018
   NIT2112 Assignment 1 - Suitcases and Player Game
**************************************************************************************/
import javax.swing.*;

public class DisplayGame{

   public static void main(String[] args)
   { 
      JFrame w1 = new JFrame("Suitcases and Player Game");
      
      GamePanel myGamePanel = new GamePanel( );
      w1.add (myGamePanel);
      
      w1.setSize(275, 240);
      
      w1.setVisible(true);
      
      w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }//end main
   
}//end class