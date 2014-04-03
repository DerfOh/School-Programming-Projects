/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class RetirementAccount extends BankAccount {
	private double currentBalance;
	private double maxBalance;
	private double minimumBalance = 0;
	private double annualIncome;
	private double maxRate;

	private double interestGained;//used and set in the computeInterestAndFees method, is added to the balance passed in
									// and the currentBalance variable will be adjusted

	RetirementAccount(double rate, double balance, double annualIncome){
		setCurrentBalance(balance);
		setMaxBalance(rate, annualIncome);
	}

	@Override  //overrides computeInterestAndFees in abstract super class: BankAccount 
	public void computeInterestAndFees(double rate, double balance){ //required for step 3 in the instructions, balance passed in should be currentBalance
		interestGained = balance * rate; //to calculate multiply the balance by the rate then...
		setCurrentBalance(balance + interestGained);//add the interest gained to the currentBalance variable in the account.
	}

	public void setCurrentBalance(double balance){//takes in a double and sets it to the variable currentBalance
		currentBalance = balance;
	}

	public void setMaxBalance(double rate, double annualIncome){
		maxBalance = annualIncome * rate;
	}

	public double getCurrentBalance(){return currentBalance;}

	public double getMaxBalance(){return maxBalance;}

	public double getAnnualIncome(){return annualIncome;}

	public double getMaxRate(){return maxRate;}

	public double getInterestGained(){return interestGained;}


}