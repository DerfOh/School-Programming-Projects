public class BankAccount {
	
	protected double balance;
	
	private int accountNumber;
	private int accountPassword;
	
	private char accountType;
	
	private double accountBalance;
	


	
	private BankAccount(int accountNumIn, double balanceIn, char typeIn){
		balance = balanceIn;
		accountNumber = accountNumIn;
		accountType = typeIn;		
	}
	
	public void setPassword(int password){
		
	}
	
	public void deposit (double amount){
		
	}
	
	public void withdraw (double amount){
		
	}
	
	public void transfer (int toAccountNo, double amount){
		
	}
	
	public String toString(){
		return; 
	}
	
	public void createAccount(int accountNumber){
		
	}
	
	public int getAccountNumber(){return accountNumber;}
	
	public double getBalance(){return accountBalance;}
	
	public String getStatement(){return toString();}
	
	
}
