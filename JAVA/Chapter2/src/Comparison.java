// Fig. 2.15: Comparison.java
// Compare integers using if statements, relational operators
// and equality operators
import  java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int number1; //first number to compare
		int number2; //second number to compare
		
		System.out.print("Enter first integer: "); //prompt
		number1 = input.nextInt(); // read first integer from the user
		
		System.out.print("Enter second integer: "); //prompt
		number2 = input.nextInt(); // read second integer from the user
		
		if (number1 == number2)//equal
			System.out.printf("%d == %d\n", number1, number2);
		if (number1 != number2)// not equal
			System.out.printf("%d != %d\n", number1, number2);
		if (number1 < number2)//less than
			System.out.printf("%d < %d\n", number1, number2);
		if (number1 > number2)//greater than
			System.out.printf("%d > %d\n", number1, number2);
		if (number1 <= number2)//less than or equal
			System.out.printf("%d <= %d\n", number1, number2);
		if (number1 >= number2)//greater than or equal
			System.out.printf("%d >= %d\n", number1, number2);
		
	}

}
