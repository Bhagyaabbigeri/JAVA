//Another child class
public class EBook extends Book { // this extends from Book.java
    String fileformate;

    public EBook(String id, String title, String author, int pages, String fileformate) {
        super(id, author, title, pages);
        this.fileformate = fileformate;
    }

    public String getFileFormate() {
        return fileformate;
    }

    public void Search(String name) // this is search function in 2 different way, (1st way)
    {
        System.out.println("Searching by name");
    }

    public void Search(String author, String id) // this is search by author (2nd way)
    {
        System.out.println("Searching by autor");
    }

    // this 2 void search are called as Method Overriding based on ur input it
    // decides wheather to search 1st search method or 2nd

}
