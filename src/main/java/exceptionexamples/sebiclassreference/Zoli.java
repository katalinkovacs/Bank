package exceptionexamples.sebiclassreference;


public class Zoli {

    Sebi sebi;
    Andi andi;
    Kati kati;

    // CONSTRUCTOR FOR CHANGENAPPY EXAMPLE
    public Zoli(Sebi sebi) {

        this.sebi = sebi;
    }

    // CONSTRUCTOR FOR FEEDSEBI EXAMPLE
    public Zoli(Sebi sebi, Andi andi) {

        this.sebi = sebi;
        this.andi = andi;
    }

    // CONSTRUCTOR FOR PLAYING EXAMPLE
    public Zoli(Sebi sebi, Kati kati) {

        this.sebi = sebi;
        this.kati = kati;
    }

    // METHODS
    public void changeNappyByZoli(){
        System.out.println("ZOLI SAYS: I am fucked, everyone is busy!");
        System.out.println("Zoli is changing Sebi's nappy.");
        sebi.setSebiAssClean(true);
    }

    public void feedingSebi(){

        sebi.setSebiHungry(true);
        boolean zoliBusy = true;

        if(zoliBusy) {
            System.out.println("ZOLI SAYS: I cant feed Sebi, I am working. Help me Andi, please?");
            andi.feedingSebi();
        }else{
            System.out.println("ZOLI SAYS: I am feeding Sebi, making bundikenyer.");
            sebi.setSebiTummyFull(true);

        }

    }

    public void entertainSebi(){

        boolean working = true;

        if(working) {
            System.out.println("ZOLI SAYS: I am working, cant play with Sebi. Help me Kati, please?");
            kati.entertainSebi();
        }else{
            System.out.println("ZOLI SAYS: I am playing with Sebi.");
            sebi.setSebiHappy(true);

        }

    }



}
