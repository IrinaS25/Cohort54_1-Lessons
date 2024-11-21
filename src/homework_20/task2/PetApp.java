package homework_20.task2;

public class PetApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Dog", "Sharik", "black", 3, "Гав - Гав");

        System.out.println(dog.toString());

        dog.speak();
    }
}
