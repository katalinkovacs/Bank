package exceptionexamples.arraydivideexample;


public class StartApp {

    public static void main(String args[]){ //throws NullPointerException, ArrayIndexOutOfBoundsException{

        System.out.println("-------MAIN started-----------");
/*
        int[] mainArray = new int[ 5 ];

        Class1 class1 = new Class1();
        class1.divideNumber(6, 2);
        class1.sayHelloFromClass1();

        System.out.println("Result in MAIN is: " +class1.result);

        //mainArray[0] = class1.result;*/

        Class2 class2 = new Class2();
        class2.putNumberIntoArray(6, 2);
        class2.sayHelloFromClass2("A ...... ki van ezzel a .........");


        //class2.putNumberIntoArray(0);

        //class2.putNumberIntoArray2(mainArray, 0);


        //System.out.println(mainArray[0]);
        //System.out.println(mainArray[1]);
        //System.out.println(mainArray[2]);





        System.out.println("-------MAIN finished-----------");

    }


}
