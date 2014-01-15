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
	
	

	//checks the values entered by the user for their account number and password, returns t or f depending on success
	public boolean testLogin(int accountNumber, String accountPassword){
		for (int i=0; i<BankAccount.accounts.length; i++){
			if (accountNumber == BankAccount.accounts[i] && accountPassword == BankAccount.passwords[i]){
				System.out.println("Login Successful!");
				loginSuccessful = true;
			}
			else{
				loginSuccessful = false; 
			}
		}
		return loginSuccessful;
	}
	
	//prompts the user for login information then checks the credentials. Has a fail-safe where if the login is attempted more than 3 times then the program will terminate
	public boolean login(){
		//int i = 0;
		//get account number through scanner
		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();
		System.out.printf("You entered %d for your account number.", accountNumber);
		
		//get account password through scanner
		System.out.print("Enter the password for your account: ");
		accountPassword = input.nextLine();
		System.out.printf("You entered %s for your account password.", accountPassword);
		
		loginSuccessful = testLogin(accountNumber,accountPassword);
//			else{
//				System.out.println("You have failed the login attempt 3 times, please contact your banker for assistance. The program will now close.");
//				System.exit(0);
			//i++;
		return loginSuccessful;
	}
	
	//Does the type of transaction on the account as it is passed in with the amount of money being handled
	public void transactions(int accountType, int transactionType, double amount){
		//if transactionType = 1 -> Withdraw
		//if transactionType = 2 -> Deposit
		//if transactionType = 3 -> Inquiry 
	}
	
	//prints the current balance of the account passed in as an arg
	public void inquiry(int accountType){
		
	}
	
	
	//main function of the program
	public static void main(String[] args) {
		
		boolean verified;
		System.out.println("Banking Program");
		BankAccount a1 = new BankAccount();
		
		//run the user through the login process. 
		verified = a1.login();
		
		
	
	}

}
