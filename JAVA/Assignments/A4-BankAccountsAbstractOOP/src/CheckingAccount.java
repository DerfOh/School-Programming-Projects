/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class CheckingAccount extends BankAccount {
	//removed the "currentBalance" variable: redundant - zp 4/4/14
	private double transactionFee; //checking accounts have a fee per transaction
	private double minimum = 0;//sets minimum balance for checking account

	CheckingAccount(double balance, double fee){
		setCurrentBalance(balance);
		setTransactionFee(fee);
	}

	@Override
	public void computeInterestAndFees(){//when this method is called the balance is decremented
		//setCurrentBalance(	getCurrentBalance() - getTransactionFee()	);
		//this line does the same thing as the commented one above, but this way, the stack doesn't get so lonely
		computeInterestAndFees(getTransactionFee(), getCurrentBalance);
	}

	@Override
	public void computeInterestAndFees(double rate, double balance)
	{
		setCurrentBalance(balance - rate);
	}

	@Override
	public void doTransaction(Transaction action) throws IllegalArgumentException
	{
		if (action instanceof MonetaryTransaction)
		{
			if (action instanceof Deposit)
			{	
				Deposit d = (Deposit) action;
				balance += d.amount;
			}
			else if (action instanceof Withdraw)
			{
				Withdraw w = (Withdraw) action;
				balance -= w.amount;
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

	public void setCurrentBalance(double balance){
			currentBalance = balance;
	}

	public void setTransactionFee(double fee){
			transactionFee = fee;
	}

	public double getCurrentBalance(){return balance;}
	public double getTransactionFee(){return transactionFee;}
}
