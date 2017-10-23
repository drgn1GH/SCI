package ro.sci.carrental.service;

import ro.sci.carrental.db.CarRepositoryInterface;
import ro.sci.carrental.model.car.Car;

import java.util.List;

public class CarService2 implements CarServiceInterface2<Car>{
    private CarRepositoryInterface<Car> carRepository;

    @Override
    public void add(Car car) {
        this.carRepository.add(car);
    }

    @Override
    public void remove(Car car) {
        this.carRepository.remove(car);

    }

    @Override
    public void update(Car car) {
        this.carRepository.update(car);

    }

    @Override
    public List<Car> getAll() {
       return this.carRepository.getAll();
    }

    @Override
    public List<Car> findCarByMake(String make) {
        return this.carRepository.getCarsByMake(make);
    }

    @Override
    public List<Car> findCarByMakeAndModel(String make, String model) {
        return this.carRepository.getCarsByMakeAndModel(make,model);
    }

    @Override
    public List<Car> findCarByMakeAndModelAndColor(String make, String model, String color) {
        return this.carRepository.getCarsByMakeAndModelAndColor(make,model,color);
    }

    @Override
    public void setCarRepository(CarRepositoryInterface<Car> carRepositoryInterface) {
        this.carRepository = carRepositoryInterface;
    }
}
