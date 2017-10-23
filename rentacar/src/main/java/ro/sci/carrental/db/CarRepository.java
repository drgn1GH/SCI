package ro.sci.carrental.db;

import ro.sci.carrental.model.car.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CarRepository extends DataBaseConnection implements CarRepositoryInterface<Car> {
    private static final String ID = "id";
    private static final String MAKE = "make";
    private static final String MODEL = "model";
    private static final String COLOR = "color";
    private static final String SELECT_ALL_FROM_CARS_WHERE_MAKE = "SELECT * FROM cars WHERE make=?";
    private static final String SELECT_ALL_FROM_CARS_WHERE_MAKE_AND_MODEL = "SELECT * FROM cars WHERE make=? AND model=?";
    private static final String SELECT_ALL_FROM_CARS_WHERE_MAKE_AND_MODEL_AND_COLOR = "SELECT * FROM cars WHERE make=? AND model=? AND color=?";
    private static final String INSERT_INTO_CARS_VALUES = "INSERT INTO cars(id,make,model,color)" + "VALUES(?,?,?,?)";
    private static final String WRITING_IN_CARS_HAS_SUCCEED = "WRITING_IN_CARS_HAS_SUCCEED" ;
    private static final String REMOVE_FROM_CARS_WHERE_ID = "DELETE FROM cars WHERE id=?";
    private static final String REMOVE_HAS_SUCCEED = "REMOVE_HAS_SUCCEED" ;
    private static final String UPDATE_CARS_WHERE_ID = "UPDATE cars SET make=?,model=?,color=? WHERE id=?";
    private static final String UPDATE_HAS_SUCCEED = "UPDATE_HAS_SUCCEED";
    private static final String SELECT_ALL_FROM_CARS = "SELECT * FROM cars";
    private static final String DATABASE_ERROR = "Db error";
    private static final String EXCEPTION_THROWN = "Exception thrown";


    @Override
    public List getCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<>();

        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FROM_CARS_WHERE_MAKE)) {

            preparedStatement.setString(1, make);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Car car = new Car();
                car.setId(resultSet.getInt(ID));
                car.setMake(resultSet.getString(MAKE));
                car.setModel(resultSet.getString(MODEL));
                car.setColor(resultSet.getString(COLOR));
                foundCars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foundCars;
    }

    @Override
    public List getCarsByMakeAndModel(String make, String model) {
        List<Car> foundCars = new ArrayList<>();

        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FROM_CARS_WHERE_MAKE_AND_MODEL)) {
            preparedStatement.setString(1, make);
            preparedStatement.setString(2, model);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Car car = new Car();
                car.setId(resultSet.getInt(ID));
                car.setMake(resultSet.getString(MAKE));
                car.setModel(resultSet.getString(MODEL));
                car.setColor(resultSet.getString(COLOR));
                foundCars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foundCars;
    }

    @Override
    public List getCarsByMakeAndModelAndColor(String make, String model, String color) {
        List<Car> foundCars = new ArrayList<>();

        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FROM_CARS_WHERE_MAKE_AND_MODEL_AND_COLOR)) {
            preparedStatement.setString(1, make);
            preparedStatement.setString(2, model);
            preparedStatement.setString(3, color);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Car car = new Car();
                car.setId(resultSet.getInt(ID));
                car.setMake(resultSet.getString(MAKE));
                car.setModel(resultSet.getString(MODEL));
                car.setColor(resultSet.getString(COLOR));
                foundCars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foundCars;
    }

    @Override
    public void add(Car car) {
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_CARS_VALUES)) {
            preparedStatement.setInt(1,car.getId());
            preparedStatement.setString(2, car.getMake());
            preparedStatement.setString(3, car.getModel());
            preparedStatement.setString(4, car.getColor());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        LOGGER.log(Level.INFO, WRITING_IN_CARS_HAS_SUCCEED);
    }

    @Override
    public void remove(Car car) {
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_FROM_CARS_WHERE_ID)) {
            preparedStatement.setInt(1, car.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO, REMOVE_HAS_SUCCEED);
    }

    @Override
    public void update(Car car){
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CARS_WHERE_ID)) {
            preparedStatement.setString(1, car.getMake());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setString(3, car.getColor());
            preparedStatement.setInt(4, car.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        LOGGER.log(Level.INFO, UPDATE_HAS_SUCCEED);

    }

    @Override
    public List getAll() {
        List<Car> cars = new ArrayList<>();

        try (Connection connection = newConnection(); Statement statement = connection.createStatement(); ResultSet resultSet= statement.executeQuery(SELECT_ALL_FROM_CARS)) {

            while (resultSet.next()){
                Car car = new Car();
                car.setId(resultSet.getInt(ID));
                car.setMake(resultSet.getString(MAKE));
                car.setModel(resultSet.getString(MODEL));
                car.setColor(resultSet.getString(COLOR));
                cars.add(car);
            }

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        return cars;
    }
}
