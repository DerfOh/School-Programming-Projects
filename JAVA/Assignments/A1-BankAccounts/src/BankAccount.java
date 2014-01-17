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
	private int balance; //The balance of the account being accessed
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
		for (int i=0; i<BankAccount.accounts.length;){
			if (accountPassword == BankAccount.passwords[i]){
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
		boolean accountNumSuccessful = false;
		boolean accountPasswordSuccessful = false;	
			
		//get account number
		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();
		
		//get account password through scanner
		System.out.print("Enter the password for your account: ");
		input.nextLine();
		accountPassword = input.nextLine();
		
		accountNumSuccessful = testAccountNum(accountNumber);
		accountPasswordSuccessful = testAccountPass(accountPassword);
		
		//checks if both values match 
		if (accountNumSuccessful == true && accountPasswordSuccessful == true){
			return true;
		}
		else{
			return false;
		}
		
		
	}
	
	//Does the type of transaction on the account as it is passed in with the amount of money being handled
	public void transactions(int accountType, double amount){

	}
	
	//prints the current balance of the account passed in as an arg
	public void inquiry(int accountType){
		
	}
	
	//main menu of the program, only accessible after login.
	public void menu(BankAccount a1){
		System.out.printf("Main Menu for account %d Reached!", a1.accountNumber);
		System.out.println("1. Withdraw money");
		System.out.println("2. Deposite money");
		System.out.println("3. Balance inquiry");
		
		int choice;
		switch (choice){
			//Deposite
			case 1: 
				transactions();
				break;
			//Withdraw
			case 2:
				transactions();
				break;
			//Inquiry
			case 3:
				transactions();
				break;
		}
		
		System.exit(0);
		
	}
	
	
	//main function of the program
	public static void main(String[] args) {
		
		boolean verified;
		System.out.println("Banking Program");
		BankAccount a1 = new BankAccount();
		int i;
		
		//run the user through the login process. 
		verified = a1.login();
		
		for (i = 0; i<3;){
			if (verified){
				System.out.println("\nUser Verified.\n");
				a1.menu(a1);
			}
			
			else{
				System.out.printf("\nUser Not Verified, attempt %d \n\n\n", i +1);
				verified = a1.login();
				i++;
			}
		}
		
		System.out.printf("You have failed to log in %d times. Please contact your banker for assistance. The program will now close.", i);
		System.exit(0);
		
		
	
	}

}
