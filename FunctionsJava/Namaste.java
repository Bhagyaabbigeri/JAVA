public class Namaste {
    public static void main(String[] args) {
        enuMadudila(); // Function call or invocation

    }

    // fuctions definition
    static void enuMadudila() {
        String message = "Namaste Bharat!";
        PrintMessage(message); // PrintMessage("Namaste Bharat!");
    }

    static String PrintMessage(String message) {
        System.out.println(message);
        return message;
    }
}
