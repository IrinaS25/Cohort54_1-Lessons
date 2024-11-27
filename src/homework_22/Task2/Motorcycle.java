package homework_22.Task2;

public class Motorcycle extends Vehicle{
    private String engine;

    public Motorcycle(String engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println("Тип двигателя: " + engine + " мотоцыкла стартует");
    }
}
