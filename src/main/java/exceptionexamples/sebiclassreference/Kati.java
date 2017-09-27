package exceptionexamples.sebiclassreference;


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


    // METHODS
    public void changeNappyByKati(){

        // SET KATI BUSY
        boolean katiBusy = true;

        if(katiBusy){
            System.out.println("KATI SAYS: I am busy, Andi help me!");
            andrea.changeNappyByAndi();
        }else{
            System.out.println("Kati is changing Sebi's nappy");
            sebi.setSebiAssClean(true);
        }

    }

    public void feedingSebi(){

        //sebi.setSebiHungry(true);
        boolean katiBusy = true;

        if(katiBusy) {
            System.out.println("KATI SAYS: Bugger, I will have to make bundikenyer for Sebi.");
            //sebi.setSebiTummyFull(true);

            Food f = new BreadButter();
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
        }

    }

    public void entertainSebi(){

        boolean working = true;

        if(working) {
            System.out.println("KATI SAYS: I am working, cant play with Sebi. Help me Andi, please?");
            andrea.entertainSebi();
        }else{
            System.out.println("KATI SAYS: I am playing with Sebi.");
            sebi.setSebiHappy(true);

        }

    }


}
