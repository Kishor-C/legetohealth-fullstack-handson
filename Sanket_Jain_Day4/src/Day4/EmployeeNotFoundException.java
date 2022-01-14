package Day4;

public class EmployeeNotFoundException extends Exception {
	
	EmployeeNotFoundException() {
		super("Employee is invalid!");
	}
	EmployeeNotFoundException(String error) {
		super(error);
	}
}
