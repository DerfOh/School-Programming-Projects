/**
 * Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Time of creation: Feb 19, 2014 1:14:15 PM
 * Code function: creates a client object and variables associated with it
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.Calendar;//used for date functions
import java.text.DateFormat;//used in conjunction with the following class to output the current date to a string
import java.text.SimpleDateFormat;//used to format the date in a more simple way

public class BankClient {
	private String name, branch;
	private char gender;
	private int password;
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Calendar cal = Calendar.getInstance();
	String day = dateFormat.format(cal.getTime());
	
	public BankClient(){
		name = "NOT INITIALIZED!";
		branch = "NOT INITIALIZED!";
		gender = 'A';
		password = 0000;
	}
	
	public BankClient(String nameIn, String branchIn, char genderIn, int PasswordIn){
		name = nameIn;
		branch = branchIn;
		gender = genderIn;
		password = PasswordIn;
	}
	
	
	//begin setters
	public void setName(String nameIn){name = nameIn;}
	public void setBranch(String branchIn){branch = branchIn;}
	public void setDay(String dayIn){day = dayIn;}
	public void setGender(char genderIn){gender = genderIn;}
	
	//begin getters
	public String getName(){return name;}
	public String getBranch(){return branch;}
	public char getGender(){return gender;}
	public String getDate(){return day;}

	public int getPassword(){return password;}
	
	
}
