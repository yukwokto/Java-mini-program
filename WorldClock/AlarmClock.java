
/**
 * AlarmClock class extends Clock and adds functionality 
 * to set an alarm and check whether the current time matches the alarm time.
 * @author Kwok To Yu
 * @see java.time.LocalTime
*/


import java.time.LocalTime;

public class AlarmClock extends Clock{
	private int alarmHour;
	private int alarmMin;
	
	/**
	 * This method sets the alarm time.
	 * @param hours the hour of the alarm
	 * @param minutes the minute of the alarm
	 */
	public void setAlarm(int hours, int minutes) {
		alarmHour = hours;
		alarmMin = minutes;
	}
	
	/**
	 * This method overrides the getTime method in the parent Clock class.
	 * It checks whether the current time matches the alarm time.
	 * @return a String representation of the current time and 
	 *          whether there is an alarm set or not.
	 */
	@Override
	public String getTime() {
		// parse the current hour and minute from the Clock's getHours and getMinutes methods
		int currentHour = Integer.parseInt(getHours());
		int currentMin = Integer.parseInt(getMinutes());
		
		// create LocalTime objects for the current time and the alarm time
		LocalTime currentTime = LocalTime.of(currentHour, currentMin);
		LocalTime AlarmTime = LocalTime.of(alarmHour, alarmMin);
		
		// compare the current time to the alarm time
		int difference = currentTime.compareTo(AlarmTime);
		
		// if the current time is later than the alarm time, 
		// reset the alarm time and return the current time with "Alarm" appended
		if (difference > 0) {
		    alarmHour = 0;
		    alarmMin = 0;
		    return currentHour + ":" + currentMin + " Alarm";
		    
		// if the current time is earlier than the alarm time, 
		// return the current time with "No Alarm" appended
		} else if (difference < 0) {
			return currentHour + ":" + currentMin + " No Alarm";
		   
		// if the current time is the same as the alarm time, 
		// return "Current time is Alarm Time!"
		} else {
		    return "Current time is Alarm Time!";
		}
	}
}