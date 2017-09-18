package childcare;


public class StartApp {

    public static void main(String[] args) {

        ChildCare childcare1 = new ChildCare("One Tree", "Altona Meadows");

        Child child1 = new Child("Katika", 24);
        Child child2 = new Child("Zolika", 14);
        Child child3 = new Child("Andika", 36);
        Child child4 = new Child("Reka", 6);
        Child child5 = new Child("Sebi", 12);
        Child child6 = new Child("Bulcsu", 38);
        Child child7 = new Child("Kornel", 7);
        Child child8 = new Child("Oliver", 30);
        Child child9 = new Child("Kahu", 9);
        Child child10 = new Child("Simon", 11);


        childcare1.getKids().add(child1);
        childcare1.getKids().add(child2);
        childcare1.getKids().add(child3);
        childcare1.getKids().add(child4);
        childcare1.getKids().add(child5);
        childcare1.getKids().add(child6);
        childcare1.getKids().add(child7);
        childcare1.getKids().add(child8);
        childcare1.getKids().add(child9);
        childcare1.getKids().add(child10);


        System.out.println("Looping through kids list");
        for (Child child : childcare1.getKids()) {
            //System.out.println("in for loop." + child.getName());
            System.out.println(child.getName());

            if (child.getAge() < 24) {
                childcare1.getBabyRoom().add(child);
                System.out.println("Baby room");
            } else if (child.getAge() >= 24 && child.getAge() <= 34) {
                childcare1.getToddlerRoom().add(child);
                System.out.println("Toddler room");
            } else if (child.getAge() > 35) {
                childcare1.getKinderRoom().add(child);
                System.out.println("Kinder room");
            } else {
                System.out.println("Wrong age or something..................");
            }

        }

        System.out.println("Looping through babies list---------------------------------");
        for (Child child : childcare1.getBabyRoom()) {

            System.out.println(child.getName());

        }

        System.out.println("Looping through toddler list---------------------------------");
        for (Child child : childcare1.getToddlerRoom()) {

            System.out.println(child.getName());

        }

        System.out.println("Looping through kinder list---------------------------------");
        for (Child child : childcare1.getKinderRoom()) {

            System.out.println(child.getName());

        }


    }
}