package ro.sci.carrental.repository;

import ro.sci.carrental.model.car.Car;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * Interface of CarRepository
 */
public interface CarRepositoryInterface {

    /**
     * Find same make cars in system.
     *
     * @param make Car make
     * @return List<Car>
     */
    List<Car> getCarsByMake(String make);

    /**
     * Find same make and model cars in system.
     *
     * @param make  Car make
     * @param model Car model
     * @return List<Car>
     */
    List<Car> getCarsByMakeAndModel(String make, String model);

    /**
     * Find same make,model and color cars in system.
     *
     * @param make  Car make
     * @param model Car model
     * @param color Car color
     * @return List<Car>
     */
    List<Car> getCarsByMakeAndModelAndColor(String make, String model, String color);

    /**
     * Add a car in the system.
     *
     * @param car
     */
    void addCar(Car car);

    /**
     * Removes a car from the system.
     *
     * @param car
     */
    void removeCar(Car car);

    /**
     * Updates car information in the system.
     *
     * @param car
     */
    void updateCar(Car car);

    /**
     * Get all cars in the system
     *
     * @return List<Car>
     */
    List<Car> getAll();


}
