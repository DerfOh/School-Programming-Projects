import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class GUIFrame extends JFrame{
	//create BankAccount Objects
	static BankAccount checking = new CheckingAccount(100, 2.50);//balance, fee
	static BankAccount savings = new SavingsAccount(0.01, 200);//rate, balance
	static BankAccount retirement = new RetirementAccount (0.25, 100, 1200);//rate, balance, annual income
	
	//initialize some labels 
	private JLabel lbName;
	private JLabel lbAction;
	private JLabel lbAmount;
	private JLabel lbBalance;
	
	//initialized text fields
	private JTextField tfAmount;
	private JTextField tfBalance;
	
	//create two buttons
	private JButton btnClear;
	private JButton btnOK;
	
	//radio button
	private JRadioButton rbRetirement;
	private JRadioButton rbSavings; 
	private JRadioButton rbChecking;
	private ButtonGroup bgAccount;
	
	//transaction radio buttons
	private JRadioButton rbDeposite;
	private JRadioButton rbWithdraw;
	private JRadioButton rbTransfer;
	private ButtonGroup bgTransactions;
	
	//account class
	public BankAccount account;
	

	public GUIFrame(){
		
		//make it have a flow layout
		super("Banking Application");
		setLayout(new GridBagLayout());//sets frame layout
		GridBagConstraints c = new GridBagConstraints();
		


		//need to make labels real by creating actual objects
		lbName = new JLabel("Account");
		lbAction = new JLabel("Transaction");
		lbAmount = new JLabel("Amount");
		lbBalance = new JLabel("Balance");
		
		//add text fields
		tfAmount = new JTextField(20);
		tfBalance = new JTextField(20);
		
		
		//make buttons
		btnClear = new JButton("Clear");
		btnOK = new JButton("OK");
		
		//make radio buttons
		rbSavings = new JRadioButton("Savings");
		rbChecking = new JRadioButton("Checking");
		rbRetirement = new JRadioButton("Retirement");
		bgAccount = new ButtonGroup();
		
		//make transaction button groups
		rbDeposite = new JRadioButton("Deposite");
		rbWithdraw = new JRadioButton("Withdraw");
		rbTransfer = new JRadioButton("Transfer");
		bgTransactions = new ButtonGroup();
		
		
		//add buttons to group
		bgAccount.add(rbSavings);
		bgAccount.add(rbChecking);
		bgAccount.add(rbRetirement);
		
		//add transactions to group
		bgTransactions.add(rbDeposite);
		bgTransactions.add(rbWithdraw);
		bgTransactions.add(rbTransfer);
		
		
		//add the elements to the frame
		c.fill = GridBagConstraints.HORIZONTAL;//fills grid area according to element size
		c.gridy = 0;//sets position on grid y axis
		c.gridx = 0;//sets position on grid x axis
		add(lbName, c);
		c.gridx = 1;
		add(rbChecking, c);
		c.gridx = 2;
		add(rbSavings, c);
		c.gridx = 3;
		add(rbRetirement, c);
		

		//transactions
		c.gridy = 1;
		c.gridx = 0;
		add(lbAction, c);
		c.gridx = 1;
		add(rbWithdraw, c);
		c.gridx = 2;
		add(rbDeposite, c);
		c.gridx = 3;
		add(rbTransfer, c);
		
		//balance
		c.gridy = 2;
		c.gridx = 0;
		add(lbBalance, c);
		c.gridx = 1;
		add(tfBalance, c);

		//Amount
		c.gridy = 3;
		c.gridx = 0;
		add(lbAmount, c);
		c.gridx = 1;
		add(tfAmount, c);
		
		
		
		//add confirmation buttons
		c.gridy = 4;
		c.gridx = 0;
		add(btnClear, c);
		c.gridx = 1;
		add(btnOK, c);
		
		
		
		//add action listeners
		ButtonHandler btnHandler = new ButtonHandler();
		btnClear.addActionListener(btnHandler);
		btnOK.addActionListener(btnHandler);
		
		//add item listeners
		RadioListener rbListener = new RadioListener();
		rbChecking.addItemListener(rbListener);
		rbSavings.addItemListener(rbListener);
		rbRetirement.addItemListener(rbListener);
		
		rbDeposite.addItemListener(rbListener);
		rbWithdraw.addItemListener(rbListener);
		rbTransfer.addItemListener(rbListener);
	}

	
	//write a radio button listener that implements "ItemListener" stay changed method
	
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if (event.getSource() == btnOK){//checks the source of the event 
				
				try{
					double amount = Double.parseDouble(tfAmount.getText());
					if (rbChecking.isSelected()){
						if (rbWithdraw.isSelected()){
							MonetaryTransaction withdraw = new Withdraw(amount);
							checking.doTransaction(withdraw);
						}
						else if (rbDeposite.isSelected()){
							MonetaryTransaction deposit = new Deposit(amount);
							checking.doTransaction(deposit);
						}
						else if (rbTransfer.isSelected()){
							MonetaryTransaction withdraw = new Withdraw(amount);
							checking.doTransaction(withdraw);
							transferMenu(amount);
						}
						
						else if (rbTransfer.isSelected()){
							JOptionPane.showMessageDialog(null, "Please select the account to transfer the amount to by selecting it.");
						}					
						tfBalance.setText(String.valueOf(checking.getCurrentBalance()));
					}
					
					else if (rbSavings.isSelected()){
						if (rbWithdraw.isSelected()){
							MonetaryTransaction withdraw = new Withdraw(amount);
							savings.doTransaction(withdraw);
						}
						else if (rbDeposite.isSelected()){
							MonetaryTransaction deposit = new Deposit(amount);
							savings.doTransaction(deposit);
						}
						else if (rbTransfer.isSelected()){
							MonetaryTransaction withdraw = new Withdraw(amount);
							savings.doTransaction(withdraw);
							transferMenu(amount);
						}
						tfBalance.setText(String.valueOf(savings.getCurrentBalance()));
					}
					
					else if (rbRetirement.isSelected()){
						if (rbWithdraw.isSelected()){
							MonetaryTransaction withdraw = new Withdraw(amount);
							retirement.doTransaction(withdraw);
						}
						else if (rbDeposite.isSelected()){
							MonetaryTransaction deposit = new Deposit(amount);
							retirement.doTransaction(deposit);
						}
						else if (rbTransfer.isSelected()){
							MonetaryTransaction withdraw = new Withdraw(amount);
							retirement.doTransaction(withdraw);
							transferMenu(amount);
						}
						tfBalance.setText(String.valueOf(retirement.getCurrentBalance()));
					}
					
					
				}
				catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "You should enter an integer.");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
			
			}
			else if (event.getSource() == btnClear){
				tfAmount.setText("0.00");
				
			}
		}
	}
	
	private class RadioListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			
			
			if(event.getSource() == rbChecking){
				try{
					//JOptionPane.showMessageDialog(null, "Checking Selected");
					tfBalance.setText(String.valueOf(checking.getCurrentBalance()));
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			
			}
			
			
			else if (event.getSource()==rbSavings){
				try{
					tfBalance.setText(String.valueOf(savings.getCurrentBalance()));
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}

			}
			
			else if (event.getSource()==rbRetirement){
				try{
					tfBalance.setText(String.valueOf(retirement.getCurrentBalance()));
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			}
			
//			else if (event.getSource()==rbTransfer){
//				try{
//					double amount = Double.parseDouble(tfAmount.getText());
//					
//					
//				}
//				catch(Exception e){
//					JOptionPane.showMessageDialog(null,e);
//				}
//			}
			

		}
	}
	
	public void transferMenu(double amount){
		Object[] possibilities = {"Checking", "Savings", "Retirement"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Please choose the account to transfer the amount to...\n",
		                    "Transfer Menu",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    possibilities,
		                    " ");
		if (s == "Checking"){
			MonetaryTransaction deposit = new Deposit(amount);
			checking.doTransaction(deposit);
		}
		else if(s == "Savings"){
			MonetaryTransaction deposit = new Deposit(amount);
			savings.doTransaction(deposit);
		}
		else if(s == "Retirement"){
			MonetaryTransaction deposit = new Deposit(amount);
			retirement.doTransaction(deposit);
		}

		//If a string was returned, say so.
//		if ((s != null) && (s.length() > 0)) {
//		    setLabel("Green eggs and... " + s + "!");
//		    return;
//		}
//
//		//If you're here, the return value was null/empty.
//		setLabel("Come on, finish the sentence!");
	}
}
