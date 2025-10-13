public class Application {

    public static void main(String[] args) {
        int demo = 5; // creating an integer variable(demo)& assigning the value 5,allocated in stack

        // Declare the variable newStudent and create an object of type Student
        Student newStudent = new Student(); // Heap memory dynamic memory allocation

        // Access the public variables of the class and update values
        newStudent.Name = "Reddy";
        newStudent.Age = 24;
        newStudent.Hometown = "Bangaluru";

        // newStudent.ID = 1;You can't access private variable like this,compiler won't
        // allow

        // Access or invoke public methods of the class for the object newStudent
        System.out.println("Student name is " + newStudent.getName());
        System.out.println("Student age is " + newStudent.getAge());

        // newStudent.updateName("Shree"); You can't access private method like this

        // Run time error NullPointerException
        Student secondStudent = null;
        if (secondStudent != null) {
            secondStudent.Name = "Shree"; // Dead code, this will never be executed
        }

        // Creating another student object with "constructor" taking input
        // Make sure Student class has a matching constructor
        secondStudent = new Student("Shree", 21, "BTECH", "Bengaluru");
        System.out.println("Student name is " + secondStudent.getName());
        System.out.println("Student age is " + secondStudent.getAge());

        BookManagement operations = new BookManagement();
        Book book1 = new Book("PCS",
                "Mahesh Arali",
                "Coding",
                "1");

        operations.checkoutBook(secondStudent, book1);
        operations.checkoutBook(newStudent, book1);

        operations.returnBook(newStudent, book1);

    }
}