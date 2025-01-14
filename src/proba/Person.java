package proba;

public class Person {

    public static int count = 0;
    private String name;

    public Person(String name) {
        this.name = name;
        count++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printName(){
        System.out.println("Name: " + name);

    }


}
