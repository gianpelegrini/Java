//Giancarlo Pelegrini CB3007634
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaConnect {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=students";
		String user = "stefany";
		String password = "12345678";

		public Connection getConnection() {
			try {
				return DriverManager.getConnection(url, user, password);				
			}			
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
}		

