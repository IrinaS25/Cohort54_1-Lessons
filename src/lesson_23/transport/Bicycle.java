package lesson_23.transport;

public class Bicycle extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("У велосипеда нет двигателя");
    }
}

