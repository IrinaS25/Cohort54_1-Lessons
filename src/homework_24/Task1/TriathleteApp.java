package homework_24.Task1;
/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class TriathleteApp {
    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete("Peter", 5);
        triathlete.swim();
        triathlete.run();
        System.out.println(triathlete.toString());
        System.out.println(triathlete.getId());
    }
}
