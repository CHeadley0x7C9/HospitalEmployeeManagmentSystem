package database;
import java.sql.*;

public class DatabaseConnectionManager {
	//manages and operations database connectivity detail
	
	private Connection conn;
	
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	private DatabaseConnectionManager(){}
	
	public static DatabaseConnectionManager getManagerInstance() {
		return connectionInstance;
	}
	
	/**contains connection details 
	 * 
	 * 
	 * @throws SQLException
	 */
	
	public void connect() throws SQLException{
		//processing specific to database connection details
		conn = DriverManager.getConnection("Some/Database/url");
		System.out.println("Established Database Connection...");
	}
	
	public Connection getConnectionObject() {
		return conn;
	}
	
	public void disconnect() throws SQLException{
		conn.close();
		System.out.println("Database Connection is closed...");
	}

}
