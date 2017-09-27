package exceptionexamples.practice;


public class Exception01 {

    public static void main(String[] args) {

        int mainNumber = 17;
        int divideBy = 0;
        int answer;
        //answer = mainNumber / divideBy;

        try {
            System.out.println("TRY starts------------------");
            answer = mainNumber / divideBy;
            System.out.println("Result: " + answer);
        }catch(ArithmeticException e) {
            // Print error msg and continue
            System.out.println("ArithmeticException-CATCH starts------------------");
            System.out.println("Input cannot be zero");
        }catch(Exception e) {
            System.out.println("Exception-CATCH starts------------------");
            System.out.println("Input cannot be zero");
        }
        finally {
            System.out.println("Inside Finally - Some message..");
        }
        System.out.println("End of application");
    }


}
