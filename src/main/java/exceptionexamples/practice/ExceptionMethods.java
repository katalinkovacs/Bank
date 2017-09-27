package exceptionexamples.practice;


public class ExceptionMethods {

    public static void divideByZero(int a) {

        System.out.println("METHOD START--------------------");

        try
        {
            System.out.println( a / 0 );
        }
        // If the exception ArithmeticException is thrown the following execute
        catch (ArithmeticException e)
        {
            // Your custom error message
            System.out.println("You can't divide by zero");
            // Java's error message for this exception
            System.out.println("Message is: " +e.getMessage());
            // Prints the exception name and error message
            System.out.println("To String message is: " +e.toString());
            // Prints the standard error stack trace
            e.printStackTrace();
        }
        finally {
            System.out.println("FINALLY");
        }
        System.out.println("METHOD END--------------------");

    }

}
