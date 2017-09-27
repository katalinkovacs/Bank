package exceptionexamples.practice;


public class Exception06 {

    public static void main(String args[]){

        System.out.println("-------MAIN started-----------");

        try{
            System.out.println("-------TRY started-----------");

            int a[] = new int[7];
            System.out.println("-------Array created-----------");

            System.out.println("-------a[4] = 30 / 0-----------");
            a[4] = 30 / 0;

            a[0] = 3;

            a[7] = 8;
            //a[4] = 30/0;


            System.out.println("-------TRY finished-----------");
        }
        //catch(Exception e){
        //    System.out.println("Warning: Some Other exception");
        //}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("-------CATCH started-----------");
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
            System.out.println("-------CATCH finished-----------");
        }
        catch(ArithmeticException e){
            System.out.println("-------CATCH started-----------");
            System.out.println("Warning: ArithmeticException");
            System.out.println("-------CATCH finished-----------");
        }
        catch(Exception e){                                         // THIS IS THE LAST ONE !!!!!!!!!!!!!!!!
            System.out.println("Warning: Some Other exception");
        }
        finally {
            System.out.println("finally----------");
        }

        System.out.println("-------MAIN finished-----------");


    }


}
