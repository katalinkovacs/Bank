package exceptionexamples.practice;


public class Exception02 {

    public static void main(String[] args) {

        int[] ourArray = new int[5];

        try {
            System.out.println("first");
            ourArray[0] = 1;
            System.out.println("second");
            ourArray[1] = 2;
            System.out.println("third");
            ourArray[2] = 3;
            System.out.println("fourth");
            ourArray[3] = 4;
            System.out.println("fifth");
            ourArray[4] = 5;
            System.out.println("sixth");
            ourArray[5] = 6;
            System.out.println("seventh");
            ourArray[6] = 7;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException.");
        }
        catch(Exception e){
            System.out.println("Exception.");

        }
        finally {
            System.out.println("FINISH");
        }

        System.out.println("MAIN END");



/*
        try{
            // cause an exception
            ourArray[20] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Bad Calculations.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        }
        finally {
            System.out.println("Inside Finally.");
        }
        System.out.println("End of application");
    }

    */
    }
}