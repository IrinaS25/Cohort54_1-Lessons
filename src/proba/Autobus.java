package proba;

public class Autobus {

    private static int counter;

    private final int id;

    private BusDriver driver;
    private Autopilot autopilot;

    private final int capacity;
    private int countPassengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.driver = busDriver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v001");
    }

    public void updateAutopilotVersion(String softwareVersion){
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion){
        this.autopilot = new Autopilot(softwareVersion);
    }

    @Override
    public String toString() {
        return "Autobus: {" +
                "id =" + id + " , capacity = " + capacity +
                ", driver =" + driver.toString() +
                ", autopilot =" + autopilot.toString() +
                '}';
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }



    }

