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
	static int accountIndex;//this is set in the login function as it is dependent on what the user enters
	static int clientIndex;//this is changed in the login function when the user provides credentials
	static ArrayList<BankClient> clientDatabase = new ArrayList<BankClient> ();//creates client array
	static ArrayList<BankAccount> accountDatabase = new ArrayList<BankAccount> ();//creates account array
	
	
	public static void main(String[] args) {
		
		
		
		initializeDatabase();//creates bank accounts, and clients
		
		
//		for (int i = 0; i<3;){//checks if the user was verified
//			if (verified){
//				System.out.println("\nUser Verified.\n");
//				menu(accountDatabase, clientDatabase);
//			}
//			
//			else{
//				System.out.printf("\nUser Not Verified, attempt %d \n\n\n", i +1);
//				verified = login(clientDatabase, accountDatabase);
//				i++;
//			}
//		}
//		
//		System.out.printf("You have failed to log in 3 times. Please contact your banker for assistance. The program will now close.");
//		System.exit(0);
		
		verification();
	}
	
	private static void verification() {
		String command;
		//input.nextLine();
		System.out.println("Welcome to the login menu, to exit the program enter 'exit', to login press Enter: ");
		command = input.nextLine();
		
		boolean verified = false;//run the user through the login process and initialize the verified variable
		boolean stop = false;//used for controlling login loop
		
		while(stop!=true){
			
			if (command.contentEquals("exit")){
				System.exit(0);
			}
			else{
				for (int i = 0; i<3;){//checks if the user was verified
					verified = login(clientDatabase, accountDatabase);
					if (verified){
						System.out.println("\nUser Verified.\n");
						menu(accountDatabase, clientDatabase);
					}
					
					else{
						System.out.printf("\nUser Not Verified, attempt %d \n\n\n", i +1);
						i++;
					}
				}
				
				System.out.printf("You have failed to log in 3 times. Please contact your banker for assistance. The program will now close.");
				System.exit(0);
			}
		
		}
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
		
		for (int i = 0; i<accountDatabase.size(); i++){
			if (accountDatabase.get(i).getAccountNumber() == loginNumber){
				accountIndex = i;
				break;
			}
			if (((i + 1)% 3)== 0){
				//assuming every user has EXACTLY three accounts per client this will tell the computer what client is connected via their account number
				clientIndex++;
			}
		}
		
		
		if ((loginPassword == accountDatabase.get(accountIndex).getAccountPassword()) && (loginNumber == accountDatabase.get(accountIndex).getAccountNumber())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void menu(ArrayList<BankAccount> accountDatabase, ArrayList<BankClient> clientDatabase){
		double amount = 0;
		int transactionType;
		String statement;
		
		Hash hashObj = new Hash(clientIndex);//assuming there are EXACTLY 3 bank accounts per client this will find where to stop when making a statemnt
		//like above except it takes the value and determines where to start in the list
		
		
		System.out.println("Select Operation");
		System.out.printf("Current Balance: $%.2f\n", accountDatabase.get(accountIndex).getBalance());
		System.out.println("--------------------------");
		System.out.println("1. Withdraw money");
		System.out.println("2. Deposite money");
		System.out.println("3. Transfer money");
		System.out.println("4. Generate Statement");
		System.out.println("5. To log out");
		System.out.println("--------------------------");
		transactionType = input.nextInt();
		
		
		if ((transactionType == 1) || (transactionType == 2) || transactionType == 3){
			System.out.println("Enter the amount: ");
			amount = input.nextDouble();
		}
		
		
		else if(transactionType == 4){/*intentionally left blank*/}
		
		else if (transactionType == 5){verification();}
		
		else{System.out.println("Invalid choice."); menu(accountDatabase, clientDatabase);}
		
		switch (transactionType){
			case 1: 
				accountDatabase.get(accountIndex).withdraw(amount);
				menu(accountDatabase, clientDatabase);
				break;
				
			case 2:
				accountDatabase.get(accountIndex).deposit(amount);
				menu(accountDatabase, clientDatabase);
				break;
				
			case 3:
				String toAccount;
				System.out.println("Enter the coresponding number of the account you wish to transfer"
						+ " \nmoney to (C)hecking, (S)avings, or (R)etirement: ");
				//input.nextLine();
				toAccount = input.nextLine();
				char toAccountChar = toAccount.charAt(0);
				System.out.println(toAccountChar);
				
				accountDatabase.get(accountIndex).transfer(accountDatabase, amount, toAccountChar, hashObj.getMax(), hashObj.getStartPoint());
				break;
				
			case 4:
				System.out.println(("\nClient Name: \t\t" + clientDatabase.get(clientIndex).getName())
						+("\nClient Branch: \t\t" + clientDatabase.get(clientIndex).getBranch())
						+("\nClient Gender: \t\t" + clientDatabase.get(clientIndex).getGender())
						+("\nDate of access: \t" + clientDatabase.get(clientIndex).getDate()));
				System.out.println(clientIndex);
				
				for (int i = hashObj.getStartPoint(); i <= hashObj.getMax();){
					statement = accountDatabase.get(i).getStatement();
					System.out.println(statement);
					i++;
				}
				
				

				
				menu(accountDatabase, clientDatabase);
				break;
				
			default:
				System.exit(0);
		}
	}

	public static void initializeDatabase(){
		
		BankClient client1 = new BankClient("John Doe", "Flint", 'M', 1234);//make a new client with parameters name, branch, gender, password
		BankAccount account1 = new BankAccount(0000, 100.00, 'C');//make a new account type checking
		BankAccount account2 = new BankAccount(1111, 100.00, 'S');//make a new account type savings
		BankAccount account3 = new BankAccount(2222, 100.00, 'R');//Make a new account type retirement
		
		clientDatabase.add(client1);//add the client to the database
		accountDatabase.add(account1);//add the checking account to the database
		accountDatabase.add(account2);//add the savings account to the database
		accountDatabase.add(account3);//add the retirement account to the database
		
		
		BankClient client2 = new BankClient("Jane Smith", "Fenton", 'F', 1234);//make a new client with parameters name, branch, gender, password
		BankAccount account4 = new BankAccount(3333, 100.00, 'C');//make a new account type checking
		BankAccount account5 = new BankAccount(4444, 100.00, 'S');//make a new account type savings
		BankAccount account6 = new BankAccount(5555, 100.00, 'R');//Make a new account type retirement
		
		clientDatabase.add(client2);//add the client to the database
		accountDatabase.add(account4);//add the checking account to the database
		accountDatabase.add(account5);//add the savings account to the database
		accountDatabase.add(account6);//add the retirement account to the database

		
		//this initializes all of the passwords for each account, this is set through the client constructor
		int j = 0;
		for (int i = 0; i<(accountDatabase.size()); i++){
			if ((i % 3) == 0 && i>0){// assuming that every client has exactly 3 accounts 
				j++;
			}			
			accountDatabase.get(i).setPassword(clientDatabase.get(j).getPassword());//set the password for account at index i and j
			
		}
		
	}
}