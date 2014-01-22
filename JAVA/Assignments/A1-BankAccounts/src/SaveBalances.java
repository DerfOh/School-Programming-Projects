import java.io.*;
public class SaveBalances extends BankAccount {
	Writer writer = null;

	public void writeToFile(){
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("filename.txt"), "utf-8"));
		    writer.write("1. Checking\t%.2f\n", checkingBalance);
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
}
