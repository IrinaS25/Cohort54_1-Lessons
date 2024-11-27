package homework_22.Task2;

public class VehicleApp {
    public static void main(String[] args) {

        Motorcycle kawasaki = new Motorcycle("Single Cylinder");
        Motorcycle suzuki = new Motorcycle("Twin");
        Motorcycle bmw = new Motorcycle("Inline-Four");

        Car audi = new Car("TDI 1.6");
        Car volkswagen = new Car("LPG");
        Car ford = new Car("Electric");

        Bicycle trekFX = new Bicycle();
        Bicycle giantRoam = new Bicycle();

        Vehicle[] vehicles = new Vehicle[8];
        vehicles[0] = kawasaki;
        vehicles[1] = suzuki;
        vehicles[2] = bmw;
        vehicles[3] = audi;
        vehicles[4] = volkswagen;
        vehicles[5] = ford;
        vehicles[6] = trekFX;
        vehicles[7] = giantRoam;

        for (int i = 0; i < vehicles.length; i++){
            vehicles[i].startEngine();
        }

    }
}
