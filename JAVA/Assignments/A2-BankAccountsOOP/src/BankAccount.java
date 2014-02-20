/**
 * Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Time of creation: Feb 19, 2014 1:14:15 PM
 * Code function: creates a BankAccount class an associates methods with it
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.ArrayList;

public class BankAccount {
	
	protected double balance;
	
	private int accountNumber;
	private int accountPassword;
	
	private char accountType;
	
		
	String statement; 


	
	BankAccount(int accountNumIn, double balanceIn, char typeIn){
		balance = balanceIn;
		accountNumber = accountNumIn;
		accountType = typeIn;		
	}
	
	public void setPassword(int password){accountPassword = password;}
	
	public void deposit (double amount){balance += amount;}
	
	public void withdraw (double amount){balance -= amount;}
	
	public void transfer (int toAccountNo, double amount){
		
	}
	
	public String createStatement(ArrayList<BankClient> clientDatabase, int accountIndex, int clientIndex){
		statement = ("\n------------------------------------\n")
		+("Account Number: \t" + accountNumber)
		+("\nAccount Type: \t\t" + accountType)
		+("\nAccount Balance\t\t" + balance)
		+("\nClient Name: \t\t" + clientDatabase.get(clientIndex).getName())
		+("\nClient Branch: \t\t" + clientDatabase.get(clientIndex).getBranch())
		+("\nClient Gender: \t\t" + clientDatabase.get(clientIndex).getGender())
		+("\nDate of access: \t\t" + clientDatabase.get(clientIndex).getDate())
		+("\n------------------------------------\n");
		return statement;
		
	}
	
	public void createAccount(int accountNumberIn){accountNumber = accountNumberIn;}
	
	public int getAccountNumber(){return accountNumber;}
	
	public int getAccountPassword(){return accountPassword;}
	
	public double getBalance(){return balance;}
	
	public String getStatement(ArrayList<BankClient> clientDatabase, int accountIndex, int clientIndex){return createStatement(clientDatabase, accountIndex, clientIndex);}
	
	
}
