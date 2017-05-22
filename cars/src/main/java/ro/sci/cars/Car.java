package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Car implements Vehicle {

    private int fuelTankSize;
    private int gears;
    private double availableFuel;
    private FuelType fuelType;
    private double factoryAvgConsumptionPer100km;
    private double driveAvgConsumptionPer100km;
    private int currentGear;

    public Car(double fuel, FuelType fuelType, int fuelTankSize, int gears, double avgConsumption) {
        this.availableFuel = fuel;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.factoryAvgConsumptionPer100km = avgConsumption;
    }

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void drive(double km) {
        System.out.println("drive " + km);
        /**
         * calculeaza cat s-a consumat in functie de nr de km si treapta de viteza curenta
         *
         * case currentGear == 1
         *      calculateFuel(1, km);
         * case currentGear == 2
         *      calculateFuel(2, km);
         * case currentGear == 3
         *      calculateFuel(3, km);
         * case currentGear == 4
         *      calculateFuel(4, km);
         *
         */
        switch (currentGear){
            case 1:
                driveAvgConsumptionPer100km = 15;
                calculateFuel(1,km);
                break;
            case 2:
                driveAvgConsumptionPer100km = 12;
                calculateFuel(2,km);
                break;
            case 3:
                driveAvgConsumptionPer100km = 10;
                calculateFuel(3,km);
                break;
            case 4:
                driveAvgConsumptionPer100km = 8;
                calculateFuel(4,km);
                break;
            case 5:
                driveAvgConsumptionPer100km = 6;
                calculateFuel(5,km);
                break;
            case 6:
                driveAvgConsumptionPer100km = 4;
                calculateFuel(6,km);
                break;
            default:
                System.out.println("Current gear has a invalid value");
                break;
        }


    }

    private void calculateFuel(int currentGear,double km){
        double consumption = driveAvgConsumptionPer100km * km / 100;
        availableFuel -= consumption;
        System.out.println("The fuel consumption is : " +consumption + " , available fuel is : " + availableFuel);
    }

    public void shiftGear(int gear) {
        System.out.println("shiftGear " + gear);
        this.currentGear = gear;
    }

    public double getAvailableFuel() {
        return this.availableFuel;
    }

    public double getAvgFuelPer100km() {
        return this.driveAvgConsumptionPer100km;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }
}
