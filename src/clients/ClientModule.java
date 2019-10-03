package clients;
import java.sql.SQLException;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;
import domain.Employee;
import domain.dao.EmployeeDAO;

public class ClientModule {

	public static void main(String[] args) throws SQLException {
		
		Employee newEmployee = new Employee(112333330,"Ciera Headley","IT Department",true);
		
		Employee badEmployee = new Employee(666666666,"Micheal Blue","IT Department",false);
		
		//Employee 1
		ClientModule.hireNewEmployee(newEmployee);
		printEmployeeReport(newEmployee,FormatType.CSV);
		
		//Employee 2
		ClientModule.terminateEmployee(badEmployee);
		printEmployeeReport(newEmployee,FormatType.XML);
		
	
	}
	public static void hireNewEmployee(Employee emp) throws SQLException {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(emp);
		
	}
	
	
	public static void terminateEmployee(Employee emp) throws SQLException {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(emp);
		
		
		
	}
	
	
	public static void printEmployeeReport(Employee employee, FormatType format) {
		
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee,format);
		
		System.out.println(formatter.getFormattedEmployee());		
	}

}
