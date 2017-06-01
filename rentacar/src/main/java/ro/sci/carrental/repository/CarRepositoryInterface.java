package ro.sci.carrental.repository;

import ro.sci.carrental.model.Car;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * Interface of CarRepository
 */
public interface CarRepositoryInterface {

    /**
     * Add a car in the system.
     * @param car
     */
    void addCar(Car car);

    /**
     * Removes a car from the system.
     * @param car
     */
    void removeCar(Car car);

    /**
     * Updates car information in the system.
     * @param car
     */
    void updateCar(Car car);

    /**
     * Get all cars in the system
     * @return List<Car>
     */
    List<Car> getAll();
}
