import java.util.InputMismatchException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.Scanner;

/* Author: Fredrick Paulin <fpaulin@umflint.edu>
 * Code function:  
 * Class: Problem Solving and Programming with Java - CSC 276
 */

public class Driver  {

	static Scanner input = new Scanner(System.in);
	static  double amount;
	
	public static void main(String[] args) {
		
		GUIFrame guiFrame = new GUIFrame(); //create a frame object
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the window when finished
		
		guiFrame.setSize(400, 200);
		guiFrame.setVisible(true);
		
		System.out.println("Welcome to the bank application");
	}

}