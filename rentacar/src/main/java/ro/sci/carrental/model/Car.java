package ro.sci.carrental.model;

/**
 * Created by tudor on 24.05.2017.
 */
public class Car {
    private String make;
    private String model;
    private String fuelType;
    private String color;
    private String category;
    private int numberOfSeats;
    private int numberOfDoors;
    private String gearboxType;
    private boolean AC;
    private boolean gps;

    public Car() {
    }

    public Car(String make, String model, String fuelType, String color, String category, int numberOfSeats, int numberOfDoors, String gearboxType, boolean AC, boolean gps) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.category = category;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.gearboxType = gearboxType;
        this.AC = AC;
        this.gps = gps;
    }

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }


    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public boolean isAC() {
        return AC;
    }

    public boolean isGps() {

        return gps;
    }
}
