import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUITest {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "Java is fun!");
//		String str = JOptionPane.showInputDialog("What is your name?"); //get input from user
//		JOptionPane.showMessageDialog(null, "Your Name is: " + str );
		
		GUIFrame guiFrame = new GUIFrame(); //create a frame object
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the window when finished
		
		guiFrame.setSize(300, 400);
		guiFrame.setVisible(true);

		
		
		
	}

}
