package clase33plus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
    private final Database database;

    public Mysql(Database database) {
       this.database = database;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, "root", "12345");
    }
}
