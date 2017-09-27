package exceptionexamples.sebiexception;


public class Andi {

    Sebi sebi;
    Kati kati;


    public Andi(Sebi s, Kati k) {
        sebi = s;
        kati = k;
    }


    public void feedingSebi(){

        boolean andiBusy = true;

        if(andiBusy) {
            System.out.println("ANDI SAYS: I cant feed Sebi, I am painting. Help me Kati, please?");
            kati.feedingSebi();
        }else{
            System.out.println("ANDI SAYS: I am feeding Sebi, making bundikenyer.");
            sebi.setSebiTummyFull(true);
        }
    }


}
