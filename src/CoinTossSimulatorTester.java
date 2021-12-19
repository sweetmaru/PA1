// Name: Xiaofeng Luo
// USC NetID: luoxiaof
// CS 455 PA1
// Fall 2021


/**
 * Class CoinTossSimulatorTester
 *
 * This class is a unit test for class CoinTossSimulator. It tests the full functionality
 * of the CoinTossSimulator class.
 */
public class CoinTossSimulatorTester
{
   /**
    * Main method to run this unit test
    *
    * @param args
    */
   public static void main(String[] args) {
      CoinTossSimulator simulator = new CoinTossSimulator();

      System.out.println("After constructor:");
      System.out.println("Number of trials [exp:0]: " + simulator.getNumTrials());
      System.out.println("Two-head tosses: " + simulator.getTwoHeads());
      System.out.println("Two-tail tosses: " + simulator.getTwoTails());
      System.out.println("One-head one-tail tosses: " + simulator.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(simulator.getNumTrials() == simulator.getTwoHeads() + simulator.getHeadTails() + simulator.getTwoTails()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
      System.out.println("");


      simulator.run(1);
      System.out.println("After run(1):");
      System.out.println("Number of trials [exp:1]: " + simulator.getNumTrials());
      System.out.println("Two-head tosses: " + simulator.getTwoHeads());
      System.out.println("Two-tail tosses: " + simulator.getTwoTails());
      System.out.println("One-head one-tail tosses: " + simulator.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(simulator.getNumTrials() == simulator.getTwoHeads() + simulator.getHeadTails() + simulator.getTwoTails()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
      System.out.println("");


      simulator.run(100);
      System.out.println("After run(100):");
      System.out.println("Number of trials [exp:101]: " + simulator.getNumTrials());
      System.out.println("Two-head tosses: " + simulator.getTwoHeads());
      System.out.println("Two-tail tosses: " + simulator.getTwoTails());
      System.out.println("One-head one-tail tosses: " + simulator.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(simulator.getNumTrials() == simulator.getTwoHeads() + simulator.getHeadTails() + simulator.getTwoTails()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
      System.out.println("");


      simulator.run(725);
      System.out.println("After run(725):");
      System.out.println("Number of trials [exp:826]: " + simulator.getNumTrials());
      System.out.println("Two-head tosses: " + simulator.getTwoHeads());
      System.out.println("Two-tail tosses: " + simulator.getTwoTails());
      System.out.println("One-head one-tail tosses: " + simulator.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(simulator.getNumTrials() == simulator.getTwoHeads() + simulator.getHeadTails() + simulator.getTwoTails()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
      System.out.println("");


      simulator.reset();
      System.out.println("After reset:");
      System.out.println("Number of trials [exp:0]: " + simulator.getNumTrials());
      System.out.println("Two-head tosses: " + simulator.getTwoHeads());
      System.out.println("Two-tail tosses: " + simulator.getTwoTails());
      System.out.println("One-head one-tail tosses: " + simulator.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(simulator.getNumTrials() == simulator.getTwoHeads() + simulator.getHeadTails() + simulator.getTwoTails()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
      System.out.println("");



      simulator.run(1000);
      System.out.println("After run(1000):");
      System.out.println("Number of trials [exp:1000]: " + simulator.getNumTrials());
      System.out.println("Two-head tosses: " + simulator.getTwoHeads());
      System.out.println("Two-tail tosses: " + simulator.getTwoTails());
      System.out.println("One-head one-tail tosses: " + simulator.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(simulator.getNumTrials() == simulator.getTwoHeads() + simulator.getHeadTails() + simulator.getTwoTails()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
      System.out.println("");


      simulator.run(1);
      System.out.println("After run(1):");
      System.out.println("Number of trials [exp:1001]: " + simulator.getNumTrials());
      System.out.println("Two-head tosses: " + simulator.getTwoHeads());
      System.out.println("Two-tail tosses: " + simulator.getTwoTails());
      System.out.println("One-head one-tail tosses: " + simulator.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(simulator.getNumTrials() == simulator.getTwoHeads() + simulator.getHeadTails() + simulator.getTwoTails()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
      System.out.println("");

      System.out.println("[ . . . output for other tests would be here . . .]");
   }
}
