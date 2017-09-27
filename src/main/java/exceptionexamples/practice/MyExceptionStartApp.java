package exceptionexamples.practice;


public class MyExceptionStartApp {

    public static void main(String args[]) {

        System.out.println("-------MAIN started-----------");

        try{
            System.out.println("-------TRY started-------");

            // I'm throwing the custom exception using throw
            throw new MyException("This is My error Message");

            //System.out.println("-------TRY finished-------");        //????????????????????
        }
        catch (MyException exp) {
            System.out.println("Catch Block");
            System.out.println(exp);
        }

        System.out.println("-------MAIN finished-----------");

    }

}