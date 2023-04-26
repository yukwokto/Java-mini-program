
/**
 * Represents a world clock that displays the time in a specified timezone.
 * @author Kwok To Yu
 */

public class WorldClock extends Clock{

	private final static int OTTAWA_ZONE = -4;

	// the timezone offset in hours
	private int timeOffset; 

	/**
	 * Creates a new WorldClock object with the specified timezone offset.
	 *
	 * @param timeOffset the timezone offset in hours
	 */
	public WorldClock(int timeOffset) {
		this.timeOffset = timeOffset;
	}

	/**
	 * Returns the current time in the timezone specified by the WorldClock object.
	 *
	 * @return the current time as a string in the format "HH:mm"
	 */
	@Override
	public String getTime() {
		// calculate timezone difference between Ottawa and the designated area
		int timeZoneDiff = timeOffset - WorldClock.OTTAWA_ZONE;

		// compute the time by adding time difference (either add or substract)
		String hour = Integer.toString(Integer.parseInt(getHours()) + timeZoneDiff);

		// get the hour in integer, 
		// if it is greater than 24, 
		// then minus 24 hours, vice versa
		int theHour = Integer.parseInt(hour);
		if (theHour > 24) {
			theHour -= 24;
		}
		if (theHour < 0) {
			theHour += 24;
		}
		String min = getMinutes();
		String finalTime = Integer.toString(theHour);
		return finalTime + ":" + min;
	}
}