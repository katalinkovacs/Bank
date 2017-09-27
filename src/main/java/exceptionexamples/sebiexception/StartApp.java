package exceptionexamples.sebiexception;


import java.security.SecureRandom;
import java.util.Random;

public class StartApp {

    public static void main(String args[]){

        Sebi sebi = new Sebi();
        Kati kati = new Kati(sebi);
        Andi andi = new Andi(sebi, kati);
        Zoli zoli = new Zoli(sebi,andi);

        zoli.feedingSebi();

        System.out.println("-----------RANDOM EXAMPLE-------------");
        //Random random = new Random();
        //System.out.println(random.nextBoolean());


        Fridge fridgeFood = new Fridge();
        //System.out.println(fridgeFood.anyFood());
        fridgeFood.availableFood();


    }



}
