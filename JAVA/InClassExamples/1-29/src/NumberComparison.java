import java.util.Scanner;

public class NumberComparison {
	
	static public String isEqual(int n1, int n2){
		if (n1 == n2){
			return "Equal";
		}
		else{
			return "Not Equal";

		}
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	
	
	
	
	switch (isEqual(n1, n2)){
	case "Equal":
		System.out.printf("%d + %d = %d", n1, n2, (n1+n2) );
		break;
	
	case "Not Equal":
		System.out.printf("%d - %d = %d", n1, n2, (n1-n2) );
		break;
		
	}
		
		
	}
	
	

}
