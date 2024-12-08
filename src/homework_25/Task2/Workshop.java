package homework_25.Task2;
import homework_25.Task2.Gadget;
import homework_25.Task2.Repairable;


public class Workshop {

    void processRepair(Gadget gadget) {
        System.out.println("Диагностика устройства: " + gadget.model + " (владелец: " + gadget.ownerName + ")");
        gadget.diagnose();
        gadget.repair();
        gadget.getRepairCost();

    }
}