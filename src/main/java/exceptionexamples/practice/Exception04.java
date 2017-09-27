package exceptionexamples.practice;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("--------------MAIN START---------------");

        try {
            FileReader in = new FileReader("file.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            //throw e;                                        //?????????????????????????????????????????
        }
        finally {
            System.out.println("finally.............");
        }

        System.out.println("--------------MAIN END-----------------");

    }


}
