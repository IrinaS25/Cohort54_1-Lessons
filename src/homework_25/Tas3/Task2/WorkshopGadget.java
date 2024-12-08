package homework_25.Tas3.Task2;

/*
Task2: Мастерская ремонта гаджетов
Опционально
Создать систему для моделирования работы мастерской по ремонту различных гаджетов, таких как смартфоны и ноутбуки.

Условия задачи:
Создайте интерфейс Repairable, который содержит методы:

diagnose() — провести диагностику устройства.
repair() — выполнить ремонт устройства.
getRepairCost() — получить стоимость ремонта.
У всех гаджетов должны быть:

Поля:
ownerName — имя владельца гаджета.
model — модель устройства.
repairCost — стоимость ремонта.
Конструктор для инициализации этих полей.
Реализацию метода getRepairCost(), который возвращает значение поля repairCost.
Реализуйте два класса:

Smartphone (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка экрана и батареи).
метод repair() с учетом особенностей ремонта смартфона (например, "Замена экрана завершена").
Laptop (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка состояния жесткого диска и системы охлаждения).
Дополните метод repair() с учетом ремонта ноутбука (например, "Замена кулера завершена").
Создайте класс Workshop, который выполняет:

Метод processRepair(Gadget gadget), который:
Проводит диагностику устройства.
Ремонтирует устройство.
Выводит информацию о завершении ремонта и его стоимости.
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
