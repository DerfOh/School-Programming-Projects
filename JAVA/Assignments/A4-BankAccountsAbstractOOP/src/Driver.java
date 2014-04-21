import java.util.InputMismatchException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.Scanner;

/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */

public class Driver  {

	static BankAccount checking = new CheckingAccount(100, 2.50);//balance, fee
	static BankAccount savings = new SavingsAccount(0.01, 200);//rate, balance
	static BankAccount retirement = new RetirementAccount (0.25, 100, 1200);//rate, balance, annual income


	static Scanner input = new Scanner(System.in);
	static  double amount;
	
	public static void main(String[] args) {
		
		GUIFrame guiFrame = new GUIFrame(); //create a frame object
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the window when finished
		
		guiFrame.setSize(400, 450);
		guiFrame.setVisible(true);
		
		System.out.println("Welcome to the bank application");
		//accountSelection(); move the contents of this method and the following methods into the GUI Fame
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
		System.out.println("4. View account fees/interest");
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
			
			if (account instanceof CheckingAccount){account.computeInterestAndFees();}
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
			if (account instanceof CheckingAccount){
				System.out.printf("Current transaction fee: $%.2f\n", account.getAdjustment());
			}
			
			else if (account instanceof SavingsAccount || account instanceof RetirementAccount){
				System.out.printf("Current interest rate: $%.2f\n", account.getAdjustment());
			}
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
		System.out.println("4. Exit and print statement");
		
		
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
			//checking.computeInterestAndFees(); commented out because this is done when the transaction is conducted
			savings.computeInterestAndFees();//conducts fee/interest adjustment
			retirement.computeInterestAndFees();
			createStatement();
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

	public static void createStatement(){
		System.out.println("-----Bank Statement-----");
		System.out.printf("Checking: \t$%.2f\n", checking.getCurrentBalance());
		System.out.printf("Savings: \t$%.2f\n", savings.getCurrentBalance());
		System.out.printf("Retirement: \t$%.2f\n", retirement.getCurrentBalance());
		System.out.printf("------------------------\n\n");
	}
}