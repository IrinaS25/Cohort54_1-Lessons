package homework_25.Task2;

public class Laptop extends Gadget{

    public Laptop(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Проверка состояния жесткого диска и системы охлождения");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат");
        System.out.println("Замена кулера завершена");
    }
}
