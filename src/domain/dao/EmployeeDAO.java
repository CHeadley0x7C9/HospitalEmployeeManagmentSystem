package domain.dao;
import java.sql.SQLException;

import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {
	public void saveEmployee(Employee Employee) throws SQLException {
		//first establish a connection with the database
		DatabaseConnectionManager connectionManager =  DatabaseConnectionManager.getManagerInstance();
		connectionManager.connect();
		connectionManager.getConnectionObject().prepareStatement("Insert into Employee table" );
		connectionManager.disconnect();
		System.out.println("Saved employee to the database...");
;		
	
	}
	
	public void deleteEmployee(Employee Employee) throws SQLException {
		
		DatabaseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("Delete person from Employee table");		
		System.out.println("Deleted employee from the database...");
		
	}

}
