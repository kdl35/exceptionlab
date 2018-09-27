import java.util.*;
import java.util.Scanner;

public class Driver {
   public static void main (String[] args)
   {
      Driver d = new Driver();
      Scanner keyboard = new Scanner(System.in);
      int userInput;
      
      while(true){
         try
         {
            userInput = d.getMilesFromUser(keyboard);
            userInput = d.getGallonsFromUser(keyboard);
         }
         catch (NonPositiveIntegerException e)
         {
            System.out.println("Negative value detected");
         }
         catch (Exception e)
         {
            System.out.println(e.getMessage());
            break;
         }
         finally
         {
            displayAvg(totalMiles, totalGallons);
            System.out.println("-----");
         }
      }
   }
    public String displayAvg(int totalMiles, int totalGallons)
   {
      int avg = totalMiles/totalGallons;
      return "Average miles per gallon: (" + totalMiles + ")/(" + totalGallons + ") = " + avg;
   }
   
   public int getMilesFromUser (Scanner keyboard) throws Exception
   {
      int i,j;
      
      System.out.print("Enter miles driven on this tank: ");
      int input = keyboard.nextInt();
      this.checkNonNegativeMiles(input);

      return input;
   }
   public int getGallonsFromUser (Scanner keyboard) throws Exception
   {
    System.out.print("Enter number of gallons: ");
      int input2 = keyboard.nextInt();
      this.checkNonNegativeGallons(input2);
      
      return input2;
   }
   
   private void checkNonNegativeMiles(int input)   
   {
      if (input < 0)
      {
         System.out.println("hello");
      }
      else
      {
         int totalMiles = 0;
         totalMiles = totalMiles + input;
         
      }
   }
     private void checkNonNegativeGallons(int input)   
   {
      if (input < 0)
      {
         System.out.println("hello");
      }
      else
      {
         int totalGallons = 0;
         totalGallons = totalGallons + input;
         
      }
   }
   
   
  
  
}