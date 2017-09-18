package childcare;


public class Child {

    private String name;
    private int age;
    private int id;



    public Child() {

        System.out.println("------------------Empty CONSTRUCTOR-----------------");
    }

    public Child(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

        System.out.println("------------------3 argument CONSTRUCTOR-----------------");
    }

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("------------------CHILD 2 ARGS CONSTRUCTOR-----------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
