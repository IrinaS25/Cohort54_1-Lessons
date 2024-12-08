package homework_25.Tas3.Task2;


public class Workshop {

    void processRepair(Gadget gadget) {
        System.out.println("Диагностика устройства: " + gadget.model + " (владелец: " + gadget.ownerName + ")");
        gadget.diagnose();
        gadget.repair();
        gadget.getRepairCost();
        gadget.estimateRepairTime();


    }
}