
import java.util.Scanner;

//demonstration of using a for loop to initialize a multidimensional array
public class ArrayTest {
	

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);  
			
			int [][] intArray = new int [3][4];
			
			for (int i = 0; i<3; i++){//usually represents the row
				for (int j = 0; j<4; j++){//represents the column
					intArray[i][j] = 10;
					//System.out.println(intArray[i][j]);//checks the array values
				}
			}
		
		
			int [][] intArray2 = {{1,2}, {3,4,5}, {6,7,8,9}}; //hard coded multidimensional array that has a different number of values in columns and rows
			for (int[] b: intArray2){//to display these values we use an enhanced for loop. make not of the usage of the colon, we can only read values in these loops
				for (int c: b){
					System.out.printf(c + "\t");
				}
				System.out.println();
				
			}
			
			//to prompt the user to input values into the array
			for (int i = 0; i<intArray2.length; i++){
				for (int j = 0; j<intArray2[i].length; j++){ //for as many items there are in the row
					intArray2[i][j] = input.nextInt();
				}
			}
			
			for (int[] b: intArray2){//to display these values we use an enhanced for loop. make not of the usage of the colon, we can only read values in these loops
				for (int c: b){
					System.out.printf(c + "\t");
				}
				System.out.println();
				
			}
			
			
			int [][] intArray3 = new int [3][]; //initialized, I know I have 3 rows but I don't know how many columns
			intArray3[0] = new int [2];//refers to the first row
			intArray3[1] = new int [3];//second row
			intArray3[2] = new int [4];//third row
			
			for (int i = 0; i<intArray3[2].length; i++){
				intArray3[2][i] = i+3;
				
			}
		}
		
}