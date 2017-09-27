package exceptionexamples.practice;

// https://beginnersbook.com/2013/04/user-defined-exception-in-java/      ???????????????????????????

public class InvalidProductException extends Exception{

    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }




}
