package homework_22.Task2;

public class Car extends Vehicle{
    private String engine;

    public Car(String engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println("Тип двигателя: " + engine + "машины запускается");
    }
}
