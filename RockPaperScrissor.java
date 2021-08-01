import java.util.Scanner;
public class RockPaperScrissor {
	/*
	 * This program is the simple game called Rock Paper Scrissor. 
	 * To play the game you should run and enter a number between 0 and 3.
	 */
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double cnumber = (int)Math.random()*3;
		System.out.print("For scrissor enter(0), For rock enter(1), For paper enter(2): ");
		int usernumber = input.nextInt();
		if (cnumber == 0)
			System.out.print("Computer is scrissor. ");
		if (cnumber == 1)
			System.out.print("Computer is rock. ");
		if (cnumber == 2)
			System.out.print("Computer is paper. ");
		switch (usernumber) {
		case 0: 
			if (cnumber == 0)
				System.out.println("Nobody won!");
			if (cnumber == 1)
				System.out.println("Rock breaks the scrissor. You lost!");
			if (cnumber == 2)
				System.out.println("Scrissor cuts paper. You won!");
			break ;
		case 1:
			if (cnumber == 0)
				System.out.println("Rock breaks the scrissor. You won! ");
			if (cnumber == 1)
				System.out.println("Nobody won!");
			if (cnumber == 2)
			System.out.println("Paper covers rock. You lost!");
			break ;
		case 2:
			if (cnumber == 0)
				System.out.println("Scrissor cuts paper. You lost!");
			if (cnumber == 1)
				System.out.println("Paper covers rock. You won!");
			if (cnumber == 2)
			System.out.println("Nobody won!");
			break ;
		default: 
			System.out.println("Invalid input!!!");
			break ;
		}
		input.close();
	}
}
