package chapter_3;

/**
 * A game of rock, paper, and scissor.
 * @author Kevin
 */
import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {

		System.out.println("Scissor = 0; Rock = 1; Paper = 2");
		System.out.print("Rock, Paper, or Scissors? Enter a value: ");
		
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		
		if ( !(user == 0 || user == 1 || user == 2) )
			System.out.println("Invalid input!");
		else {
			int computer = (int)(Math.random() * 3);
			
			if (user == computer)
				System.out.println("It is a draw.");
			else if (user == 0 && computer == 1)
				System.out.println("Computer is rock, and you chose scissor. You lose!");
			else if (user == 0 && computer == 2)
				System.out.println("Computer is paper, and you chose scissor. You win!");
			else if (user == 1 && computer == 0)
				System.out.println("Computer is scissor, and you chose rock. You win!");
			else if (user == 1 && computer == 2)
				System.out.println("Computer is paper, and you chose rock. You lose!");
			else if (user == 2 && computer == 0)
				System.out.println("Computer is scissor, and you chose paper. You lose!");
			else 
				System.out.println("Computer is rock, and you chose paper. You win!");
			
			input.close();
						
		}
	}
}
