package lesson_15;

public class Cat {

    String name;
    String color;
    int age;

    public Cat (String catName) {
        name = catName;

    }
    public Cat () {

    }
    public Cat(String catName, String color){
        name = catName;
        this.color =color;
    }
    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void sleep(){
        System.out.println("Ich schlafe!");
    }

    public void run() {
        System.out.println("Ich renne");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

}


