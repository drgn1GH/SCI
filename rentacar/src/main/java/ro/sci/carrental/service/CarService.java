package ro.sci.carrental.service;

import ro.sci.carrental.model.Car;
import ro.sci.carrental.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 * renamed SearchService into CarService
 * Create a CarService object blueprint
 */
public class CarService implements CarServiceInterface {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> findCarByMake(String make){
        List<Car> foundCars = new ArrayList<Car>();

        for(Car car : carRepository.getAll()){
            if (car.getMake().equalsIgnoreCase(make)){
                foundCars.add(car);
                System.out.println(car.getMake()+ " "+ car.getModel()+ " " + car.getColor());

            }
        }
        return foundCars;
    }

    public List<Car> findCarByMakeAndModel(String make, String model){
        List<Car> foundCars = new ArrayList<Car>();

        for(Car car : carRepository.getAll()){
            if(car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)){
                foundCars.add(car);
                System.out.println(car.getMake()+ " "+ car.getModel()+ " " + car.getColor());
            }
        }
        return foundCars;
    }

    public List<Car> findCarByMakeAndModelAndColor(String make, String model, String color){
        List<Car> foundCars = new ArrayList<Car>();

        for(Car car :  carRepository.getAll()) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)
                    && car.getColor().equalsIgnoreCase(color)) {
                foundCars.add(car);
                System.out.println(car.getMake() + " " + car.getModel() + " " + car.getColor());
            }
        }
        return foundCars;
    }

}
