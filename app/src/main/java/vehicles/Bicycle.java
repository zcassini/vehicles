package vehicles;

public class Bicycle extends LandVehicle {
    private boolean isMountainBike;

    public Bicycle(String color, String manufacturer, int yearMade, int numOfWheels, boolean isMountainBike) {
        super(color, manufacturer, yearMade, numOfWheels);
        this.isMountainBike = isMountainBike;
    }

    public boolean isMountainBike() {
        return isMountainBike;
    }

    @Override
    public void reportCrash() {
        System.out.println("Reporting crash to your mom");
    }

}
