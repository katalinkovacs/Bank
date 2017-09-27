package exceptionexamples.sebiclassreference;


public class Andi {

    Zoli zoli;
    Sebi sebi;
    Kati kati;


    // CONSTRUCTOR FOR CHANGENAPPY EXAMPLE
    public Andi(Sebi s, Zoli z) {
        sebi = s;
        zoli = z;
    }

    // CONSTRUCTOR FOR FEEDSEBI EXAMPLE
    public Andi(Sebi s, Kati k) {
        sebi = s;
        kati = k;
    }

    // CONSTRUCTOR FOR PLAYING EXAMPLE
    public Andi(Sebi s) {
        sebi = s;
    }

    // METHODS
    public void changeNappyByAndi(){

        // SET ANDI BUSY
        boolean andiBusy = true;

        if(andiBusy){
            System.out.println("ANDI SAYS: I am busy, Zoli help me!");
            zoli.changeNappyByZoli();
        }else{
            System.out.println("Andi is changing Sebi's nappyy");
            sebi.setSebiAssClean(true);
        }

    }


    public void feedingSebi(){

        //sebi.setSebiHungry(true);
        boolean andiBusy = true;

        if(andiBusy) {
            System.out.println("ANDI SAYS: I cant feed Sebi, I am painting. Help me Kati, please?");
            kati.feedingSebi();
        }else{
            System.out.println("ANDI SAYS: I am feeding Sebi, making bundikenyer.");
            sebi.setSebiTummyFull(true);
        }
    }

    public void entertainSebi(){

        System.out.println("ANDI SAYS: OOOOOhhhh shit, I have to play with Sebi AGAIN!!!!!.");
        sebi.setSebiHappy(true);

        }


}
