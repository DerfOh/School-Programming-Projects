
public class AccountDatabase {
	
	private static int[] accounts = new int[] {1111, 2222, 3333, 4444};	//Array containing all of the account numbers
	private static String[] passwords = new String[] {"mom", "dad", "1993", "ham"};	//Array containing all of the account passwords
	
	//checks the values entered by the user for their account number, returns t or f depending on success
	public boolean testAccountCred(int accountNumber, String accountPassword){
		for (int i=0; i<accounts.length;){
			if (accountNumber == accounts[i] & passwords[i].equals(accountPassword)){return true;}
			else{i++;}
		}
		
		return false;
	}
}
