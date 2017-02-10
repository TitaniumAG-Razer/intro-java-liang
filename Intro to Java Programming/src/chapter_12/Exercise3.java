package chapter_12;

import java.util.Scanner;

/** Test the ArrayIndexOutOfBoundException **/

public class Exercise3 {
	public static void main(String[] args) {
		
		int[] newArray = new int[120];
		for (int i = 0; i < newArray.length; i++)
			newArray[i] = (int)(Math.random() * 500);
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("Please enter an array index: ");
				int index = input.nextInt();
				System.out.println(newArray[index]);
				break;
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Error! Out of Bounds!");
				input.nextLine();
			}
		}
		
		input.close();
	}
}
