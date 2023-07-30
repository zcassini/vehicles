package vehicles;

public abstract class LandVehicle extends Vehicle {
    protected int numOfWheels;

    public LandVehicle(String color, String manufacturer, int yearMade, int numOfWheels) {
        // call my parents constructor
        super(color, manufacturer, yearMade);
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }
}
