package homework_25.Task2;

public class Smartphone extends Gadget{

    public Smartphone(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Проверка экрана и батареи");

    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат");
        System.out.println("Замена экрана завершина");


    }

}
