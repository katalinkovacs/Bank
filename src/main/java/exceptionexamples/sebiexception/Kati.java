package exceptionexamples.sebiexception;


public class Kati {

    Andi andrea;
    Sebi sebi;

    // CONSTRUCTORS
    public Kati(Sebi s, Andi a) {

        sebi = s;
        andrea = a;
    }

    public Kati(Sebi sebi) {

        this.sebi = sebi;
    }

    // FEEDING METHOD WITH
    public void feedingSebi(){

            System.out.println("KATI SAYS: Bugger, I will have to make something to eat for Sebi.");

            Food f = new BreadButter();
            //food = new BreadButter();
            System.out.println("KATI SAYS: I am about to feed Sebi with " + f.getType());
            try{
                sebi.feedMe(f);
            }catch (SebiGrumpyException e){
                System.out.println("Sebi says : " + e.getMessage());
                System.out.println("KATI SAYS: OMG what food should i give Sebi, I dont know ...");
            }

            System.out.println("KATI SAYS: lets try feeding Sebi with Sausage");
            Food f2 = new Sausage();
            System.out.println("KATI SAYS: I am about to feed Sebi with " + f2.getType());
            try{
                sebi.feedMe(f2);
            }catch (SebiGrumpyException e){
                System.out.println("Sebi says : " + e.getMessage());
                System.out.println("KATI SAYS: OMG what food should i give Sebi, I dont know ...");
            }

        System.out.println("KATI SAYS: lets try feeding Sebi with some herbal thingy.");
        Food f3 = new HerbalStuff();
        System.out.println("KATI SAYS: I am about to feed Sebi with " + f3.getType());
        try{
            sebi.feedMe(f3);
        }catch (SebiGrumpyException e){
            System.out.println("Sebi says: e.getmessage: " + e.getMessage());
            System.out.println("KATI SAYS: You need to eat this too my dear son.");
        }

        sebi.setSebiTummyFull(true);



        }



    }



