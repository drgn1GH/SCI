package ro.sci.carrental.repository;

import ro.sci.carrental.model.car.Car;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * Interface of CarRepository
 */
public interface CarRepositoryInterface<T extends Car> {

    /**
     * Find same make cars in system.
     *
     * @param make Car make
     * @return List<Car>
     */
    List<T> getCarsByMake(String make);

    /**
     * Find same make and model cars in system.
     *
     * @param make  Car make
     * @param model Car model
     * @return List<Car>
     */
    List<T> getCarsByMakeAndModel(String make, String model);

    /**
     * Find same make,model and color cars in system.
     *
     * @param make  Car make
     * @param model Car model
     * @param color Car color
     * @return List<Car>
     */
    List<T> getCarsByMakeAndModelAndColor(String make, String model, String color);

    /**
     * Add a car in the system.
     *
     * @param car
     */
    void add(T t);

    /**
     * Removes a car from the system.
     *
     * @param car
     */
    void remove(T t);

    /**
     * Updates car information in the system.
     *
     * @param car
     */
    void update(T t);

    /**
     * Get all cars in the system
     *
     * @return List<Car>
     */
    List<Car> getAll();


}
