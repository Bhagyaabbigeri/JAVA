import java.util.Scanner;

public class Workshop { // class method

    // 1 - Function getSum to get Sum of numbers

    public static int getSum(int number1, int number2) // functionmethod,here(int=returntype,getsum=functionname,()=inputarguments)
    {
        int sum = number1 + number2; // variable declaration using datatypes and returning
        return sum;
    }

    public static void invoke_getSum() // invocation method
    {
        int result = getSum(1000, 9000);
        System.out.println("Sum of two numbers is = " + result); // print method to get output
    }

    // 2 - Function swapNumbers to swap two variable values

    // this code does not work, it is written here to demonstrate that
    // java is using pass by value
    public static void swap(int number1, int number2) {
        int temp = number1; // in java this all varibles are allocated in stack
        number1 = number2; // and they dont go value by reference , they go value by value
        number2 = temp;
        System.out.println(" number1 = " + number1 + " number2 = " + number2);
    }

    // pass by reference example using the array
    public static void swap_v2(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }

    public static void invoke_swap() {
        int input1 = 1000;
        int input2 = 9000;
        System.out.println(" BEFORE Input1 = " + input1 + " input2 = " + input2);
        swap(input1, input2);
        System.out.println(" AFTER Input1 = " + input1 + " input2 = " + input2);

        int[] input3 = { 1000, 9000 }; // input3 is (array) Arrays(objects) in Java are passed by reference
        swap_v2(input3);
        System.out.println(" AFTER input3[0] = " + input3[0] + " input3[1] = " + input3[1]);
    }

