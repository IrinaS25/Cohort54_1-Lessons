package homework_25.Tas3.Task2;

/*
Task2: Мастерская ремонта гаджетов
Опционально
Реализуйте метод estimateRepairTime(), который возвращает время ремонта в зависимости от сложности устройства.
Добавьте класс Tablet как еще один подкласс Gadget, чтобы показать расширяемость системы.

 */

public class WorkshopGadget {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Alex", "iPhone13", 230);
        Laptop laptop = new Laptop("Kristen", "Mac Book Pro", 580);

        System.out.println("Ремонт смартфона: ");

        Workshop workshop = new Workshop();

        workshop.processRepair(smartphone);

        System.out.println("\n=================\n");

        System.out.println("Ремонт ноутбук");

        workshop.processRepair(laptop);

    System.out.println("\n=================\n");

        System.out.println("Ремонт таблета");
        Tablet tablet = new Tablet("Peter", "Samsung", 145);
        workshop.processRepair(tablet);


    }
}
