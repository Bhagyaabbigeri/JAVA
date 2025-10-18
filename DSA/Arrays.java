public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 1, 9, 2 }; // Declare , initialize
        System.out.println("Number of elements in the array = " + numbers.length);
        numbers[0] = 10;
        System.out.println("Values in the array numbers \n");
        printElements2(numbers);

        int[] ages = new int[3]; // otherway to do
        ages[0] = 50;
        ages[1] = 60;
        ages[2] = 70;
        System.out.println("Values in the ages \n");
        printElements2(ages);

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };

        System.out.println("Values in the matrix \n");
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[0][2]);

        java.util.Arrays.sort(numbers); // sorting
        printElements2(numbers);
    }

    public static void printElements2(int[] elements) {
        // Generating the sequential array index from 0 to length-1
        for (int element : elements) {
            System.out.print(" " + element);
        }
    }
}