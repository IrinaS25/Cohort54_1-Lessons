package homework_25.Tas3.Task2;

public class Tablet extends Gadget{

    public Tablet(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void estimateRepairTime() {
        repairTime = 30;
        super.estimateRepairTime();
    }

    @Override
    public void getRepairCost() {
        super.getRepairCost();
    }

    @Override
    public void diagnose() {
        System.out.println("Проверка процессора");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат");
        System.out.println("Ремонт процессора завершен");
    }
}
