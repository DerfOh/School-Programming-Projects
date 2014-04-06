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

	@Override
	public void computeInterestAndFees()
	{
		computeInterestAndFees(getInterestRate(), getCurrentBalance);
	}

	@Override  //overrides computeInterestAndFees in abstract super class: BankAccount 
	public void computeInterestAndFees(double rate, double balance){ //required for step 3 in the instructions
		interestGained = balance * rate; //to calculate multiply the balance by the rate then...
		setCurrentBalance(balance + interestGained);//add the interest gained to the balance in the account.
	}

	@Override
	public void doTransaction(Transaction action)
	{
		if (action instanceof MonetaryTransaction)
		{
			if (action instanceof Deposit)
			{	
				Deposit d = (Deposit) action;
				balance += d.amount
			}
			else if (action instanceof Withdraw)
			{
				Withdraw w = (Withdraw) action;
				if (balance > (w.amount - getMinimumBalance()))
				{
					balance -= w.amount
				}
				else
				{
					throw new IllegalArgumentException("Insufficient funds");
				}
			}
			else if (action instanceof Transfer)
			{
				Transfer t = (Transfer) action;
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

	public double getCurrentBalance(){return balance;}

	public double getInterestGained(){return interestGained;}

	public double getMinimumBalance(){return minimumBalance;}

}
