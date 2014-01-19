
public class Driver {
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
