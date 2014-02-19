import java.util.Calendar;

public class BankClient {
	private String name, branch, day;
	private char gender;
	private Calendar date = Calendar.getInstance();
	
	public BankClient(){
		name = "NOT INITIALIZED!";
		branch = "NOT INITIALIZED!";
		gender = 'M';
		day = date.toString();
	}
	
	public BankClient(String nameIn, String branchIn, char genderIn){
		name = nameIn;
		branch = branchIn;
		gender = genderIn;
		day = date.toString();
	}
}
