package vehicles;

public class Ship extends WaterVehicle implements Motorized, CargoCapable {
    private double cargoCapacity;

    public Ship(String color, String manufacturer, int yearMade, double hullLength, double cargoCapacity) {
        super(color, manufacturer, yearMade, hullLength);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Ship engine started");   
    }

    @Override
    public void stopEngine() {
        System.out.println("Ship engine stopped");   
    }

    @Override
    public void accelerate() {
        System.out.println("Ship is accelerating");  
    }

    @Override
    public void dumpCargo() {
        System.out.println("Ship is dumping all the cargo");
    }
}
