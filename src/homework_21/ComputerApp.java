package homework_21;

public class ComputerApp {
    public static void main(String[] args) {

        Computer computer = new Computer(new Storage("Seagate", "Seagate BarraCuda 2TB"));

        System.out.println(computer.toString());

        Storage storage1 = new Storage("Samsung", "Crucial MX500 1 TB");
        computer.setStorage(storage1);
        System.out.println(computer.toString());

        System.out.println(computer.getMemory());
        System.out.println(storage1.getBrand());


    }
}
