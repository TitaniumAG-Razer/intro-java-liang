package chapter_12;

/** Check popularity of baby names **/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		String year = input.next();
		System.out.print("Enter gender: ");
		String gender = input.next();
		System.out.print("Enter name: ");
		String name = input.next();
		input.close();
		
		File file = new File("babynamesranking" + year + ".txt");
		
		if (!file.exists()) {
			System.out.println("No record for " + year);
			System.exit(1);
		}
		
		int rank = 0;
		
		try {
			Scanner read = new Scanner(file);
			while (read.hasNext()) {
				String s = read.nextLine();
				String[] temp = s.split(" ");
				if (gender.equalsIgnoreCase("M") && temp[1].contains(name))
					rank = new Integer(temp[0]);
				else if (temp[3].contains(name))
					rank = new Integer(temp[0]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (rank == 0) {
			System.out.println("The name " + name + " is not ranked in year " + year);
		} else {
			System.out.println(name + " is ranked #" + rank + " in year " + year);
		}
	}
}