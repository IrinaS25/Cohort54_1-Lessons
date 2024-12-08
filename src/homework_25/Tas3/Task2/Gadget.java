package homework_25.Tas3.Task2;

public abstract class Gadget implements Repairable {

    protected String ownerName;
    protected String model;
    protected double repairCost;
    protected int repairTime;

    public Gadget(String ownerName, String model, double repairCost) {
        this.ownerName = ownerName;
        this.model = model;
        this.repairCost = repairCost;
    }

    @Override
    public void estimateRepairTime() {

        System.out.println("Время ремонты: " + repairTime + " минут");

    }

    @Override
    public void repair() {

    }

    @Override
        public void getRepairCost () {
            System.out.println("Стоимость ремонта: " + repairCost + " €");

        }

    }
