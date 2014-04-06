/* Author: 
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class Transfer extends MonetaryTransaction {

	public BankAccount recipient;

	public Transfer(BankAccount to, double amt)
	{
		recipient = to;
		amount = amt;
	}
}
