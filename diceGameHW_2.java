// week 7 - hw 2
// implement an odd/even game using objects
// design objects using UML before implementation
// make sure to include constructor

import java.util.Scanner;

public class diceGameHW_2 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int compNum = 0;
		int guess = 0;
		int again = 0;
		UML s1 = new UML (compNum);
		
		System.out.println("Guess if the number is odd or even");
		
		do{
			for (int i = 1; i < 4; i++)
			{
				System.out.printf("Game %d\n",i);
		
				System.out.println("Even = 1, Odd = 0");
				guess = input.nextInt();
				compNum = s1.getRandomNumber(compNum);
		
				if (guess == 1 && compNum % 2 == 0)
				{
					System.out.println("You win!");
				}
				if (guess == 1 &&  compNum % 2 != 0)
				{
					System.out.println("Sorry, you lose");
				}
				if (guess  == 0 && compNum % 2 == 1)
				{
					System.out.println("You win!");
				}
				if (guess == 0 && compNum % 2 != 1)
				{
					System.out.println("You win!");
				}
			}
				System.out.println("Play again? Yes = 1, No = 0 ");
				again = input.nextInt();
				
				if (again == 0)
				{
					System.out.println("Thanks for playing!");
				}
		}while (again == 1);
	}
}