package ro.sci.carrental.service;

import ro.sci.carrental.model.Car;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * Interface of CarServicegit
 */

public interface CarServiceInterface {
    /**
     * Find same make cars in system.
     * @param make Car make
     * @return List<Car>
     */
    List<Car> findCarByMake(String make);

    /**
     * Find same make and model cars in system.
     * @param make Car make
     * @param model Car model
     * @return List<Car>
     */
    List<Car> findCarByMakeAndModel(String make, String model);

    /**
     * Find same make,model and color cars in system.
     * @param make Car make
     * @param model Car model
     * @param color Car color
     * @return List<Car>
     */
    List<Car> findCarByMakeAndModelAndColor(String make, String model, String color);
}
