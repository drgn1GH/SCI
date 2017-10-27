package ro.sci.carrental.model.car;

/**
 * Create a car object blueprint
 * ignore iml
 * Created by tudor on 24.05.2017
 */
public class Car {
    private int id;
    private FuelType fuelType;
    private VehicleCategory vehicleCategory;
    private Gearbox gearbox;
    private String make;
    private String model;
    private String color;
    private float size;
    private int numberOfSeats;

    public void setId(int id) {
        this.id = id;
    }

    private int numberOfDoors;

    private boolean gearboxType;
    private boolean AC;
    private boolean gps;
    private Price price;
    private boolean reserved;
    public Car(int id, String make, String model, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(){};

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getId() {
        return id;
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

    public boolean isGps() {
        return gps;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return id == car.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", fuelType=" + fuelType +
                ", vehicleCategory=" + vehicleCategory +
                ", gearbox=" + gearbox +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", numberOfSeats=" + numberOfSeats +
                ", numberOfDoors=" + numberOfDoors +
                ", gearboxType=" + gearboxType +
                ", AC=" + AC +
                ", gps=" + gps +
                ", price=" + price +
                ", reserved=" + reserved +
                '}';
    }
}