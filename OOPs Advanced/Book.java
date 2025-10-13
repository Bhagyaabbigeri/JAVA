// Derived class or Child class 
public class Book extends LibraryItem {
    private int pages;

    public Book(String id, String author, String title, int pages) {
        super(id, title, author); // We are calling a super Constractor bcz of default Constractor
        this.pages = pages; // if u dont call super Constractor, error occure
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("No of pages: " + this.pages);
    } // So this how we do an Override of that method which is also defineing the
      // child class in the Parent class

    public void checkout() {
        System.out.println("Checking out the book");
    }
}