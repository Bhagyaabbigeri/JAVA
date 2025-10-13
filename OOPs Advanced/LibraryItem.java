//Parent class //LibraryItem internally it inheritance from object and object to LibraryItem and to Book
abstract class LibraryItem { // we just changed class name into abstract
    public String Id;
    private String title;
    protected String author;

    // Constractor, no return type
    public LibraryItem(String Id, String title, String author) // Here we have overwriteen default constructor and
                                                               // Prameters passed
    {
        this.Id = Id;
        this.title = title;
        this.author = author;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Id: " + this.Id);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }

    private void searchItems(String name)// Private method
    {
        System.out.println("Searching ");
    }

    protected void searchAllItems(String name) {
        System.out.println("Inside protected method - Searching ");
        this.searchItems(name);
    }

    // Declaring an abstract method, all the child classes of this must implement
    // this method.
    abstract public void checkout(); // Method declaration
}

//here how u decide which method should be abstract and which not, 1)= to which method u dont need to implement to all child classes, should write in parent class 
// 2)= and if no need to create child class's object then do abstract