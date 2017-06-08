package ro.sci.carrental.model;

import ro.sci.carrental.util.FuelType;
import ro.sci.carrental.util.VehicleCategory;

/**
 * Create a car object blueprint
 * Created by tudor on 24.05.2017.
 * @version 1.1
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
    public Car(){

    }

    /**
     * constructor with most important fields
     * @param make
     * @param model
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * contructor with all fields
     * @param fuelType
     * @param vehicleCategory
     * @param make
     * @param model
     * @param color
     * @param size
     * @param numberOfSeats
     * @param numberOfDoors
     * @param gearboxType
     * @param AC
     * @param gps
     */
    public Car(FuelType fuelType, VehicleCategory vehicleCategory, String make, String model, String color, float size, int numberOfSeats, int numberOfDoors, boolean gearboxType, boolean AC, boolean gps) {
        this.fuelType = fuelType;
        this.vehicleCategory = vehicleCategory;
        this.make = make;
        this.model = model;
        this.color = color;
        this.size = size;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.gearboxType = gearboxType;
        this.AC = AC;
        this.gps = gps;
    }

    /* setters */

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setGearboxType(boolean gearboxType) {
        this.gearboxType = gearboxType;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    /* getters */

    public FuelType getFuelType() {
        return fuelType;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public float getSize() {
        return size;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isGearboxType() {
        return gearboxType;
    }

    public boolean isAC() {
        return AC;
    }

    public boolean hasGps() {
        return gps;
    }
}