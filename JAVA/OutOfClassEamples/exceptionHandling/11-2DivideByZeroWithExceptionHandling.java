/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  Demonstrates Exception Handling
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling{


	public static int quotient(int num, int den){
		throws ArithmeticException{
			return (num/den);

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;

		do{
			try{
				System.out.print("Please enter an integer");
				int num = scanner.nextInt();

				System.out.print("please enter an integer denominator");
				int den = scanner.nextInt();


				int result = quotient(num, den);
				System.out.printf("\nResult: %d / %d = %d\n", num, den, result);

				continueLoop = false;

			}

			catch (InputMismatchException e){
				System.err.printf("\nException: %s \n", e);
				scanner.nextLine();

				System.out.println("You must enter integers. Please try again.\n");

			}

			catch (ArithmeticException e){
				System.err.printf("\nException: %s \n", e);
				System.out.println("Zero is an invalid denominator. Please try again.\n");

			} while (continueLoop);
		}
	}
}
