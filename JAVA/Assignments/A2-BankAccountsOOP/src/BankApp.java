/**
 * Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Time of creation: Feb 19, 2014 1:14:15 PM
 * Code function: An Object oriented banking program
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.ArrayList; //imports the array list class


public class BankApp {
	
	public static void main(String[] args) {
		ArrayList<BankClient> clientDatabase = new ArrayList<BankClient> ();//creates client array
		ArrayList<BankAccount> accountDatabase = new ArrayList<BankAccount> ();//creates account array
		
		BankClient client1 = new BankClient();//make a new client
		BankAccount account1 = new BankAccount(0000, 100.00,'M');//make a new account
		
		clientDatabase.add(client1);//add the client to the database
		accountDatabase.add(account1);//add the account to the database
		
		accountDatabase.get(0).setPassword(1234);//set the password for account at index 0
		
		
		
		

	}

}
