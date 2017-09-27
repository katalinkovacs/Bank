package exceptionexamples.sebiclassreference;


public class StartApp {

    public static void main(String args[]){

        System.out.println("-------MAIN started-----------");

        System.out.println("--------------CHANGING NAPPY EXAMPLE STARTS------------------");

        Sebi sebi = new Sebi();
        Zoli zoli = new Zoli(sebi);
        Andi andi = new Andi(sebi,zoli);

        Kati kati = new Kati(sebi, andi);
        kati.changeNappyByKati();


        if(sebi.isSebiAssClean){
            System.out.println("Sebi's ass is clean");
        }

        System.out.println("--------------CHANGING NAPPY EXAMPLE FINISH------------------");


        System.out.println("--------------FEEDING EXAMPLE STARTS------------------");

        Kati kati2 = new Kati(sebi);
        Andi andi2 = new Andi(sebi, kati2);
        Zoli zoli2 = new Zoli(sebi,andi2);

        zoli2.feedingSebi();

        if(sebi.isSebiTummyFull){
            System.out.println("Sebi is full, ready for some ice-cream :)");
        }


        System.out.println("--------------FEEDING EXAMPLE FINISHING------------------");

        System.out.println("--------------PLAYING EXAMPLE START------------------");

        Andi andi3 = new Andi(sebi);
        //kati --> can be used!!!
        Zoli zoli3 = new Zoli(sebi, kati);

        zoli3.entertainSebi();

        // zoli.entertainSebi();  --> java.lang.NullPointerException


        if(sebi.isSebiHappy){
            System.out.println("Sebi is very happy now:)");
        }

        System.out.println("--------------PLAYING EXAMPLE FINISHING------------------");



        System.out.println("-------MAIN finished-----------");

    }



}
