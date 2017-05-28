package ro.sci.carrental.repository;

import ro.sci.carrental.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public class CarRepository {
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

    public List<Car> getCars() {
        return cars;
    }
}
