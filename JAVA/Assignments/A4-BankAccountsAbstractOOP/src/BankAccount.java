/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public abstract class BankAccount {

	protected double balance;
	protected double amount;

	//made the below methods abstract, as was discussed in class - zp 4/4/14

	public abstract void computeInterestAndFees();

	public abstract void computeInterestAndFees(double rate, double balance);

	public abstract void doTransaction(Transaction action) throws IllegalArgumentException;

	public abstract double getCurrentBalance();

}
