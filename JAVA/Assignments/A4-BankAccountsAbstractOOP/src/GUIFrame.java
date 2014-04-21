import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUIFrame extends JFrame{
	//initialize some labels 
	private JLabel lbName;
	private JLabel lbAction;
	
	//initialized text fields
	private JTextField tfAmount;
//	private JTextField tfAge;
	
	//create two buttons
	private JButton btnCancel;
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
		setLayout(new FlowLayout());//sets frame layout


		//need to make labels real by creating actual objects
		lbName = new JLabel("Account");
		lbAction = new JLabel("Transaction");
		
		//add text fields
		tfAmount = new JTextField(20);
		tfAmount.setText("0.00");//can specify what will be in the field
		
		//make buttons
		btnCancel = new JButton("Cancel");
		btnOK = new JButton("OK");
		
		//make radio buttons
		rbSavings = new JRadioButton("Savings", true);//true indicates default option
		rbChecking = new JRadioButton("Checking");
		rbRetirement = new JRadioButton("Retirement");
		bgAccount = new ButtonGroup();
		
		//make transaction button groups
		rbDeposite = new JRadioButton("Deposite", true);
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
		add(lbName);
		add(rbChecking);
		add(rbSavings);
		add(rbRetirement);
		

		//transactions
		add(lbAction);
		add(rbWithdraw);
		add(rbDeposite);
		add(rbTransfer);
		
		

		//Amount
		add(tfAmount);
		
		//add confirmation buttons
		add(btnCancel);
		add(btnOK);
		
		
		
		//add action listeners
		ButtonHandler btnHandler = new ButtonHandler();
		btnCancel.addActionListener(btnHandler);
		btnOK.addActionListener(btnHandler);
		//rbChecking.addActionListener(itmListener);
		
		//add item listeners
		ItemListener itmListener = new ItemListener();
		rbChecking.addActionListener(itmListener);
		
		
	}

	
	//write a radio button listener that implements "ItemListener" stay changed method
	
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if (event.getSource() == btnOK){//checks the source of the event 
				
				try{
//					if(event.getSource() == rbChecking){
//						JOptionPane.showMessageDialog(null, "Checking Selected.");
//					}
					double amount = Double.parseDouble(tfAmount.getText());
					JOptionPane.showMessageDialog(null, amount);
				}
				catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "You should enter an integer.");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
			
			}
			else if (event.getSource() == btnCancel){
				tfAmount.setText("0.00");
				
			}
		}
	}
	
	private class ItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			
			if(event.getSource() == rbChecking){
				try{
					JOptionPane.showMessageDialog(null, "Checking Selected");
					//fill out actions
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			
			}
			
			
			else if (event.getSource()==rbSavings){
				try{
					JOptionPane.showMessageDialog(null, "Savings Selected");
						//fill out actions
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}

			}
			
			else if (event.getSource()==rbRetirement){
				try{
					JOptionPane.showMessageDialog(null, "Retirement Selected");
						
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			}
			
			
		
		}
	}
}
