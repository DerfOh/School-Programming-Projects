/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function: Sets up a savings class with the according methods and variables.
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class SavingsAccount extends BankAccount {
	private double interestRate;
	//removed the "currentBalance" variable: redundant - zp 4/4/14
	private double interestGained; //computed by the computeInterestAndFees function
	private double minimumBalance; //can be set to anything above or including zero

	SavingsAccount(double rate, double balance, double minimum){
		setInterestRate(rate);
		setCurrentBalance(balance);
		setMinimumBalance(minimum);//for step 4 in the instructions
		computeInterestAndFees(interestRate, currentBalance);
	}

	SavingsAccount(double rate, double balance){//minimum isn't specified: use zero
		setInterestRate(rate);
		setCurrentBalance(balance);
		setMinimumBalance(0);//minimum isn't specified: use zero
		computeInterestAndFees(interestRate, currentBalance);
	}

	@Override  //overrides computeInterestAndFees in abstract super class: BankAccount 
	public void computeInterestAndFees(double rate, double balance){ //required for step 3 in the instructions
		interestGained = balance * rate; //to calculate multiply the balance by the rate then...
		setCurrentBalance(balance + interestGained);//add the interest gained to the balance in the account.
	}

	public void setInterestRate(double rate){
		interestRate = rate;
	}

	public void setCurrentBalance(double balance){
		currentBalance = balance;
	}

	public void setMinimumBalance(double minimum){
		minimumBalance = minimum;
	}

	public double getInterestRate(){return interestRate;}

	public double getCurrentBalance(){return currentBalance;}

	public double getInterestGained(){return interestGained;}

	public double getMinimumBalannce(){return minimumBalance;}

}
