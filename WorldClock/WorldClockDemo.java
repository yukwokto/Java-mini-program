
/**
 * The WorldClockDemo class is a demo class that demonstrates the usage of the WorldClock class.
 * @author Kwok To Yu
 * @version 1.0
 */


/**
 * The main method of the WorldClockDemo class.
 * This method creates an instance of the WorldClock class and tests its functionalities.
 *
 * @param args The command-line arguments passed to the program.
 */
public class WorldClockDemo
{
   public static void main(String[] args)
   {
      // test WorldClock
      System.out.println("");
      System.out.println("Testing WorldClock class");
      
      // Set the offset to -4
      int offset = 8;
      System.out.println("Offset: " + offset);
      
      // Create a new WorldClock instance with the specified offset
      WorldClock wclock = new WorldClock(offset);
      
      // Print the hours, minutes, and time of the WorldClock instance
//      System.out.println("Hours: " + wclock.getHours());
//      System.out.println("Minutes: " + wclock.getMinutes());
      System.out.println("Time: " + wclock.getTime());
   }
}