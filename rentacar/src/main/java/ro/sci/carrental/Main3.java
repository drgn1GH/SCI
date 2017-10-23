package ro.sci.carrental;

import ro.sci.carrental.db.CarRepository;
import ro.sci.carrental.db.CarRepositoryInterface;
import ro.sci.carrental.db.CustomerRepositoryInterface;
import ro.sci.carrental.model.car.Car;
import ro.sci.carrental.service.CarService2;
import ro.sci.carrental.service.CarServiceInterface2;

import java.util.logging.Logger;

public class Main3 {
    private static Logger logger = Logger.getLogger(Main3.class.getName());

    public static void main(String[] args) {
        CarServiceInterface2<Car> carServiceInterface2 = new CarService2();
        CarRepositoryInterface<Car> carRepositoryInterface = new CarRepository();
        carServiceInterface2.setCarRepository(carRepositoryInterface);
//        carServiceInterface2.getAll().forEach(car -> System.out.println(car) );
//        System.out.println("\n");
//        System.out.println(carServiceInterface2.findCarByMake("Audi"));
//        System.out.println("\n");
//        System.out.println(carServiceInterface2.findCarByMake("BMW"));
//        //   carRepositoryInterface.add(car5);
//        System.out.println(carServiceInterface2.findCarByMake("hehe"));
//    //    carRepositoryInterface.remove(car5);
//        System.out.println(carServiceInterface2.findCarByMake("hehe"));
//        System.out.println("\n");
//        System.out.println("\n");
//        carServiceInterface2.getAll().forEach(car -> System.out.println(car));
//
     //   Car car9 = new Car();
       // car9.setMake("ididid");
//        car9.setColor("red");
      //  carServiceInterface2.add(car9);
//        System.out.println(car9.getId());
//        carServiceInterface2.findCarByMake("work").toString();

        //carServiceInterface2.remove(car9);
//        car9.setColor("Update");
//        car9.setId(11);
    // carServiceInterface2.remove(car9);
       // carServiceInterface2.add(car9);
        //car9.setId();
        //carServiceInterface2.update(car9);

//        car9.setMake("huhhhhhh");
//        car9.setModel("jajs");
//        car9.setColor("lulu");
//        carServiceInterface2.update(car9);
      //  Car car10 = new Car();
      //  carServiceInterface2.add(car10);
     //   car10.setId(12);
     //   carServiceInterface2.remove(car10);
//        car5.setMake("lala");
//        //carServiceInterface2.add(car5);
//        car5.setMake("huh");
//        car5.setModel("hehhe");

//        Car newcar = new Car(15,"huhu","broasca","red");
//        //carServiceInterface2.add(newcar);
//        newcar.setColor("ROZ");
//       // carServiceInterface2.update(newcar);
//        newcar.setId(21);
//        carServiceInterface2.update(newcar);

//        Car carX = new Car();
//        carX.setId(55);
//        carX.setColor("maro");
//        //carServiceInterface2.add(carX);
//        carX.setColor("auriu");
//        carServiceInterface2.update(carX);
//        carServiceInterface2.remove(carX);
//
//        Car car4 = new Car();
//        car4.setId(4);
//        car4.setMake("BMW");
//        car4.setModel("X3");
//        car4.setColor("black");
//        //carServiceInterface2.add(car4);
//        car4.setId(5);
//        car4.setModel("newModedsdl");
//        carServiceInterface2.update(car4);
//
//
//        carServiceInterface2.getAll().forEach(car -> System.out.println(car));
        CustomerRepositoryInterface customerRepositoryInterface =



    }
}
