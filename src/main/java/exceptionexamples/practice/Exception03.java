package exceptionexamples.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception03 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("--------------MAIN START---------------.");

        //FileReader in = new FileReader("file.txt");


        try {
            FileReader in = new FileReader("file.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException e");
        }
        finally {
            System.out.println("finally.............");
        }

        System.out.println("--------------MAIN END---------------.");

    }
}
