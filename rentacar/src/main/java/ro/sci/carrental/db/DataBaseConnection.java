package ro.sci.carrental.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class DataBaseConnection {
    Connection newConnection() {
        loadDriver();
        DriverManager.setLoginTimeout(60);

        try {
            String url = "jdbc:" + "postgresql" + "://" + "localhost" + ":" + "5432" + "/" + "rentacar" + "?user=" + "lala" + "&password=" + "lala";
            System.out.println("connection to db ok");
            return DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }

        return null;
    }

    /**
     * Load postgresql JDBC driver
     */
    private void loadDriver() {

        try {
            Class.forName("org.postgresql.Driver").newInstance();
            System.out.println("driver found");

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }
    }
}
