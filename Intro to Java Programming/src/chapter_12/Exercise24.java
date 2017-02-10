package chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/** Create a Large Database of Names, positions, and salaries **/
public class Exercise24 {
	
	public static final int ASSISTANT_MAX = 80000;
	public static final int ASSISTANT_MIN = 50000;
	public static final int ASSOCIATE_MAX = 110000;
	public static final int ASSOCIATE_MIN = 60000;
	public static final int FULL_MAX = 130000;
	public static final int FULL_MIN = 75000;
	
	public static void main(String[] args) {
		
		File file = new File("SalariedEmployees.txt");
		
		if (file.exists()) {
			System.out.println("File already exists, can't write to it.");
			return;
		}
		
		String[] occupation = { "Assistant", "Associate", "Full" };
		DecimalFormat form = new DecimalFormat("#.##");
		
		int randomOccupation = (int)(Math.random() * 3);
		double randomAssistantSalary = 
				(Math.random() * (ASSISTANT_MAX - ASSISTANT_MIN + 1)) + ASSISTANT_MIN;
		double randomAssociateSalary = 
				(Math.random() * (ASSOCIATE_MAX - ASSOCIATE_MIN + 1)) + ASSOCIATE_MIN;
		double randomFullSalary = 
				(Math.random() * (FULL_MAX - FULL_MIN + 1)) + FULL_MIN;
		
		try {
			PrintWriter output = new PrintWriter(file);
			for (int i = 1; i <= 1000; i++) {
				output.write("FirstName" + i + "  LastName" + i 
						+ "  " + occupation[randomOccupation]);
			
			
			switch (randomOccupation) {
			case 0: output.write("  " + form.format(randomAssistantSalary)); break;
			case 1: output.write("  " + form.format(randomAssociateSalary)); break;
			case 2: output.write("  " + form.format(randomFullSalary)); break;
			}
			output.println();
			
			randomOccupation = (int)(Math.random() * 3);
			randomAssistantSalary = 
					(Math.random() * (ASSISTANT_MAX - ASSISTANT_MIN + 1)) + ASSISTANT_MIN;
			randomAssociateSalary = 
					(Math.random() * (ASSOCIATE_MAX - ASSOCIATE_MIN + 1)) + ASSOCIATE_MIN;
			randomFullSalary = 
					(Math.random() * (FULL_MAX - FULL_MIN + 1)) + FULL_MIN;
			}
			output.close();
			System.out.println("File successfully created.");
		}
		catch (IOException e) {
			System.out.println("Can't write to file.");
		}
	}
}
