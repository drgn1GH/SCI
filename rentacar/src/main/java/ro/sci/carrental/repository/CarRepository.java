package ro.sci.carrental.repository;

import ro.sci.carrental.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * Create a CarRepository object blueprint
 */
public class CarRepository implements CarRepositoryInterface {
    private List<Car> cars;

    public CarRepository(){
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public void updateCar(Car car){
        cars.set(cars.indexOf(car),car);
    }

    public List<Car> getAll() {
        return cars;
    }
}
