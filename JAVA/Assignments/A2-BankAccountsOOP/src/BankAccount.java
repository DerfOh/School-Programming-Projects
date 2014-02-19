import java.util.Calendar;
public class BankAccount {
	
	protected double balance;
	
	private int accountNumber;
	private int accountPassword;
	
	private char accountType;
	
	private double accountBalance;
	
	private Calendar date = Calendar.getInstance();
	
	String statement; 


	
	private BankAccount(int accountNumIn, double balanceIn, char typeIn){
		balance = balanceIn;
		accountNumber = accountNumIn;
		accountType = typeIn;		
	}
	
	public void setPassword(int password){accountPassword = password;}
	
	public void deposit (double amount){accountBalance += amount;}
	
	public void withdraw (double amount){accountBalance -= amount;}
	
	public void transfer (int toAccountNo, double amount){
		
	}
	
	public String createStatement(){
		statement =("\n--------------------------\n")
		+("1. Account Balance\t%.2f\n" + balance)
		+("\n--------------------------\n");
		return statement;
		
	}
	
	public void createAccount(int accountNumber){
		
	}
	
	public int getAccountNumber(){return accountNumber;}
	
	public double getBalance(){return accountBalance;}
	
	public String getStatement(){return createStatement();}
	
	
}
