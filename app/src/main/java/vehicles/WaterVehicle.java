package vehicles;

public abstract class WaterVehicle extends Vehicle {
    protected double hullLength;

    protected WaterVehicle(String color, String manufacturer, int yearMade, double hullLength) {
        super(color, manufacturer, yearMade);
        this.hullLength = hullLength;
    }

    public double getHullLength() {
        return hullLength;
    }

    public void reportCrash() {
        System.out.println("Reporting crash to coast guard");
    }

}
