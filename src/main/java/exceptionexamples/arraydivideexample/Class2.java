package exceptionexamples.arraydivideexample;


public class Class2 {

    int[] class2Array;

    Class1 c1;


    public Class2() {

        class2Array = new int[ 5 ];
        c1 = new Class1();

    }


    public void putNumberIntoArray(int a, int b) throws NullPointerException, ArrayIndexOutOfBoundsException{


        int  dividedNumber = c1.divideNumber(a, b);


        class2Array[0] = dividedNumber;


        //System.out.println("Result is: " +Class1.result);

         //i = 0;

        //class2Array[i] = Class1.result;

        System.out.println("class2Array first number is: " +class2Array[0]);

    }


    public void putNumberIntoArray2(int intArray[], int index){ //throws NullPointerException, ArrayIndexOutOfBoundsException{

        //System.out.println("Result is: " +Class1.result);

        //i = 0;

        // intArray[index] = Class1.result;


        System.out.println("intArray first number is: " +class2Array[index]);

    }

    public void sayHelloFromClass2(String msg){

        System.out.println(msg);
        //return;
    }
}
