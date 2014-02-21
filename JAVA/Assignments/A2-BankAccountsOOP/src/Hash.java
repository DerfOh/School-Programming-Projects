/**
 * Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Time of creation: Feb 20, 2014 12:00:26 PM
 * Code function: An Object oriented banking program, 
 * this class creates an object that can find the starting and ending
 * locations of a clients accounts in a database
 * 
 * Class: Problem Solving and Programming with Java - CSC 276
 */

public class Hash{
	static int max = 0;
	static int startingPoint;
	public Hash(int clientIndexIn){
		max = setMaximum(clientIndexIn);//algorithm to determine the maximum size of index based on the index of the client
		startingPoint = setStartingPoint();
	}
	
	public int setMaximum (int clientIndexIn){
		int max = (3*clientIndexIn)+2;//algorithm to determine the maximum size of index based on the index of the client
		return max;
	}
	
	public int setStartingPoint(){
		int startingPoint;
		if (max==2){
			startingPoint = 0;
		}
		else{
			startingPoint = max - 2;
		}
		return startingPoint;
	}
	
	public int getMax(){return max;}
	public int getStartPoint(){return startingPoint;}
}
