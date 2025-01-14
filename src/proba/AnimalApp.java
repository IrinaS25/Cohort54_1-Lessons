package proba;

public class AnimalApp {
    public static void main(String[] args) {

        Dog bobik = new Dog("Bobik", 1, "grey");
        bobik.makeSoung();
        System.out.println(bobik.age);
        System.out.println(bobik.name);

        Animal animal = new Animal("animal", 1);
        System.out.println(animal.name);
        animal.makeSoung();

    }
}
