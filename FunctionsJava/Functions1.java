public class Functions1 {
    public static void main(String[] args) {
        // Call method properly (no named arguments in Java)
        String studentName = getTopperNameForSubjectGrade(1, "Maths");
        System.out.println("Topper: " + studentName);

        printStudentDetails(1);
    }

    // who is the topper ?
    // which subject ?
    // which grade ?
    // response name of the subject
    static String getTopperNameForSubjectGrade(int grade, String subject) {
        // Dummy implementation
        String name = "Reddy";
        return name;
    }

    static int[] getTotalCountOfBoysGirls(int schoolID) {
        // Dummy
        int[] result = { 500, 500 };
        return result;
    }

    static void printStudentDetails(int studentID) {
        // Dummy
        String name = "Bhagya";
        int age = 18;
        int grade = 10;
        double CGPA = 9.2;
        boolean isRegularToSchool = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("CGPA: " + CGPA);
        System.out.println("Regular to School: " + isRegularToSchool);
    }
}
