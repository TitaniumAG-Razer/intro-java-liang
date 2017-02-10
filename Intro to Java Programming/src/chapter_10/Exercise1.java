package chapter_10;

/** This method tests the Time Class **/
public class Exercise1 {
	public static void main(String[] args) {
		
		Time currentTime = new Time();
		Time testTime = new Time(555550000);
		
		System.out.println("Current time is " + currentTime.toString());
		System.out.println("555550000 milliseconds after Jan 1, 1970 is " +
				testTime.toString());
	}
}
