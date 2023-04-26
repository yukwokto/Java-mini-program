
/**
 * The Clock class provides methods to retrieve the current time, 
 * including hours and minutes, in string format.
 * @author Kwok To Yu
 * @see java.time.Instant, java.time.LocalDateTime, java.time.ZoneId
 */

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Clock{
	/**
	 * Constructs a Clock object.
	 */
	public Clock() {
	};
	
	/**
	 * Retrieves the current hour as a string.
	 * @return The current hour in string format.
	 */
	public String getHours() {
		// get full information about current time
		String timeString = LocalDateTime.ofInstant(Instant.now(),
                			ZoneId.systemDefault()).toString();
		
		// parse the information into LocalDateTime format
		LocalDateTime dateTime = LocalDateTime.parse(timeString);
		
		// convert int to String
		String hour = Integer.toString(dateTime.getHour());
		
		return hour;
	}
	
	/**
	 * Retrieves the current minute as a string.
	 * @return The current minute in string format.
	 */
	public String getMinutes() {
		// get full information about current time
		String timeString = LocalDateTime.ofInstant(Instant.now(),
                			ZoneId.systemDefault()).toString();
		
		// parse the information into LocalDateTime format
		LocalDateTime dateTime = LocalDateTime.parse(timeString);
		
		// convert int to String
		String minutes = Integer.toString(dateTime.getMinute());
		
		return minutes;
	}
	
	/**
	 * Retrieves the current time, including hours and minutes, in the format of "hour:minute".
	 * 
	 * @return The current time in string format.
	 */
	public String getTime() {
		String hour = getHours();
		String min = getMinutes();
		
		return hour + ":" + min;
	}
}