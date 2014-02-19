/**
 * Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Time of creation: Feb 19, 2014 1:14:15 PM
 * Code function: creates a client object and variables associated with it
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.Calendar;//used for date functions

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
	
	public void setName(String nameIn){name = nameIn;}
	public void setBranch(String branchIn){branch = branchIn;}
	public void setDay(String dayIn){day = dayIn;}
	public void setGender(char genderIn){gender = genderIn;}
	
	
}
