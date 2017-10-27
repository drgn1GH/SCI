package ro.sci.carrental.service;

import ro.sci.carrental.repository.CarRepositoryInterface;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * Interface of CarServicegit
 */

public interface CarServiceInterface<T extends CarRepositoryInterface> {
    /**
     * Find same make cars in system.
     *
     * @param make Car make
     * @return retrieve CarDao List<Car>
     */
    List<T> findCarByMake(String make);

    /**
     * Find same make and model cars in system.
     *
     * @param make  Car make
     * @param model Car model
     * @return retrieve CarDao List<Car>
     */
    List<T> findCarByMakeAndModel(String make, String model);

    /**
     * Find same make,model and color cars in system.
     *
     * @param make  Car make
     * @param model Car model
     * @param color Car color
     * @return retrieve CarDao List<Car>
     */
    List<T> findCarByMakeAndModelAndColor(String make, String model, String color);
}
