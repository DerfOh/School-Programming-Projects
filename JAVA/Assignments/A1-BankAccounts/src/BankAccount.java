import java.util.Scanner; //For getting user input

public class BankAccount {
	//so that we can get input from user.
	Scanner input = new Scanner(System.in);
		
	int accountType; //1 = Checking, 2 = Savings, 3 = retirement
	int transactionType; //1 = withdraw, 2 = deposit, 3 = inquiry
	
	protected double checkingBalance = 1000; //The balance of the account being accessed
	protected double savingsBalance = 1000;
	protected double retirementBalance = 1000;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	//Does the type of transaction on the account as it is passed in with the amount of money being handled
//	public double transactions(int transactionType, double accountBalance){
//		double amount;
//		
//		if (transactionType != 3){System.out.print("Enter the amount you would like to");}
//		switch(transactionType){
//		//withdraw	
//		case 1:
//			System.out.print(" withdraw: $" );
//			amount = input.nextDouble();
//			
//			//check for over withdraw
//			if ((accountBalance - amount) < 0){
//				System.out.println("WARNING! The amount you have entered will result in an overdraft.\nReturning to main menu.\n");
//				return accountBalance;
//			}
//			
//			return (accountBalance - amount);
//		//deposit		
//		case 2:
//			System.out.print(" deposit: $" );
//			amount = input.nextDouble();
//			return (accountBalance + amount);
//		//inquiry		
//		case 3:
//			
//			return accountBalance;
//		}
//		return accountBalance;
//	}
	
	//main menu of the program, only accessible after login.
//	public void menu(BankAccount account){
//		System.out.println("Select account");
//		System.out.println("--------------------------");
//		System.out.printf("1. Checking\t%.2f\n", account.checkingBalance);
//		System.out.printf("2. Savings\t%.2f\n", account.savingsBalance);
//		System.out.printf("3. Retirement\t%.2f\n", account.retirementBalance);
//		System.out.printf("4. Log Out\n");
//		System.out.println("--------------------------");
//		accountType = input.nextInt();
//		
//		//if user decides to log out
//		if(accountType == 4){System.exit(0);}
//		
//		System.out.println("Select Operation");
//		System.out.println("--------------------------");
//		System.out.println("1. Withdraw money");
//		System.out.println("2. Deposite money");
//		System.out.println("3. Balance inquiry");
//		System.out.println("--------------------------");
//		transactionType = input.nextInt();
//		
//		switch (accountType){
//			//checking
//			case 1: 
//				checkingBalance = BalanceTransactions.transactions(transactionType, checkingBalance);
//				menu(account);
//				break;
//			//savings
//			case 2:
//				savingsBalance = BalanceTransactions.transactions(transactionType, savingsBalance);
//				menu(account);
//				break;
//			//retirement
//			case 3:
//				retirementBalance = BalanceTransactions.transactions(transactionType, retirementBalance);
//				menu(account);
//				break;
//		}
//		System.exit(0);
//	}
}
