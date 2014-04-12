import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */

public class Driver  {

	static BankAccount checking = new CheckingAccount(100, 2.50);
	static BankAccount savings = new SavingsAccount(0.01, 200);
	static BankAccount retirement = new RetirementAccount (0.25, 100, 1200);


	static Scanner input = new Scanner(System.in);
	static  double amount;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the bank application");
		accountSelection();
	}

	public static void menu(BankAccount account) throws InputMismatchException{//displays menu options to user
		int transactionType = 0;
		boolean invalidInteger=false;
		int accountSelection = 0;
		
		
		System.out.println("Select Operation");
		System.out.printf("Current Balance: " + account.getCurrentBalance());
		System.out.println("\n--------------------------");
		System.out.println("1. Withdraw money");
		System.out.println("2. Deposite money");
		System.out.println("3. Transfer money");
		System.out.println("4. Compute interest and fees");
		System.out.println("5. To return to account selection.\n");
		System.out.println("--------------------------");
		do{
			try{
				transactionType = input.nextInt();
				invalidInteger = false;
			}
			catch(InputMismatchException e){
				System.out.println("Please enter an integer value...");
				input.nextInt();
				invalidInteger = true;
			}
		}while(invalidInteger);
		

		
		if ((transactionType == 1) || (transactionType == 2) || transactionType == 3){
			System.out.println("Enter the amount: ");
			amount = input.nextDouble();
		}
		
		if (transactionType == 1){
			MonetaryTransaction withdraw = new Withdraw(amount);
			account.doTransaction(withdraw);
			menu(account);
		}
		
		else if (transactionType == 2){
			MonetaryTransaction deposit = new Deposit(amount);
			account.doTransaction(deposit);
			menu(account);
		}
		
		else if (transactionType == 3){
			conductTransfer(account);
		}
		
		else if (transactionType == 4){
			account.computeInterestAndFees();//conducts fee adjustment
			menu(account);
		}
		
		else if (transactionType == 5){
			System.out.println("Returning to main menu....");
			accountSelection();
		}
		
		else{
			System.out.println("Invalid operation chosen, please enter a value within the range, returning to action menu.");
			menu(account);
		}
		}
	
	public static void accountSelection(){
		int accountChoice = 0;
		boolean invalidInteger = false;
		
		System.out.println("--Please choose the account to perform operations on--");
		System.out.println("1. Checking");
		System.out.println("2. Savings");
		System.out.println("3. Retirement");
		System.out.println("4. Exit");
		
		
		do{
			try{
				accountChoice = input.nextInt();
				invalidInteger = false;
			}
			catch(InputMismatchException e){
				System.out.println("Please enter an integer value...");
				input.nextLine();
				invalidInteger = true;
			}
		}while(invalidInteger);
		
		switch(accountChoice){
		case 1:
			menu(checking);
			break;
			
		case 2:
			menu(savings);
			break;
			
		case 3:
			menu(retirement);
			break;
		
		case 4:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid input, returning to account selection...");
			accountSelection();
			break;
		}
	}

	public static void conductTransfer(BankAccount account){
		int accountSelection = 0;
		boolean invalidInteger;
		System.out.println("Choose an account to transfer money to: ");
		System.out.println("1. Checking");
		System.out.println("2. Savings");
		System.out.println("3. Retirement");
		do{
			try{
				accountSelection = input.nextInt();
				invalidInteger = false;
			}
			catch(InputMismatchException e){
				System.out.println("Please enter an integer value...");
				input.nextInt();
				invalidInteger = true;
			}
		}while(invalidInteger);
		
		
		
		switch (accountSelection){
			case 1:{
				MonetaryTransaction transferC = new Transfer(checking, amount);
				account.doTransaction(transferC);
				menu(account);
				break;
			}
			case 2:{
				MonetaryTransaction transferS = new Transfer(savings, amount);
				account.doTransaction(transferS);
				menu(account);
				break;
			}
			case 3:{
				MonetaryTransaction transferR = new Transfer(retirement, amount);
				account.doTransaction(transferR);
				menu(account);
				break;
			}
			default:{
				System.out.println("Please enter a value within the range, returning to the action menu.");
				menu(account);
				break;
			}
		}

	}
}

