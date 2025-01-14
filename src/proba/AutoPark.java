package proba;

public class AutoPark {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("John", "LN-98784787");

        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus.toString());

        BusDriver peter = new BusDriver("Peter", "LN-8897987988");
        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("\n===================\n");

        BusDriver margo = new BusDriver("Margo", "LN=2376273782376");
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

        System.out.println("\n==========================\n");



    }


}
