
/**
 * The ClocksDemo class demonstrates the usage of the Clock, WorldClock, and AlarmClock classes
 * by creating objects of these classes and storing them in an array, 
 * and printing their time and class name.
 * @author Kwok To Yu
 * @version 1.0
 * @since 2023-03-14
 */


public class ClocksDemo {
	/**
	 * The main method creates objects of the Clock, WorldClock, and AlarmClock classes
	 * and stores them in an array. It then iterates through the array and prints the time
	 * and class name of each object.
	 * 
	 * @param args an array of string arguments
	 */
	public static void main(String[] args) {
		
		// create objects of Clock, WorldClock, and AlarmClock
		Clock generalClock = new Clock();
		WorldClock worldClock = new WorldClock(-4);
		
		// alarm clock will show alarm all the time if we do not provide a value,
		// since default of int is 0.
		AlarmClock alarmClock = new AlarmClock();
		// alarmClock.setAlarm(12, 0);
		
		//create a clock array
		Clock[] clockArray = {generalClock, worldClock, alarmClock};
		
		
		for (Clock clock: clockArray) {
			System.out.println(clock.getTime());
			System.out.println(clock.getClass().getSimpleName());
		}
	}
}