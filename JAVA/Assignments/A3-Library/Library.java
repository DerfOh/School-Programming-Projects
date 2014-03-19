/* Author: Fredrick Paulin <fredrick@fredrickpaulin.com>
 * Code function: implements a library class, methods and variables added. 
 * Class: Problem Solving and Programming with Java - CSC 276
 */

import java.util.ArrayList;

public class Library {
    
    private String address;
    static ArrayList<Book> catalogue = new ArrayList<Book> ();//creates an array of books available in the catalogue
	
	// Add the missing implementation to this class
	
	// Library Constructor
	public Library(String streetAddress){
		address = streetAddress;
	}
		
	public void addBook(Book BookObj){
		//implement this method
		//use an array arraylist to store the books
		catalogue.add(BookObj);
	}
	
	public void borrowBook(String title){
		for (int i = 0; i<catalogue.size(); i++){//cycles through the array
			if (catalogue.get(i).getTitle() == title){//compares the book titles
				catalogue.get(i).borrowed();//calls the borrowed function in the book class setting borrowed to true
				break;
			}
		}
	}
	
	public void printAvailableBooks(){
		System.out.println("Our currently available books: ");
		for (int i = 0; i<catalogue.size(); i++){
			if(!(catalogue.get(i).isBorrowed())){//gets the boolean of the book being borrowed, if NOT Borrowed then print the title
				System.out.println(catalogue.get(i).getTitle());
			}
		}
	}
	
	public void returnBook(String title){
		for (int i = 0; i<catalogue.size(); i++){//cycles through the array
			if (catalogue.get(i).getTitle() == title){//compares the book titles
				catalogue.get(i).returned();//calls the borrowed function in the book class setting borrowed to true
				break;
			}
		}		
	}
	
	public void printAddress(){
		System.out.println(address);
	}
	
	public static void printOpeningHours(){
		System.out.println("Open daily between 9:00 am to 5:00 pm");
	}
    
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Great Library Road, Smart Town");
        Library secondLibrary = new Library("228 Fantastic Liberty Street, Smart Town");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 