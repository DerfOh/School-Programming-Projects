import java.util.ArrayList; //imports the array list classa
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person> ();//creating an array list for person objects
		
		Person stephan = new Person(); //init person objects
		stephan.setName("Stephan"); //set variables inside object
		stephan.setAge(22);
		int hisAge = stephan.getAge();//example of how to retrieve the value of a variable using a "get" method
		
		Person robb = new Person(); //init another person...
		robb.setName("Robb");
		robb.setAge(42);
		
		Person sam = new Person(); //one more
		sam.setName("Sam");
		sam.setAge(20);
		
		
		
		
		//assign to a list by using the "add" within arrayList package method
		personList.add(stephan);
		personList.add(robb);
		//personList.add(sam);
		
		
		//to move someone to the first position use the overloaded add method with position zero
		personList.add(0, sam);
		
		//to change a specific object's value in an array of objects. The-name-of-the-array.get(index).methodOrVariable
		personList.get(1).setAge(21);
		
		//to display the name of a person object within the array
		System.out.printf("The name of person 2 is: %s\n", personList.get(1).getName());
		
		//to find the index of a specific name, use the indexOf method
		System.out.printf("Robb is located at index: %d\n", personList.indexOf(robb));
		
		//to find the size of an array of objects
		System.out.printf("The size of the array is \n", personList.size());
		
		//testing wrapper class
		ArrayList<Integer> intList = new ArrayList<Integer> ();
		intList.add(1);
		intList.add(2);
		
		
		
		
		//extra class stuff
		personList.add(1, robb);
		System.out.printf("The new name of person 1 is: %s\n", personList.get(0).getName());
		System.out.printf("The new name of person 2 is: %s\n", personList.get(1).getName());
		System.out.printf("The new name of person 3 is: %s\n", personList.get(2).getName());
		System.out.printf("Robb is located at position: %d\n", personList.indexOf(robb));
		System.out.printf("Sam is located at position: %d\n", personList.indexOf(sam));
		System.out.printf("Stephan is located at position: %d\n", personList.indexOf(stephan));
		
	}

}
