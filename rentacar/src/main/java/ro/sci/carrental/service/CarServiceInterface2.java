package ro.sci.carrental.service;

import ro.sci.carrental.db.CarRepositoryInterface;
import ro.sci.carrental.model.car.Car;

import java.util.List;

public interface CarServiceInterface2<T> {
    void add(T t);
    void remove(T t);
    void update(T t);
    List<T> getAll();
    List<T> findCarByMake(String make);
    List<T> findCarByMakeAndModel(String make,String model);
    List<T> findCarByMakeAndModelAndColor(String make,String model,String color);
    void setCarRepository(CarRepositoryInterface<Car> carRepository);
}
