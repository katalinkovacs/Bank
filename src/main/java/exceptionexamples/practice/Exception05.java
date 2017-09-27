package exceptionexamples.practice;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception05 {

    public static void main(String[] args) throws FileNotFoundException{

        try {
            FileReader in = new FileReader("file.txt");
        }
        catch (FileNotFoundException e) {

            System.out.println("MESSAGE: " + e.getMessage());
            System.out.println("STACK TRACE:");
            e.printStackTrace();
        }
    }

}
