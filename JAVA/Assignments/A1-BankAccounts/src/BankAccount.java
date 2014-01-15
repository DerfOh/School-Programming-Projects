import java.util.Scanner; //For getting user input

public class BankAccount {

	//initializes variables
	private static int[] accounts = new int[] {1111, 2222, 3333, 4444};	//Array containing all of the account numbers
	private static String[] passwords = new String[] {"mom", "dad", "1993", "ham"};	//Array containing all of the account passwords

	int accountType; //1 = Checking, 2 = Savings, 3 = retirement
	int balence; //The balence of the account being accessed
	boolean loginSuccessful; //set by login function
	boolean overdraft = false;//set to t when balence goes below 0
	String accountPassword;//password entered by user
	

	//checks the values entered by the user for their account number and password, returns t or f depending on success
	public boolean login(int accountNumber, String accountPassword){
		for (int i; i<BankAccount.accounts.length; i++){
			if (accountNumber == BankAccount.accounts[i] && accountPassword == BankAccount.passwords[i]){
				System.out.println("Login Successful!");
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	//Does the type of transaction on the account as it is passed in with the amount of money being handled
	public void transactions(int accountNumber, int transactionType double amount){
		//if transactionType = 1 -> Withdraw
		//if transactionType = 2 -> Deposite
		//if transactionType = 3 -> Inquiry 
	}
	
	//prints the current balance of the account passed in as an arg
	public void inquiry(int accountType){
		
	}
	
	public int getAccountType(){
		return accountType;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello World!");
		

	}

}
