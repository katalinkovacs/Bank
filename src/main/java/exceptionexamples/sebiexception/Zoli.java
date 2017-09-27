package exceptionexamples.sebiexception;


public class Zoli {

    Sebi sebi;
    Andi andi;


    public Zoli(Sebi sebi, Andi andi) {

        this.sebi = sebi;
        this.andi = andi;
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

}
