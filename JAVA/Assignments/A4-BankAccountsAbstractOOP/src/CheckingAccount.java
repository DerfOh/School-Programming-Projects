/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class CheckingAccount extends BankAccount {
	private double currentBalance; //balance should not be less than $0.00
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

	public void setCurrentBalance(double balance){
			currentBalance = balance;
	}

	public void setTransactionFee(double fee){
			transactionFee = fee;
	}

	public double getCurrentBalance(){return currentBalance;}
	public double getTransactionFee(){return transactionFee;}
}
