package homework_25.Task2;

public abstract class Gadget implements Repairable {

    protected String ownerName;
    protected String model;
    protected double repairCost;

    public Gadget(String ownerName, String model, double repairCost) {
        this.ownerName = ownerName;
        this.model = model;
        this.repairCost = repairCost;
    }

    @Override
    public void getRepairCost() {
        System.out.println("Стоимость ремонта: " + repairCost + " €");

    }

}