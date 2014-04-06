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
		setCurrentBalance(	getCurrentBalance() - getTransactionFee()	);
	}

	@Override
	public void doTransaction(Transaction action) throws IllegalArgumentException
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
				if (balance > w.amount)
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

	public void setCurrentBalance(double balance){
			currentBalance = balance;
	}

	public void setTransactionFee(double fee){
			transactionFee = fee;
	}

	public double getCurrentBalance(){return balance;}
	public double getTransactionFee(){return transactionFee;}
}
