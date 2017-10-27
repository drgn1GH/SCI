package ro.sci.carrental.reader;

import ro.sci.carrental.model.car.Car;

public class CarConverter implements Converter<Car> {
    @Override
    public Car convert(String convertedString) throws InvalidEntityException {
        String[] tokens = convertedString.split (",");
        if (tokens.length != 3) {
            throw new InvalidEntityException ("Invalid Car Description");
        }

        Car car = new Car();
        car.setMake (tokens[0]);
        car.setModel (tokens[1]);
        car.setColor (tokens[2]);
        return car;
    }
}