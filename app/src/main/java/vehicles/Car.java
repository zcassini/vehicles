package vehicles;

public class Car extends LandVehicle implements Motorized {
    private String fuelType;

    public Car(String color, String manufacturer, int yearMade, int numOfWheels, String fuelType) {
        super(color, manufacturer, yearMade, numOfWheels);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void reportCrash() {
        System.out.println("Reporting crash to police");
    }
}
