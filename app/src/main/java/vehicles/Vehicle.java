package vehicles;

public abstract class Vehicle {
    protected String color;
    protected String manufacturer;
    protected int yearMade;
    
    protected Vehicle(String color, String manufacturer, int yearMade) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.yearMade = yearMade;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearMade() {
        return yearMade;
    }

    public abstract void reportCrash();

    
}
