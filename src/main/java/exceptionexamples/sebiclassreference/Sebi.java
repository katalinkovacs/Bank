package exceptionexamples.sebiclassreference;


public class Sebi {

    boolean isSebiAssClean;

    boolean isSebiTummyFull;

    boolean isSebiHungry;

    boolean isSebiHappy;


    //CONSTRUCTOR
    public Sebi() {

    }


    public boolean isSebiAssClean() {

        return isSebiAssClean;
    }

    public boolean isSebiHungry(){

        return isSebiHungry;
    }



    //SETTERS
    public void setSebiAssClean(boolean sebiAssClean) {

        isSebiAssClean = sebiAssClean;

    }

    public void setSebiTummyFull(boolean sebiTummyFull) {

        isSebiTummyFull = sebiTummyFull;

    }

    public void setSebiHungry(boolean sebiHungry) {

        System.out.println("SEBI SAYS: I AM HUNGRY!!! I WANT BUNDIKENYER!!");
        isSebiHungry = sebiHungry;

    }

    public void setSebiHappy(boolean sebiHappy) {

        isSebiHappy = sebiHappy;
    }


    public void feedMe(Food food) throws SebiGrumpyException{

        if (food instanceof Sausage){
            System.out.println("Sebi SAYS: I am very happy with the " + food.getType() +" Thanks mother! I love you :)");
        }else{
            throw new SebiGrumpyException("Mother! Bring me sausage, please!");
        }

    }



}
