import java.util.Scanner;


public class Driver {
	static int accountNumber;
	static String accountPassword;
	
	static Scanner input = new Scanner(System.in);
	static BankAccount[] account = new BankAccount[AccountDatabase.getDatabaseSize()];
	
	static boolean firstRun = true;
	
	
	static AccountDatabase database = new AccountDatabase();
	static BalanceTransactions transactions = new BalanceTransactions();
	
	public static boolean login(){
		//get account number
		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();
		
		//get account password through scanner
		System.out.print("Enter the password for your account: ");
		input.nextLine();
		accountPassword = input.nextLine();
		
		return database.testAccountCred(accountNumber, accountPassword);
	}
	
	//main function of the program
	public static void main(String[] args) {
			
		boolean verified;
		System.out.println("Banking Program");
		
		if (firstRun){
			for(int i = 0; i < AccountDatabase.getDatabaseSize(); i++)
			{
			    account[i] = new BankAccount(1000, 1000, 1000);
			    firstRun = false;
			}
		}
		int i;

		//run the user through the login process. 
		verified = login();
		
		for (i = 0; i<3;){
			if (verified){
				System.out.printf("\nUser Verified for account %d\n", AccountDatabase.getAccountIndex());
				
				BalanceTransactions.menu(account);
			}
			
			else{
				System.out.printf("\nUser Not Verified, attempt %d \n\n\n", i +1);
				verified = login();
				i++;
			}
		}
		
		System.out.printf("You have failed to log in %d times. Please contact your banker for assistance. The program will now close.", i);
		System.exit(0);
		
	}
}