package exceptionexamples.practice;

import java.util.Scanner;


public class ExceptionMethodsStartApp {

    // Creates a Scanner object that monitors keyboard input
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        ExceptionMethods.divideByZero(2);
        ExceptionMethods.divideByZero(4);


    }


}
