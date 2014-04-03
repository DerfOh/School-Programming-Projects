/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */
public class CheckingAccount extends BankAccount {
	double currentBalance; //balance should not be less than $0.00
	double transactionFee; //checking accounts have a fee per transaction

	CheckingAccount(double balance, double fee){
		setCurrentBalance(balance);
		setTransactionFee(fee);
	}

	@Override
	public void computeInterestAndFees(){//when this method is called the balance is decrimented
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
