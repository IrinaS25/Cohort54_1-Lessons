package lesson_21;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-45844564");

        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus.toString());

        BusDriver peter = new BusDriver("Peter", "LN-12348789");

        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("\n====================\n");

        BusDriver margo = new BusDriver("Margo", "AE-433453534");
        Autobus bus1 = new Autobus(margo, 24);

        System.out.println(bus1.toString());

        bus1.installNewAutopilot("AP-gpt6");
        System.out.println(bus1.toString());
        margo.setName("Margo-Susana");
        System.out.println(bus1.toString());

        bus1 = null;
        System.out.println(margo.toString());

        System.out.println(bus.toString());
        bus.setDriver(margo);
        System.out.println(bus.toString());

        System.out.println("\n=======================\n");

        Passenger passenger = new Passenger("Alex");
        Passenger passenger1 = new Passenger("Max");
        System.out.println(passenger.toString());
        System.out.println(passenger1.toString());

        bus.takePassenger(passenger);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(passenger1);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(passenger);
        System.out.println("count pass: " + bus.getCountPassengers());

        Autobus bus2 = new Autobus(new BusDriver("Max", "LN-000001"), 5);

        Passenger passenger0 = new Passenger("Tim");
        Passenger passenger7 = new Passenger("Hanna");
        Passenger passenger2 = new Passenger("Peter");
        Passenger passenger3 = new Passenger("John");
        Passenger passenger4 = new Passenger("Tom");
        Passenger passenger5 = new Passenger("Sebastian");
        Passenger passenger6 = new Passenger("Bob");

        String emptyPassengers = bus.getPassengersList();
        System.out.println("Empty passengers list: " + emptyPassengers);

        bus.takePassenger(passenger);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger(passenger5);
        bus.takePassenger(passenger6);

        System.out.println("\n==================\n");

        String passengersList = bus.getPassengersList();
        System.out.println(passengersList);

        System.out.println("dropPassenger(passenger): " + bus.dropPassenger(passenger));
        System.out.println("passenger List: " + bus.getPassengersList());
        System.out.println(bus.getCountPassengers());

        System.out.println("Еще раз высаживаем: " + bus.dropPassenger(passenger));
        System.out.println(bus.getCountPassengers());


    }
}

