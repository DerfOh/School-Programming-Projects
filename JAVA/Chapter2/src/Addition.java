// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers
import java.util.Scanner;//program uses class scanner

public class Addition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//create a Scanner to obtain input from the command window
		
		int number1; //first number to add
		int number2; //second number to add
		int sum; //stores the sum of the two numbers
		
		System.out.print("Enter first integer: "); //prompt
		number1 = input.nextInt(); // read first integer from the user
		
		System.out.print("Enter second integer: "); //prompt
		number2 = input.nextInt(); // read second integer from the user
		
		sum = number1  + number2; //adds the integers
		
		System.out.printf("Sum is %d\n", sum); //displays the sum
		//System.out.printf("Sum is %d\n", number1 + number2); //an alternative method where you don't need the sum variable
		
	}

}
