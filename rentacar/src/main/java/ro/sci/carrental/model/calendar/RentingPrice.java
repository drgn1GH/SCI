package ro.sci.carrental.model.calendar;

import ro.sci.carrental.model.car.Car;
import ro.sci.carrental.model.car.Price;

public class RentingPrice {
    public<T extends Car> RentingPrice(T t, int hour){
        Price price = new Price(t.getPrice().getHirePrice() * hour,t.getPrice().getCoin());
        System.out.println(price);
    }

}
