package chapter_9;

public class StopWatch {
	
	private long startTime;
	private long endTime;
	
	// Getters
	public double getStartTime() { return startTime; }
	public double getEndTime() { return endTime; }
	
	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void end() {
		endTime = System.currentTimeMillis();
	}
	
	public double getElapsedTime() {
		return endTime - startTime;
	}
}
