package lesson_15;

public class CatsMain {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.sayMeow();
        cat.run();
        cat.sleep();


        String catName = cat.name;
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println(catAge);


        Cat cat1 = new Cat("Max");
        cat1.sayMeow();
        System.out.println(cat1.name);
        System.out.println(cat1.age);

        Cat cat2 = new Cat ( "Diamond", "red");


        Cat cat3 = new Cat("Peter", "black", 8);


    }


    }

