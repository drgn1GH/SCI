package ro.sci.carrental.model.calendar;

import ro.sci.carrental.model.car.Car;
import ro.sci.carrental.model.car.Price;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RentingPrice {
    private static final Logger logger = Logger.getLogger(RentingPrice.class.getName());


    public<T extends Car> RentingPrice(T t, int hour){
        Price price = new Price(t.getPrice().getHirePrice() * hour,t.getPrice().getCoin());
        logger.log(Level.INFO,"You have to pay :"+price +"\n");

    }

}
