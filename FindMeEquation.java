import java.util.Scanner;

public class FindMeEquation {
/*
 * The purpose of this program is to obtain slope and the equation of the given variables
 */
	public static void main(String[] args) {
		// Creates a new Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first point (x1,y1) :");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		System.out.print("Enter the second point (x2,y2) :");
		double number3 = input.nextDouble();
		double number4 = input.nextDouble();
		// Calculates the slope value
		double slope = (number4-number2)/(number3-number1);
		System.out.println("The slope of the equation is " + slope);
		double intercept = number4 - (number3*slope);
		System.out.println("The equation is y= " + slope+"x "+ intercept);
		 
	}

}
