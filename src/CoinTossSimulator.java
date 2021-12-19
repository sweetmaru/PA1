// Name: Xiaofeng Luo
// USC NetID: luoxiaof
// CS 455 PA1
// Fall 2021

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
import java.util.Random;


public class CoinTossSimulator {

   private Random generator = new Random();
   private int total;
   private int twoHeads;
   private int twoTails;
   private int headandTail;


   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
      total = 0;
      twoHeads = 0;
      twoTails = 0;
      headandTail = 0;
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {

      int firstCoin = 0;
      int secondCoin = 0;
      total += numTrials;

      // Generate two random numbers from the set {0, 1} to simulate two coin tosses
      for(int i = 1; i <= numTrials; i++){
         firstCoin = generator.nextInt(2);
         secondCoin = generator.nextInt(2);
         if(firstCoin + secondCoin == 2){
            twoHeads ++;
         }
         if(firstCoin + secondCoin == 1){
            headandTail ++;
         }
         if(firstCoin + secondCoin == 0){
            twoTails ++;
         }
      }

   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
      return total;
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
      return twoHeads;
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
      return twoTails;
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
      return headandTail;
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      total = 0;
      twoHeads = 0;
      twoTails = 0;
      headandTail = 0;
   }

}
