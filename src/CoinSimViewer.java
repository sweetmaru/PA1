// Name: Xiaofeng Luo
// USC NetID: luoxiaof
// CS 455 PA1
// Fall 2021


import javax.swing.JFrame;
import java.util.Scanner;


/**
 * class CoinSimViewer
 *
 * This class prompts for a number of trials and does an error-checking
 * for that number. It creates the JFrame containing the CoinSimComponent.
 */
public class CoinSimViewer
{
   private static final int WINDOW_WIDTH = 800;
   private static final int WINDOW_HEIGHT = 500;

   /**
    * Main method to prompt for the number of trials and do the error-checking,
    * also create the JFrame to give the display window
    *
    * @param args
    */
   public static void main(String[] args) {
      JFrame frame = new JFrame();

      // Set the frame size as 500 tall by 800 wide pixel, the frame title and the default close operation
      frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      frame.setTitle("CoinSim");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Prompt for the trials input
      System.out.print("Enter number of trials: ");
      Scanner in = new Scanner(System.in);
      int numTrials = in.nextInt();

      // Error checking
      while(numTrials <= 0){
         System.out.println("ERROR: Number entered must be greater than 0.");
         System.out.print("Enter number of trials: ");
         numTrials = in.nextInt();
      }

      // Pass the input to CoinSimComponent constructor and show the simulation results on the window
      CoinSimComponent component = new CoinSimComponent(numTrials);
      frame.add(component);
      frame.setVisible(true);

   }

}
