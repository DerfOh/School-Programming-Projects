/**
 * Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Time of creation: Feb 19, 2014 1:14:15 PM
 * Code function: An Object oriented banking program
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.ArrayList; //imports the array list class
import java.util.Scanner;


public class BankApp {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		final ArrayList<BankClient> clientDatabase = new ArrayList<BankClient> ();//creates client array
		final ArrayList<BankAccount> accountDatabase = new ArrayList<BankAccount> ();//creates account array
		
		BankClient client1 = new BankClient("John Doe", "Flint Branch", 'M');//make a new client
		BankAccount account1 = new BankAccount(0000, 100.00, 'M');//make a new account
		
		clientDatabase.add(client1);//add the client to the database
		accountDatabase.add(account1);//add the account to the database
		
		accountDatabase.get(0).setPassword(1234);//set the password for account at index 0
		
		boolean verified;
		System.out.println("Banking Program");
		
		
		//run the user through the login process.
		verified = login(clientDatabase, accountDatabase);
		
		for (int i = 0; i<3;){
			if (verified){
				System.out.println("\nUser Verified.\n");
				menu(accountDatabase);
			}
			
			else{
				System.out.printf("\nUser Not Verified, attempt %d \n\n\n", i +1);
				verified = login(clientDatabase, accountDatabase);
				i++;
			}
		}
		
		System.out.printf("You have failed to log in 3 times. Please contact your banker for assistance. The program will now close.");
		System.exit(0);
	}
	
	public static boolean login(ArrayList<BankClient> clientDatabase, ArrayList<BankAccount> accountDatabase){
		int loginNumber;
		int loginPassword;
		
		//get account number
		System.out.print("Enter your account number: ");
		loginNumber = input.nextInt();
		
		//get account password through scanner
		System.out.print("Enter the password for your account: ");
		loginPassword = input.nextInt();
		
		if ((loginPassword == accountDatabase.get(0).getAccountPassword()) && (loginNumber == accountDatabase.get(0).getAccountNumber())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void menu(ArrayList<BankAccount> accountDatabase){
		double amount = 0;
		int transactionType;
		
		
		System.out.println("Select Operation");
		System.out.printf("Current Balance: $%.2f\n", accountDatabase.get(0).getBalance());
		System.out.println("--------------------------");
		System.out.println("1. Withdraw money");
		System.out.println("2. Deposite money");
		System.out.println("3. Balance inquiry");
		System.out.println("4. Exit");
		System.out.println("--------------------------");
		transactionType = input.nextInt();
		
		
		if ((transactionType == 1) || (transactionType == 2)){
			System.out.println("Enter the amount: ");
			amount = input.nextDouble();
		}
		else if (transactionType == 5){System.exit(0);}
		else{System.out.println("Invalid choice."); menu(accountDatabase);}
		
		switch (transactionType){
			case 1: 
				accountDatabase.get(0).withdraw(amount);
				menu(accountDatabase);
				break;
			case 2:
				accountDatabase.get(0).deposit(amount);
				menu(accountDatabase);
				break;
			case 3:
				
				break;
		}
		System.exit(0);
		
		System.exit(0);
	}

}
