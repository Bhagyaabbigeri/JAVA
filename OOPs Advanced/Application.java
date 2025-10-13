public class Application {
    public static void main(String[] args) {
        // Parent class object
        // LibraryItem item1 = new LibraryItem("123", "PCS", "Mahesh"); //commenting
        // this bcz we used abstract instead off class
        // item1.displayInfo();
        // System.out.println("------------------"); //rest of LibraryItem will
        // work,only this part needed to be comment bcz i was creatng an object of child
        // class

        // - Try this when you are leanring about abstract class and interfaces.
        // Why we can't assign the object of one child class to the variable of type
        // another child class
        // Book bookalpha;
        // bookalpha = new Magazine();

        // Child class object
        Book book1 = new Book("124", "Mahesh", "DSA", 250);
        book1.displayInfo();
        book1.checkout();
        System.out.println("------------------");

        // Child class object
        Magazine magazine1 = new Magazine("234", "Marketing", "Reddy", 101);
        magazine1.displayInfo();
        System.out.println("------------------");

        EBook ebook1 = new EBook("111", "PCS by Mahesh", "Mahesh", 250, "Pdf");
        ebook1.displayInfo();
        System.out.println("File format : " + ebook1.getFileFormate()); // this bcz if u dont override in EBook

        ebook1.Search("PCS");
        ebook1.Search("Mahesh", "123");
    }
}
