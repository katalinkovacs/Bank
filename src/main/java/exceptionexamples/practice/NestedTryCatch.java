package exceptionexamples.practice;


public class NestedTryCatch {

    public static void main(String args[]){
        //main try-block start
        try{
            //try-block2 start
            try{
                //try-block3
                try{
                    int array[]= {1,2,3,4};
            	/* I'm trying to display the value of
            	 * an element which doesn't exist. The
            	 * code should throw an exception
            	 */
                    System.out.println(array[10]);
                }
                catch(ArithmeticException e){
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
                catch(ArrayIndexOutOfBoundsException e6){
                    System.out.print("ArrayIndexOutOfBoundsException");
                    System.out.println(" handled in try-block3");
                }
            } //try-block2 finish
            catch(ArithmeticException e){
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        } //main try-block finish
        catch(ArithmeticException e3){
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        }
        catch(Exception e5){
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }


}
