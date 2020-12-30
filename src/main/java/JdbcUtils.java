import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

    public Connection getConnection(Properties properties) throws SQLException {

        return DriverManager.getConnection(properties.getUrl(), properties.getUser(), properties.getPassword());
    }
}
