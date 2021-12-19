// Name: Xiaofeng Luo
// USC NetID: luoxiaof
// CS 455 PA1
// Fall 2021


import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.lang.Math;


/**
 * class CoinSimComponent
 *
 * This class initializes the data of bars and labels shown on the display window.
 */
public class CoinSimComponent extends JComponent
{
   private static final int WIDTH_OF_BAR = 70;
   private static final int BUFFER_SPACE = 85;
   private static final double PERCENT = 100.0;
   private CoinTossSimulator simulator = new CoinTossSimulator();
   private int total; // The total number of trials
   private int twoHeads;
   private int headandTails;
   private int twoTails;

   /**
    * Class constructor
    *
    * Initialize the data of trials, run the simulation and give the results
    *
    * @param num Number of trials
    */
   public CoinSimComponent(int num){
      simulator.run(num);
      total = simulator.getNumTrials();
      twoHeads = simulator.getTwoHeads();
      headandTails = simulator.getHeadTails();
      twoTails = simulator.getTwoTails();
   }


   /**
    * This method draws the three labeled bars with the given data.
    *
    * @param g The graphics context
    */
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;

      // Initialize the labels
      String labelOfTwoHeads = "Two Heads: " + twoHeads + " (" + (int)Math.round(twoHeads * PERCENT / total) + "%)";
      String labelOfHeadandTail = "A Head and a Tail: " + headandTails + " (" + (int)Math.round(headandTails * PERCENT / total) + "%)";
      String labelOfTwoTails = "Two Tails: " + twoTails + " (" + (int)Math.round(twoTails * PERCENT / total) + "%)";

      // Calculate the needed parameters and data for drawing the bars
      int bottom = getHeight() - BUFFER_SPACE;
      int left = (int)(getWidth() / 2.0 - WIDTH_OF_BAR / 2.0);
      int evenSpace = (int)(getWidth() / 4.0); // The even space between two bars
      double scale = (getHeight() - BUFFER_SPACE * 2) / (double)total;

      // Construct three bar objects
      Bar barOfTwoHeads = new Bar(bottom, (left - evenSpace), WIDTH_OF_BAR, twoHeads, scale, Color.BLUE, labelOfTwoHeads);
      Bar barOfHeadandTail = new Bar(bottom, left, WIDTH_OF_BAR, headandTails, scale, Color.LIGHT_GRAY, labelOfHeadandTail);
      Bar barOfTwoTails = new Bar(bottom, (left + evenSpace), WIDTH_OF_BAR, twoTails, scale, Color.PINK, labelOfTwoTails);

      // Draw the three bars
      barOfTwoHeads.draw(g2);
      barOfHeadandTail.draw(g2);
      barOfTwoTails.draw(g2);
   }
}
