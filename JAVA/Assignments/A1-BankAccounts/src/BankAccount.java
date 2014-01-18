import java.util.Scanner; //For getting user input

public class BankAccount {
	//so that we can get input from user.
	Scanner input = new Scanner(System.in);
	
	//initializes variables
	private static int[] accounts = new int[] {1111, 2222, 3333, 4444};	//Array containing all of the account numbers
	private static String[] passwords = new String[] {"mom", "dad", "1993", "ham"};	//Array containing all of the account passwords
		
	int accountType; //1 = Checking, 2 = Savings, 3 = retirement
	int transactionType; //1 = withdraw, 2 = deposit, 3 = inquiry
	private int accountNumber; //Set by user
	private double checkingBalance = 1000; //The balance of the account being accessed
	private double savingsBalance = 1000;
	private double retirementBalance = 1000;
	int loginAttempts;//counts the amount of times the user has tried to log in
	
	boolean loginSuccessful; //set by login function
	private boolean overdraft = false;//set to t when balance goes below 0
	
	private String accountPassword;//password entered by user
	
	

	//checks the values entered by the user for their account number, returns t or f depending on success
	public boolean testAccountNum(int accountNumber){
		System.out.printf("You entered %d for your account number.", accountNumber);
		for (int i=0; i<BankAccount.accounts.length;){
			if (accountNumber == BankAccount.accounts[i]){
				return true;
			}
			else{
				i++;
			}
		}
		return false;
	}
	
	//checks the values entered by the user for their account password, returns t or f depending on success
	public boolean testAccountPass(String accountPassword){
		System.out.printf("You entered %s for your account password.\n", accountPassword);
		for (int i=0; i<BankAccount.passwords.length;){
			if (BankAccount.passwords[i].equals(accountPassword)){//this is the correct way to compare strings in java
				return true;
			}
			else{
				i++;
			}
		}
		return false;
	}
	
	//prompts the user for login information then checks the credentials. Has a fail-safe where if the login is attempted more than 3 times then the program will terminate
	public boolean login(){
		boolean accountNumSuccessful;
		boolean accountPasswordSuccessful;	
		
			
		//get account number
		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();
		
		//get account password through scanner
		System.out.print("Enter the password for your account: ");
		input.nextLine();
		accountPassword = input.nextLine();
		
		accountNumSuccessful = testAccountNum(accountNumber);
		accountPasswordSuccessful = testAccountPass(accountPassword);
		
		//for testing only!
		
		for (int i=0; i<BankAccount.accounts.length;){
			System.out.println(BankAccount.accounts[i]);
			System.out.println(BankAccount.passwords[i]);
			i++;
		}
		System.out.println(accountNumSuccessful);
		System.out.println(accountPasswordSuccessful);
		/////////////////////////////////
		
		//checks if both values match 
		if ((accountNumSuccessful) & (accountPasswordSuccessful)){
			return true;
		}
		else{
			return false;
		}
		
		
	}
	
	//Does the type of transaction on the account as it is passed in with the amount of money being handled
	public double transactions(int transactionType, double accountBalance){
		double amount;
		
		if (transactionType != 3){System.out.print("Enter the amount you would like to");}
		switch(transactionType){
		//withdraw	
		case 1:
			System.out.print(" withdraw: $" );
			amount = input.nextDouble();
			return (accountBalance - amount);
		//deposit		
		case 2:
			System.out.print(" deposit: $" );
			amount = input.nextDouble();
			return (accountBalance + amount);
		//inquiry		
		case 3:
			return (accountBalance);
		}
		return accountBalance;
	}
	
	//prints the current balance of the account passed in as an arg
	public void inquiry(int accountType){
		
	}
	
	//main menu of the program, only accessible after login.
	public void menu(BankAccount account){
		System.out.printf("Main Menu for account %d Reached! \n\n", accountNumber);
		
		System.out.println("1. Checking");
		System.out.println("2. Savings");
		System.out.println("3. Retirement");
		System.out.println("4. Exit");
		accountType = input.nextInt();
		
		if(accountType == 4){
			System.exit(0);
		}
		
		System.out.println("1. Withdraw money");
		System.out.println("2. Deposite money");
		System.out.println("3. Balance inquiry");
		transactionType = input.nextInt();
		

		

		
		switch (accountType){
			//checking
			case 1: 
				checkingBalance = transactions(transactionType, checkingBalance);
				System.out.printf("Current balance: $%f\n\n", checkingBalance);
				menu(account);
				break;
			//savings
			case 2:
				savingsBalance = transactions(transactionType, savingsBalance);
				System.out.printf("Current balance: $%f\n\n", savingsBalance);
				menu(account);
				break;
			//retirement
			case 3:
				retirementBalance = transactions(transactionType, retirementBalance);
				System.out.printf("Current balance: $%f\n\n", retirementBalance);
				menu(account);
				break;
			
		}
		
		System.exit(0);
		
	}
	
	
	//main function of the program
	public static void main(String[] args) {
		
		boolean verified;
		System.out.println("Banking Program");
		BankAccount account = new BankAccount();
		int i;

		//run the user through the login process. 
		verified = account.login();
		
		for (i = 0; i<3;){
			if (verified){
				System.out.println("\nUser Verified.\n");
				account.menu(account);
			}
			
			else{
				System.out.printf("\nUser Not Verified, attempt %d \n\n\n", i +1);
				verified = account.login();
				i++;
			}
		}
		
		System.out.printf("You have failed to log in %d times. Please contact your banker for assistance. The program will now close.", i);
		System.exit(0);
		
		
	
	}

}
