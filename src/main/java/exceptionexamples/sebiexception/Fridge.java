package exceptionexamples.sebiexception;

import java.util.ArrayList;
import java.util.Random;


public class Fridge {

    private Random randomGenerator;
    private ArrayList<Food> foodList;

    public Fridge ()
    {
        randomGenerator = new Random();
        foodList = new ArrayList<Food>();
        Sausage sausage = new Sausage();
        HerbalStuff herbal = new HerbalStuff();
        BreadButter breadButter = new BreadButter();
        foodList.add(sausage);
        foodList.add(breadButter);
        foodList.add(herbal);
    }

    public void availableFood()
    {
        Sebi sebi = new Sebi();
        int index = randomGenerator.nextInt(foodList.size());
        Food food = foodList.get(index);
        try{
            sebi.feedMe(food);
        }catch (SebiGrumpyException e){
            System.out.println("Sebi says: e.getmessage: " + e.getMessage());
            System.out.println("KATI SAYS: You need to eat this too my dear son.");
        }
        System.out.println("FYI: The available food was: " + food.getType());

    }


}
