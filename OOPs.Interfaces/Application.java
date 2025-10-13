public class Application {
    public static void main(String[] args) {

        AlphaLibManagement AlphaApp; // Declaring variable of type AlphaLibManagement
        AlphaApp = new AlphaLibManagement(); // create an object of type AlphaLibManagement and assign to app variable.
        AlphaApp.checkout();

        System.out.println("-----------------");

        IlibManagement appHandler; // Declaring variable of type IlibManagement
        Boolean isAlpha = true; // hardcoding the flag, but this could be read from config or run time

        // if we make above True; it shows Alpha output, if Flase; it shows Beta output
        // we can change anything without change of application code so that is how
        // powerful interfaces is, it is very much important concept for interview

        if (isAlpha == true) {
            appHandler = new AlphaLibManagement();// create object of type AlphaLibManagement & assign to app2 variable.
        } else {
            appHandler = new BetaLibManagement();
        }

        // Common code for the application
        appHandler.init();
        appHandler.checkin();
        appHandler.checkout();

    }
}