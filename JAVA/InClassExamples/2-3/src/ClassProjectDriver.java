import java.util.Scanner;
public class ClassProjectDriver {

	public static void setInfo(Person guy){
		Scanner input = new Scanner(System.in);
		int newAge = 0;
		String newName = "";
		System.out.println("Please enter the age: ");
		newAge = input.nextInt();
		
		System.out.println("Please enter the name: ");
		input.nextLine();
		newName = input.nextLine();
		guy.setAge(newAge);
		guy.setName(newName);
	}
	
	public static void main(String[] args) {
		

		Person peter = new Person();
		Person jerry = new Person();
		
		setInfo(peter);
		setInfo(jerry);
		
		System.out.printf("\n\n%s is %d years old.\n\n", peter.getName(), peter.getAge());
		System.out.printf("\n\n%s is %d years old.\n\n", jerry.getName(), jerry.getAge());


	}

}
