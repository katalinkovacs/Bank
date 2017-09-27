package exceptionexamples.sebiexception;

import java.util.ArrayList;
import java.util.Random;


public class Fridge {

    private Random randomGenerator;
    private ArrayList<Food> fridge;



    public Fridge ()
    {
        randomGenerator = new Random();
        fridge = new ArrayList<Food>();
        Sausage sausage = new Sausage();
        HerbalStuff herbal = new HerbalStuff();
        BreadButter breadButter = new BreadButter();
        fridge.add(sausage);
        fridge.add(breadButter);
        fridge.add(herbal);
    }

    public void availableFood()
    {
        Sebi sebi = new Sebi();
        int index = randomGenerator.nextInt(fridge.size());
        Food food = fridge.get(index);
        try{
            sebi.feedMe(food);
        }catch (SebiGrumpyException e){
            System.out.println("Sebi says: e.getmessage: " + e.getMessage());
            System.out.println("KATI SAYS: You need to eat this too my dear son.");
        }
        System.out.println("FYI: The available food was: " + food.getType());

    }

    /*    public Food anyFood()
    {
        int index = randomGenerator.nextInt(fridge.size());
        Food food = fridge.get(index);
        System.out.println("The available food was: " + food.getType());
        return food;
    }
*/


}
