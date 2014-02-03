import java.util.Scanner;
public class ClassProjectDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Person peter = new Person();
		int newAge = 0;
		String newName = "";
		
		
		System.out.println("Please enter the age: ");
		newAge = input.nextInt();
		
		System.out.println("Please enter the name: ");
		input.nextLine();
		newName = input.nextLine();
		
		peter.setAge(newAge);
		peter.setName(newName);
		
		
		System.out.printf("\n\n%s is %d years old.\n\n", peter.getName(), peter.getAge());

	}

}
