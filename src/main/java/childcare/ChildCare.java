package childcare;

import java.util.ArrayList;


public class ChildCare {

    private String name;
    private String suburb;
    private ArrayList<Child> kids;
    private ArrayList<Child> babyRoom;
    private ArrayList<Child> toddlerRoom;
    private ArrayList<Child> kinderRoom;



    public ChildCare() {
    }

    public ChildCare(String name, String suburb) {
        this.name = name;
        this.suburb = suburb;
        kids = new ArrayList<Child>();
        babyRoom = new ArrayList<Child>();
        toddlerRoom = new ArrayList<Child>();
        kinderRoom = new ArrayList<Child>();
/*
        Child kid1 = new Child("Jancsika", 38);
        Child kid2 = new Child("Lajcsika", 8);
        Child kid3 = new Child("Fancsika", 18);

        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
*/
        System.out.println("----------------Childcare CONSTRUCTOR WITH ARGS---------------");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public ArrayList<Child> getKids() {
        System.out.println("----------------GET KIDS---------------");

        return kids;
    }

    public void setKids(ArrayList<Child> kids) {
        System.out.println("----------------What is happening?---------------");
        this.kids = kids;
    }

    public ArrayList<Child> getBabyRoom() {
        return babyRoom;
    }

    public void setBabyRoom(ArrayList<Child> babyRoom) {
        this.babyRoom = babyRoom;
    }

    public ArrayList<Child> getToddlerRoom() {
        return toddlerRoom;
    }

    public void setToddlerRoom(ArrayList<Child> toddlerRoom) {
        this.toddlerRoom = toddlerRoom;
    }

    public ArrayList<Child> getKinderRoom() {
        return kinderRoom;
    }

    public void setKinderRoom(ArrayList<Child> kinderRoom) {
        this.kinderRoom = kinderRoom;
    }
}
