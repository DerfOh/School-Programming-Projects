/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class SavingsAccount extends BankAccount {
	private double interestRate;
	private double currentBalance;
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

	public void getInterestRate(){return interestRate;}

	public void getCurrentBalance(){return currentBalance;}

	public void getInterestGained(){return interestGained;}

	public void getMinimumBalannce(){return minimumBalance;}

}
