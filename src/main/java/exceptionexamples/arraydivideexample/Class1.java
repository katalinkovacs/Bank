package exceptionexamples.arraydivideexample;


public class Class1 {

    int num1;
    int num2;
    static int result;

    public Class1() {
    }

    public Class1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int divideNumber(int num1, int num2) {//throws NullPointerException, ArrayIndexOutOfBoundsException{

        System.out.println("Number1 is: " +num1);
        System.out.println("Number2 is: " +num2);

        result = num1 / num2;
        System.out.println("Result in METHOD is: " +result);

        return result;

    }

    public String sayHelloFromClass1() {

        String message = "Szevasz From Class1 WITH MESSAGE.";
        System.out.println(message);
        //System.out.println("Szevasz From Class1 WITH SYSOUT.");
        //return "Szevasz From Class2.";
        return message;
    }

}
