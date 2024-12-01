package lesson_23.transport;


public class Car extends Vehicle{

    public Car(Engine engine) {
        super();
        setEngine(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("Car starting engine");
        this.getEngine().start();
    }

}

