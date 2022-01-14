package Day4;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		//
		
		EmployeeStorageImpl eImpl= new EmployeeStorageImpl();
		Employee e =new Employee();
		//Employee e = new Employee();
		System.out.println("3.	Create an EmployeeStorage interface with All Methods \n");
		System.out.println("4.	Create an	EmployeeNotFoundException  \n");
		System.out.println("5.	Implement the EmployeeStorage interface in a class called EmployeeStorageImpl, it uses ArrayList to maintain the employee object. ");
		System.out.println("main methods shows below options repeatedly until you enter option: 5");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any one option Below and Enter in digits : 1.Store\r\n" + 
				"2.	Find by id\r\n" + 
				"3.	Find all\r\n" + 
				"4.	Delete by id\r\n" + 
				"5.	Exit\r\n" 
				 );
		int option = sc.nextInt();
		switch(option)
		{
		case 1:  System.out.println("Please Enter Employee Id : \n");
		e.setId(sc.nextInt());
		System.out.println("Enter Employee Name : \n");
		sc.nextLine();
		String eName = sc.nextLine();
		e.setName(eName);
		
		System.out.println("Enter Salary of Employee : \n");
		e.setSalary(sc.nextInt());
		int result = eImpl.save(e);
		if(result==0) {System.out.println("Employee Details Are not Stored ");}else {System.out.println("Employee Details Are Stored Succesfully : "+ result);}
		System.out.println("Please Enter Id"); e=eImpl.findEmployee(sc.nextInt());if(e==null) {throw new EmployeeNotFoundException("Employee Id : is Not Found !! ,Please Enter a Vaild User Id.");}else{System.out.println(e);}; 
		break;
		case 2: e=eImpl.findEmployee(sc.nextInt());if(e==null) {throw new EmployeeNotFoundException("Employee Id : is Not Found !! ,Please Enter a Vaild User Id.");}; break;
		case 3: System.out.println("Employee Details :  "+ eImpl.findEmployees()); break;
		case 4: eImpl.delete(sc.nextInt()); break;
		case 5: sc.close();break;
		default: sc.close();System.out.println("Please Enter Any Key Exit.");
		}
	
		
	
		
		
	}

	
}
