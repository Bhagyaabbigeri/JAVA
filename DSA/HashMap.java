import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        // demoHashMap();
        WordCountDemo();
    }

    public static void demoHashMap() {
        Map<Integer, String> students = new java.util.HashMap<>();
        // Map<String, String> books = new java.util.HashMap<>();

        // Add the elements to the dictionary
        students.put(1, "Bhagya");
        students.put(2, "Reddy");
        students.put(100, "Raj");
        students.put(11132, "Devi");
        students.put(2343, "Jay");
        students.put(200, "Vish");
        students.put(400, "Sudha");

        // Update
        students.put(1, "Bhagya Shree");

        // Search

        // Integer searchStudentId = 2343; // present
        Integer searchStudentId = 23431; // not present
        if (students.containsKey(searchStudentId)) {
            System.out.println("Student list has this student " + searchStudentId);
        } else {
            System.out.println("Student is not found in the list " + searchStudentId);
        }

        // Remove
        String removedValue = students.remove(500);
        System.out.println(removedValue);

        for (String value : students.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Key value is " + student.getKey() + " value = " + student.getValue());
        }

    }

    public static void WordCountDemo() {
        String[] words = { "hello", "good", "weather", "algo", "good", "hello", "coding", "java", "good", "hello" };

        Map<String, Integer> wordCount = new java.util.HashMap<>();

        for (String word : words) {
            Integer value = wordCount.getOrDefault(word, 0);
            value = value + 1;
            wordCount.put(word, value);
        }

        for (Map.Entry<String, Integer> word : wordCount.entrySet()) {
            System.out.println("Word is " + word.getKey() + " count  = " + word.getValue());
        }
    }

}