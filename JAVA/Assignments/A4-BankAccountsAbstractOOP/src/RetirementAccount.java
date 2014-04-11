/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class RetirementAccount extends BankAccount {
	//removed the "currentBalance" variable: redundant - zp 4/4/14
	private double maxBalance;
	private double minimumBalance = 0;
	private double annualIncome;
	private double maxRate;
	private double interestRate;

	private double interestGained;//used and set in the computeInterestAndFees method, is added to the balance passed in
									// and the balance variable will be adjusted

	RetirementAccount(double rate, double balance, double annualIncome){
		setCurrentBalance(balance);
		setMaxBalance(rate, annualIncome);
		setRate(rate);
	}

	private void setRate(double rate) {
		// TODO Auto-generated method stub
		interestRate = rate;
	}

	@Override
	public void computeInterestAndFees()
	{
		computeInterestAndFees(getRate(), getCurrentBalance());
	}

	@Override  //overrides computeInterestAndFees in abstract super class: BankAccount 
	public void computeInterestAndFees(double rate, double balance){ //required for step 3 in the instructions, balance passed in should be balance
		interestGained = balance * rate; //to calculate multiply the balance by the rate then...
		setCurrentBalance(balance + interestGained);//add the interest gained to the balance variable in the account.
	}

	@Override
	public void doTransaction(Transaction action)
	{
		if (action instanceof MonetaryTransaction)
		{
			if (action instanceof Deposit)
			{	
				Deposit d = (Deposit) action;
				if ((getCurrentBalance() + d.amount) < getMaxBalance())
				{
					balance += d.amount;
				}
				else
				{
					throw new IllegalArgumentException("Exceeds maximum balance");
				}	
			}
			else if (action instanceof Withdraw)
			{
				Withdraw w = (Withdraw) action;
				if ((balance - getMinimumBalance()) > w.amount)
				{
					balance -= w.amount;
				}
				else
				{
					throw new IllegalArgumentException("Exceeds minimum balance");
				}
			}
			else if (action instanceof Transfer)
			{
				Transfer t = (Transfer) action;
				doTransaction(new Withdraw(t.amount));
				t.recipient.doTransaction(new Deposit(t.amount));
			}
			else
			{
				//error
				throw new IllegalArgumentException("Unrecognized Transaction type");
			}
		}
		else
		{	//the recompute transaction has been requested
			computeInterestAndFees();
		}
	}

	private double getMinimumBalance() {
		return minimumBalance;
	}

	public void setCurrentBalance(double bal){//takes in a double and sets it to the variable balance
		super.balance = bal;
	}

	public void setMaxBalance(double rate, double annualIncome){
		maxBalance = annualIncome * rate;
	}

	public double getCurrentBalance(){return balance;}

	public double getMaxBalance(){return maxBalance;}

	public double getAnnualIncome(){return annualIncome;}

	public double getMaxRate(){return maxRate;}

	public double getInterestGained(){return interestGained;}
	
	private double getRate() {return interestRate;}

}