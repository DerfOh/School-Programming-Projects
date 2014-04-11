import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUIFrame extends JFrame{
	//initialize some labels 
	private JLabel lbName;
	private JLabel lbAge;
	
	//initialized text fields
	private JTextField tfName;
	private JTextField tfAge;
	
	//create two buttons
	private JButton btnCancel;
	private JButton btnOK;
	
	//radio button
	private JRadioButton rbSavings; 
	private JRadioButton rbChecking;
	private ButtonGroup bgAccount;
	

	public GUIFrame(){
		//make it have a flow layout
		super("GUI is Fun");
		setLayout(new FlowLayout());//sets frame layout


		//need to make labels real by creating actual objects
		lbName = new JLabel("Name");
		lbAge = new JLabel();//or you can not put text in and use setText()
		lbAge.setText("Age");//
		
		//add text fields
		tfName = new JTextField(20);
		tfName.setText("Enter your name");//can specify what will be in the field
		tfAge = new JTextField(20);
		tfName.setText("Enter your age");
		
		//make buttons
		btnCancel = new JButton("Cancel");
		btnOK = new JButton("OK");
		
		//make radio buttons
		rbSavings = new JRadioButton("Savings", true);//true indicates default option
		rbChecking = new JRadioButton("Checking");
		bgAccount = new ButtonGroup();
		//add buttons to group
		bgAccount.add(rbSavings);
		bgAccount.add(rbChecking);
		
		
		//add the elements to the frame
		add(lbName);
		add(tfName);
		add(lbAge);
		add(tfAge);
		add(rbChecking);
		add(rbSavings);
		//add(bgAccount);
		add(btnCancel);
		add(btnOK);
		
		
		
		//add action listeners
		ButtonHandler btnHandler = new ButtonHandler();
		btnCancel.addActionListener(btnHandler);
		btnOK.addActionListener(btnHandler);
		
	}

	
	//write a radio button listener that implements "ItemListener" stay changed method
	
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if (event.getSource() == btnOK){//checks the source of the event 
				
				try{
					int age = Integer.parseInt(tfAge.getText());
					JOptionPane.showMessageDialog(null, tfName.getText() +" is " + tfAge.getText() + " years old.");
				}
				catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "You should enter an integer.");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
			
			}
			else if (event.getSource() == btnCancel){
				tfName.setText("");
				tfAge.setText("");
				
			}
		}
	}
}
