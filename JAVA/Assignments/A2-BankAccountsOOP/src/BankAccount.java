/**
 * Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Time of creation: Feb 19, 2014 1:14:15 PM
 * Code function: creates a BankAccount class an associates methods with it
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.Calendar;
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
	
	public String createStatement(ArrayList<BankClient> clientDatabase){
		statement = ("\n--------------------------\n")
		+("Account Number: %d" + accountNumber)
		+("\nAccount Type: %c" + accountType)
		+("\nAccount Balance\t%.2f\n" + balance)
		+("\nClient Name: %s" + clientDatabase.get(0).getName())
		+("\nClient Branch: %s" + clientDatabase.get(0).getBranch())
		+("\n--------------------------\n");
		return statement;
		
	}
	
	public void createAccount(int accountNumberIn){accountNumber = accountNumberIn;}
	
	public int getAccountNumber(){return accountNumber;}
	
	public int getAccountPassword(){return accountPassword;}
	
	public double getBalance(){return balance;}
	
	public String getStatement(ArrayList<BankClient> clientDatabase){return createStatement(clientDatabase);}
	
	
}
