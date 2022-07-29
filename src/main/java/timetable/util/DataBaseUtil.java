package timetable.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DataBaseUtil {
	


	private final static Logger log = Logger.getLogger(DataBaseUtil.class.getName());

	private static Connection connection;

	private static String url = "jdbc:postgresql://localhost:5432/postgres";
	private static String user = "postgres";
	private static String password = "4321";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		log.info("Request db connection");
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection(url, user, password);
		log.info("Connection successful");
		return connection;
	}

	public static void closeConnection(ResultSet rs, PreparedStatement stmt, Connection connection) throws SQLException {
		if (rs != null) {
			rs.close();
			
		}
		if (stmt != null) {
			stmt.close();
			
			
		}
		if (connection != null) {
			connection.close();
			
		}
	}
}
	
	