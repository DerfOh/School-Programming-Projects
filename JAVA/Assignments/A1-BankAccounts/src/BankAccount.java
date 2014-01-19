public class BankAccount {
	
	static protected double checkingBalance; //The balance of the account being accessed
	static protected double savingsBalance;
	static protected double retirementBalance;
	
	protected BankAccount(){
	}
	
	protected BankAccount(double checking, double savings, double retirement){
		BankAccount.checkingBalance = checking; //The balance of the account being accessed
		BankAccount.savingsBalance = savings;
		BankAccount.retirementBalance = retirement;
	}
}
