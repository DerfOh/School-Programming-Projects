public class Book {

    private String title;
    private boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        //Implement this method
    }
   
    // Marks the book as rented
    public void borrowed() {
        //Implement this method
    }
   
    // Marks the book as not rented
    public void returned() {
        //Implement this method
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        //Implement this method
    }
   
    // Returns the title of the book
    public String getTitle() {
        //Implement this method
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title: " + example.getTitle());
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed?: " + example.isBorrowed());
    }
} 