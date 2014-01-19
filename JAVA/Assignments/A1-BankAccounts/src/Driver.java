import java.util.Scanner;


public class Driver {
	static int accountNumber;
	static String accountPassword;
	static Scanner input = new Scanner(System.in);
	
	public static boolean login(BankAccount account){
		//get account number
		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();
		
		//get account password through scanner
		System.out.print("Enter the password for your account: ");
		input.nextLine();
		accountPassword = input.nextLine();
		
		return account.testAccountCred(accountNumber, accountPassword);
	}
	
	//main function of the program
	public static void main(String[] args) {
			
		boolean verified;
		System.out.println("Banking Program");
		BankAccount account = new BankAccount();
		int i;

		//run the user through the login process. 
		verified = login(account);
		
		for (i = 0; i<3;){
			if (verified){
				System.out.println("\nUser Verified.\n");
				account.menu(account);
			}
			
			else{
				System.out.printf("\nUser Not Verified, attempt %d \n\n\n", i +1);
				verified = login(account);
				i++;
			}
		}
		
		System.out.printf("You have failed to log in %d times. Please contact your banker for assistance. The program will now close.", i);
		System.exit(0);
	}
}