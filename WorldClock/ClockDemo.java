
/**
 * The ClockDemo class tests the functionality of the Clock class.
 * This class creates a Clock object and calls its methods to demonstrate the following functionality:
 * Retrieving the current hours
 * Retrieving the current minutes
 * Retrieving the current time
 * @author Kwok To Yu
 * @version 1.0
 * @since 2023-03-07
 */

/**
 * The main method creates an instance of the Clock class and calls its methods.
 * @param args The command-line arguments
 */

public class ClockDemo
{
   public static void main(String[] args)
   {
      //test Clock
      System.out.println("Testing Clock class");
      
      //create a clock instance
      Clock clock = new Clock();
      
      //get the current hours
      System.out.println("Hours: " + clock.getHours());
      
      //get the current minutes
      System.out.println("Minutes: " + clock.getMinutes());
      
      //get the current time
      System.out.println("Time: " + clock.getTime());
      
   }
}