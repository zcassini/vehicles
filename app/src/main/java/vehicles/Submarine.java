package vehicles;

public class Submarine extends WaterVehicle implements Motorized {
    private double maxDepth;

    public Submarine(String color, String manufacturer, int yearMade, double hullLength, double maxDepth) {
        super(color, manufacturer, yearMade, hullLength);
        this.maxDepth = maxDepth;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    @Override
    public void startEngine() {
        System.out.println("Submarine engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Submarine engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Submarine is accelerating");
    }
    
    @Override
    public void reportCrash() {
        System.out.println("Reporting crash to the Admiral");
    }
}
