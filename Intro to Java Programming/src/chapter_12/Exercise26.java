package chapter_12;

import java.io.File;
import java.util.Scanner;

/** Create a directory **/
public class Exercise26 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		File file;
		
		System.out.println("Enter the directory you wish to create: ");
		String dir = input.next();
			
		file = new File(dir);
		
		if (file.mkdir()) {
			System.out.println("Directory created successfully.");
		}
		else
			System.out.println("Directory already exists.");
		
		input.close();
	}
}
