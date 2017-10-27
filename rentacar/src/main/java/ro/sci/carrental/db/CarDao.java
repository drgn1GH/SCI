package ro.sci.carrental.db;

import ro.sci.carrental.model.car.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CarDao extends DataBaseConnection implements CarDaoI<Car> {
    //statements
    private static final String INSERT_STATEMENT = "INSERT INTO cars(make,model,color)" + "VALUES(?,?,?)";
    private static final String UPDATE_STATEMENT = "UPDATE cars SET make=?,model=?,color=? WHERE id=?";
    private static final String REMOVE_STATEMENT = "DELETE FROM cars WHERE id=?";
    private static final String SELECT_ALL_STATEMENT = "SELECT * FROM cars";
    private static final String SELECT_BY_MAKE_STATEMENT = "SELECT * FROM cars WHERE LOWER(make)=LOWER(?)";
    private static final String SELECT_BY_MAKE_AND_AND_MODEL_STATEMENT = "SELECT * FROM cars WHERE LOWER(make)=LOWER(?) AND LOWER(model)=LOWER(?)";
    private static final String SELECT_BY_MAKE_MODEL_AND_COLOR_STATEMENT = "SELECT * FROM cars WHERE LOWER(make)=LOWER(?) AND LOWER(model)=LOWER(?) AND LOWER(color)=LOWER(?)";

    //runtime exceptions
    private static final String DATABASE_ERROR = "Database error";
    private static final String EXCEPTION_THROWN = "Exception thrown";

    //succeed messages
    private static final String WRITING_IN_CARS_HAS_SUCCEED = "WRITING_IN_CARS_HAS_SUCCEED" ;
    private static final String REMOVE_HAS_SUCCEED = "REMOVE_HAS_SUCCEED" ;
    private static final String UPDATE_HAS_SUCCEED = "UPDATE_HAS_SUCCEED";

    @Override
    public List getAll() {
        List<Car> cars = new ArrayList<>();

        try (Connection connection = newConnection(); Statement statement = connection.createStatement(); ResultSet resultSet= statement.executeQuery(SELECT_ALL_STATEMENT)) {

            while (resultSet.next()){
                Car car = new Car();
                car.setId(resultSet.getInt("id"));
                car.setMake(resultSet.getString("make"));
                car.setModel(resultSet.getString("model"));
                car.setColor(resultSet.getString("color"));
                cars.add(car);
            }

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,"All cars : "+cars +"\n");
        return cars;
    }


    @Override
    public void add(Car car) {
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STATEMENT)) {
            preparedStatement.setString(1, car.getMake());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setString(3, car.getColor());
            preparedStatement.execute();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO, WRITING_IN_CARS_HAS_SUCCEED);
    }

    @Override
    public void update(Car car){
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STATEMENT)) {
            preparedStatement.setString(1, car.getMake());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setString(3, car.getColor());
            preparedStatement.setInt(4, car.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO, UPDATE_HAS_SUCCEED);

    }

    @Override
    public void remove(Car car) {
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_STATEMENT)) {
            preparedStatement.setInt(1, car.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO, REMOVE_HAS_SUCCEED);
    }

    @Override
    public List getCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<>();

        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_MAKE_STATEMENT)) {

            preparedStatement.setString(1, make);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Car car = new Car();
                car.setId(resultSet.getInt("id"));
                car.setMake(resultSet.getString("make"));
                car.setModel(resultSet.getString("model"));
                car.setColor(resultSet.getString("color"));
                foundCars.add(car);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,"Results for search by make are: " +foundCars +"\n");
        return foundCars;
    }

    @Override
    public List getCarsByMakeAndModel(String make, String model) {
        List<Car> foundCars = new ArrayList<>();

        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_MAKE_AND_AND_MODEL_STATEMENT)) {
            preparedStatement.setString(1, make);
            preparedStatement.setString(2, model);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Car car = new Car();
                car.setId(resultSet.getInt("id"));
                car.setMake(resultSet.getString("make"));
                car.setModel(resultSet.getString("model"));
                car.setColor(resultSet.getString("color"));
                foundCars.add(car);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,"Results for search by make and model are: " +foundCars +"\n");
        return foundCars;
    }

    @Override
    public List getCarsByMakeAndModelAndColor(String make, String model, String color) {
        List<Car> foundCars = new ArrayList<>();

        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_MAKE_MODEL_AND_COLOR_STATEMENT)) {
            preparedStatement.setString(1, make);
            preparedStatement.setString(2, model);
            preparedStatement.setString(3, color);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Car car = new Car();
                car.setId(resultSet.getInt("id"));
                car.setMake(resultSet.getString("make"));
                car.setModel(resultSet.getString("model"));
                car.setColor(resultSet.getString("color"));
                foundCars.add(car);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,"Results for search by make,model and color are: " +foundCars +"\n");
        return foundCars;
    }
}
