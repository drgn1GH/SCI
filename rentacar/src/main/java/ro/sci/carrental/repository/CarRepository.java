package ro.sci.carrental.repository;

import ro.sci.carrental.model.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by tudor on 29.05.2017.
 * Create a CarDao object blueprint
 */
public class CarRepository implements CarRepositoryInterface{
    private static final Logger logger = Logger.getLogger(CarRepository.class.getName());

    private List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(make)) {
                foundCars.add(car);
                logger.log(Level.INFO,"the found cars by model are :\n" +car +"\n");
            }
        }
        return foundCars;
    }

    public List<Car> getCarsByMakeAndModel(String make, String model) {
        List<Car> foundCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)) {
                foundCars.add(car);
                logger.log(Level.INFO,"the found cars by make and model are :" +car +"\n");
            }
        }
        return foundCars;
    }

    public List<Car> getCarsByMakeAndModelAndColor(String make, String model, String color) {
        List<Car> foundCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)
                    && car.getColor().equalsIgnoreCase(color)) {
                foundCars.add(car);
                logger.log(Level.INFO,"the found cars by make ,model and color  are :" +car +"\n");
            }
        }
        return foundCars;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public void update(Car car) {
        cars.set(cars.indexOf(car), car);
    }

    public List<Car> getAll() {
        return cars;
    }
}
