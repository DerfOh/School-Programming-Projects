public class BankAccount {
	
	protected double checkingBalance; //The balance of the account being accessed
	protected double savingsBalance;
	protected double retirementBalance;
	
	private int accountNumber;
	private String accountPassword;
	
	public int getAccountNumber(){return accountNumber;}
	public String getAccountPassword(){return accountPassword;}

	
	protected BankAccount(){
		this.checkingBalance = 1000; //The balance of the account being accessed
		this.savingsBalance = 1000;
		this.retirementBalance = 1000;
		this.accountNumber = 0000;
		this.accountPassword = "password";
	}
	
	protected BankAccount(double checking, double savings, double retirement){
		this.checkingBalance = checking; //The balance of the account being accessed
		this.savingsBalance = savings;
		this.retirementBalance = retirement;
	}
	
	protected BankAccount(int number, String password){
		this.accountNumber = number;
		this.accountPassword = password;
	}
	
	protected BankAccount(int number, String password, double checking, double savings, double retirement){
		this.checkingBalance = checking; //The balance of the account being accessed
		this.savingsBalance = savings;
		this.retirementBalance = retirement;
		this.accountNumber = number;
		this.accountPassword = password;
	}
	
	
}