    // 3 - Function is even to return true if number is even otherwise false

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " Number is even ");
            return true;
        } else {
            System.out.println(number + " Number is odd ");
            return false;
        }
    }

    public static void invoke_isEven() {
        isEven(8000);
        isEven(9999);
    }

    // 4 - Function isNumber to return true if it is a digit

    public static boolean isNumber(String input) {
        boolean result = true;
        for (int index = 0; index < input.length(); index++) {
            char character = input.charAt(index);
            if (character < '0' || character > '9') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void invoke_inNumber() {
        boolean result = isNumber("1233223399a");
        if (result) {
            System.out.println("It is proper number");
        } else {
            System.out.println("It is invalid number");
        }
    }

    // 5 - Function SimpleGreeting to accept name as input and print simple
    // greetings Namaskara name

    public static void simpleGreet() {
        Scanner reader = new Scanner(System.in); // take system user input so we used system.in
        System.out.println("Enter your name:");

        String Name = reader.nextLine(); // reader is object it is used to store the user input
        reader.close();

        System.out.println(" Namaskara " + Name);

    }

    // 6 - Function to print ASCII value of string input

    public static void printASCII(String input) {
        char character;

        for (int index = 0; index < input.length(); index++) {
            character = input.charAt(index); // charAt function used indexing and give set of character
            int asciiValue = character;

            System.out.println(" Asccii value of the char " + character + " " + asciiValue);
        }
    }

    public static void invoke_printAscii() {
        printASCII("abc");
    }

    // 7 - Function to getStrlength to get string length

    public static int getStringlength(String input) {
        int length = 0;

        for (char c : input.toCharArray()) {
        }

        return length;
    }

    public static void invoke_stringlength() {
        String input = "ab";
        int result = getStringlength(input);

        System.out.println("Length of the string is " + result);

    }

    // 8 - Function to count vowels getCountOfOvewels for a given string

    public static int getCountOfOvewels(String input) {
        int count = 0;

        for (int index = 0; index < input.length(); index++) {
            char character = input.charAt(index);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                count++;
        }
        return count;
    }

    public static void invoke_getCountOfVowels() {
        String input = "aeiou";

        int count = getCountOfOvewels(input);
        System.out.println("number of voewes in string " + input + " " + count);
    }

    // 9 - Fumtion to Reverse string reverseString

    public static String reverseString(String input) {
        StringBuilder output = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            output.append(input.charAt(index));
        }

        return output.toString();
    }

    public static void invoke_reverseString() {
        String input1 = "abcd";

        String output1 = reverseString(input1);

        System.out.println(" input " + input1 + " output " + output1);
    }

    // another way of reverseString code

    public static String reverseStringV2(String input) {
        char[] inputArray = input.toCharArray();

        int leftIndex = 0;
        int rightIndex = input.length() - 1;

        while (leftIndex < rightIndex) {
            char temp = inputArray[leftIndex];
            inputArray[leftIndex] = inputArray[rightIndex];
            inputArray[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        String output = new String(inputArray);
        System.out.println(output);

        return output;
    }

    public static void invoke_reverseStringV2() {
        String input1 = "abcd";

        // String output1 = reverseString(input1);

        String output1 = reverseStringV2(input1);
        System.out.println(" Input " + input1 + " Output " + output1);
    }

    // 10 - Function to get sum of all elements in the integer array getSum

    public static int getSumArray(int[] input) { // [] this bcz we are using array here
        int sum = 0;

        for (int index = 0; index < input.length; index++) {
            sum = sum + input[index];
        }
        return sum;
    }

    public static void invoke_getSumArray() {
        int[] input1 = { 111, 120, 99 };
        int sumofElements = getSumArray(input1);
        System.out.println(" Sum of elements = " + sumofElements);

    }

    // 11 - Function to find given string palindrome function isPalindromereturn
    // trueif string ispalindrome

    public static boolean isPalidrome(String input) {
        boolean result = true;

        int leftIndex = 0; // this part is called initialazation
        int rightIndex = input.length() - 1; // to count string characters so length() is taken

        while (leftIndex < rightIndex) // while loop is used bcz we use two conditions like here left and right,if its
                                       // only left,we use for loop
        {
            if (input.charAt(leftIndex) != input.charAt(rightIndex)) // charAt function is used for Indexiing,like
                                                                     // A=0,B=1,C=2
            {
                result = false;
                break;
            }
            leftIndex++;
            rightIndex--;
        }
        return result;
    }

    public static void invoke_isPalidrome() {
        String input1 = "abccba";
        boolean result = isPalidrome(input1);

        if (result == true) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is NOT palindrome");
        }
    }

    // 12 - Function to print Max and Min value from an integer array, printMaxMin

    public static void printMaxMin(int[] numbers) // [] bcz we taken array
    {
        if (numbers.length == 0)
            return;

        int max = numbers[0];
        int min = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > max)
                max = numbers[index];

            if (numbers[index] < min)
                min = numbers[index];
        }
        System.out.print(" MAX value = " + max);
        System.out.print(" MIN value = " + min);
    }

    public static void invoke_printMaxMin() {
        int[] input1 = { 123, 982, 563, 784, 500 };

        printMaxMin(input1);
    }

    // 13 - Funxtion to search in an sorted integer array

    public static boolean binarySearch(int[] numbers, int key) {
        boolean isFound = false;

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        int midIndex = rightIndex - leftIndex / 2;

        while (leftIndex <= rightIndex) {
            if (key == numbers[midIndex]) {
                isFound = true;
                break;
            }

            if (key > numbers[midIndex]) {
                leftIndex = midIndex + 1;
            }

            else if (key < numbers[midIndex]) {
                rightIndex = rightIndex - 1;
            }

            midIndex = leftIndex + (rightIndex - leftIndex) / 2;
        }

        return isFound;
    }

    public static void invoke_binarySearch() {
        int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 9;

        boolean result = binarySearch(input1, key);

        if (result) {
            System.out.println(" number is found ");
        } else {
            System.out.println(" number is not found ");
        }
    }

    // 14 - Function to merge two arrays and return combined output in first array
    // Assume that master array has memory allocated to have all elements from data

    public static void mergeArrays(int[] masterArray, int[] data) {
        int countData = data.length;

        int startIndex = masterArray.length - countData;

        for (int dataIndex = 0; startIndex < masterArray.length; startIndex++, dataIndex++) {
            masterArray[startIndex] = data[dataIndex];

        }
    }

    public static void printArray(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }

    public static void invoke_mergeArrays() {
        int[] masterArray = { 1, 2, 3, 0, 0, 0 };
        int[] data = { 906, 5674, 78432 };

        mergeArrays(masterArray, data);

        printArray(masterArray);
    }

    // 15 - Function get second largest element in an integer array getSrcondLargest

    public static int getScondLargest(int[] numbers) {
        if (numbers.length == 0)
            return -1;

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > largest) {
                secondLargest = largest;
                largest = numbers[index];
            } else if (numbers[index] > secondLargest) {
                secondLargest = numbers[index];
            }
        }
        return secondLargest;
    }

    public static void invoke_getScondLargest() {
        int[] input1 = { 1, 2, 3, 4, 5, 6 };
        // int[] input1 = {5, 1, 2, 3, 4, 6};
        // int[] input1 = {5, 2};

        int result = getScondLargest(input1);

        System.out.println("Second largest element is " + result);
    }

    // 16 - Function to print unique elements in an integer array
    // printUniqueElements

    public static void printUniqueElements(int[] numbers) {
        for (int readIndex = 0; readIndex < numbers.length; readIndex++) {
            boolean isDuplicate = false;

            for (int compareIndex = 0; compareIndex < numbers.length; compareIndex++) // for loop within for loop
            {
                if (readIndex == compareIndex)
                    continue;

                if (numbers[readIndex] == numbers[compareIndex]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false)
                System.out.println(numbers[readIndex]);
        }
    }

    public static void invoke_printUniqueElements() {
        int[] input1 = { 6, 1, 2, 3, 4, 2, 6, 4 };
        printUniqueElements(input1);
    }

    // 17 - Function to print intersection or common elements of two integer arraya
    // printCommonElements

    public static void printCommonElements(int[] input1, int[] input2) {
        for (int input1Index = 0; input1Index < input1.length; input1Index++) {
            boolean isFound = false; // it has to be inside the for loop only
            for (int input2Index = 0; input2Index < input2.length; input2Index++) {
                if (input1[input1Index] == input2[input2Index]) {
                    isFound = true;
                    break;
                }
            }
            if (isFound)
                System.out.println(input1[input1Index]);
        }
    }

    public static void invoke_printCommonElements() {
        int[] input1 = { 1, 2, 3, 4, 5 };
        int[] input2 = { 4, 5, 9, 10 };

        printCommonElements(input1, input2);
    }

    // 18- Funvtion to get count of words in the string getCountOfWords

    public static int getCountOfWords(String input) {
        int countOfWords = 0;

        if (input == null)
            return countOfWords;

        if (input.length() == 0) // this is for error handling
            return countOfWords;

        for (int index = 0; index < input.length(); index++) {
            char oneChar = input.charAt(index);

            if (oneChar == ' ' || oneChar == '\t' || oneChar == '\n') // || = or , ' ' = space between character
            {
                countOfWords++;
            }
        }

        // Increment the count for the last word
        countOfWords = countOfWords + 1;
        return countOfWords;
    }

    public static void invoke_getCountOfWords() {
        // String input = "I want to serve my Nation, INDIA";
        // String input = null;
        String input = ""; // "" = Empty String
        int countOfWords = getCountOfWords(input);
        System.out.println(" Number of words in " + input);
        System.out.println(countOfWords);
    }

    // 19 - Function to print binary values of various input like integer, char ,
    // also perform shift operations on integers

    static void printBinary(int number) // Singed Int, positive and negative numbers
    {
        if (number < 0)
            return;

        int countOfBits = Integer.BYTES * 8;

        // Ex: Integer is 4 bytes, 4*8 = 32 bits , left most bit is for the sign
        // 31 bits for the value

        int mask = 1;
        mask = mask << (countOfBits - 2);

        System.out.println("\nBinary form of number " + number + "  ");
        while (mask > 0) {
            int result = number & mask;
            if (result != 0)
                System.out.print("1");
            else
                System.out.print("0");

            mask = mask >> 1;
        }
    }

    static void invoke_printBinary() {
        printBinary(500);
        printBinary(2);
        printBinary(3);
        printBinary(4);

    }

    // 20 - Function to remove spaces from the string removeSpaces

    static String removeSpaces(String input) {
        StringBuilder result = new StringBuilder(); // In java stringBuilder are immutable that's why we use

        for (int index = 0; index < input.length(); index++) {
            char oneChar = input.charAt(index);
            if (oneChar == ' ')
                continue;

            result.append(oneChar);
        }

        return result.toString();
    }

    static void invoke_removeSpaces() {
        String result = "";

        result = removeSpaces(" Namaskara Algorithm365 ");
        System.out.println(result);

        result = removeSpaces("  i      love     learning    ");
        System.out.println(result);

    }

    public static void main(String[] args) // here void is returntype of main method
    {
        invoke_removeSpaces();
    }
}
