package ro.sci.carrental.service;

import ro.sci.carrental.model.car.Car;
import ro.sci.carrental.repository.CarRepository;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * renamed SearchService into CarService
 * Create a CarService object blueprint
 */
public class CarService implements CarServiceInterface {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findCarByMake(String make) {
        if (null == make || make.isEmpty()) {
            System.out.println("one of the parameters are empty string");
            return null;
        }
        return carRepository.getCarsByMake(make);

    }

    public List<Car> findCarByMakeAndModel(String make, String model) {
        if (null == make || null == model || make.isEmpty() || model.isEmpty()) {
            System.out.println("find result is null");
            return null;
        }
        return carRepository.getCarsByMakeAndModel(make, model);
    }

    public List<Car> findCarByMakeAndModelAndColor(String make, String model, String color) {
        if (null == make || null == model || null == color || make.isEmpty() || model.isEmpty() || color.isEmpty()) {
            System.out.println("find result is null");
            return null;
        }
        return carRepository.getCarsByMakeAndModelAndColor(make, model, color);
    }
}
