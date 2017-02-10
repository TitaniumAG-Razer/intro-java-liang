package chapter_10;

/** A class to represent time elapsed from a given point **/
public class Time {

	private int hour;
	private int minute;
	private int second;
	
	// Constructor that sets private data fields to current time
	Time() {
		// Obtain number of milliseconds since midnight, Jan 1, 1970.
		long milliseconds = System.currentTimeMillis();
		
		long totalSeconds = milliseconds / 1000;
		second = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		hour = (int)(totalHours % 24);
	}
	
	// Constructor that sets private data fields to elapsed time in ms since Jan 1, 1970
	Time(long milliseconds) {
		long totalSeconds = milliseconds / 1000;
		second = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		hour = (int)(totalHours % 24);
	}
	
	Time(int hour, int minute, int second) {
		if (!setHour(hour))
			this.hour = 12;
		if (!setMinute(minute))
			this.minute = 0;
		if (!setSecond(second))
			this.second = 0;
	}
	
	// Getters
	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public int getSecond() { return second; }
	
	// Mutators
	public boolean setHour(int hour) {
		if (hour < 0)
			return false;
		this.hour = hour;
		return true;
	}
	
	public boolean setMinute(int minute) {
		if (minute < 0)
			return false;
		this.minute = minute;
		return true;
	}
	
	public boolean setSecond(int second) {
		if (second < 0)
			return false;
		this.second = second;
		return true;
	}
	
	public boolean setTime(long elapsedTime) {
		if (elapsedTime < 0)
			return false;
		
		long totalSeconds = elapsedTime / 1000;
		second = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		hour = (int)(totalHours % 24);
		
		return true;
	}
	
	public String toString() {
		return (hour + ": " + minute + ": " + second + " GMT");
	}
}
