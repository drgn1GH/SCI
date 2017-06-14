package ro.sci.carrental.model.car;

/**
 * Create a car object blueprint
 * Created by tudor on 24.05.2017
 */
public class Car {
    private FuelType fuelType;
    private VehicleCategory vehicleCategory;
    private String make;
    private String model;
    private String color;
    private float size;
    private int numberOfSeats;
    private int numberOfDoors;
    private boolean gearboxType;
    private boolean AC;
    private boolean gps;

    /**
     * default constructor
     */
    public Car() {

    }

    /**
     * constructor with the most important fields
     *
     * @param make
     * @param model
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /* getters */

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(boolean gearboxType) {
        this.gearboxType = gearboxType;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public boolean hasGps() {
        return gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType=" + fuelType +
                ", vehicleCategory=" + vehicleCategory +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", numberOfSeats=" + numberOfSeats +
                ", numberOfDoors=" + numberOfDoors +
                ", gearboxType=" + gearboxType +
                ", AC=" + AC +
                ", gps=" + gps +
                '}';
    }
}