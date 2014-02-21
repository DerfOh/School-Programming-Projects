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
	
	public String getStatement(){
		
		return ("\n------------------------------------\n")
		+("Account Number: \t" + accountNumber)
		+("\nAccount Type: \t\t" + accountType)
		+("\nAccount Balance\t\t" + balance)
		+("\n------------------------------------\n");
		
	}
	
	public void createAccount(int accountNumberIn){accountNumber = accountNumberIn;}
	
	public int getAccountNumber(){return accountNumber;}
	
	public int getAccountPassword(){return accountPassword;}
	
	public double getBalance(){return balance;}
	
	public char getAccountType(){return accountType;}

	public void transfer(ArrayList<BankAccount> accountDatabase, double amount, char toAccount, int maximum, int startingPoint) {
		
		for (int i= startingPoint; i<maximum;){
			if (accountDatabase.get(i).getAccountType() == toAccount){
				accountDatabase.get(i).deposit(amount);
				balance -= amount;
			}
			i++;
		}
		
	}
	
	
}
