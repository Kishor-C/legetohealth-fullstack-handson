package Day4;

import java.util.ArrayList;

public class EmployeeStorageImpl implements EmployeeStorage {
	ArrayList<Employee> empList = new ArrayList<>();
	@Override
	public int save(Employee e) {
		if(e.getId()==0 || e==null)
		{
			return 0;
		}else {
			empList.add(e);
			return 1;
		}
		// TODO Auto-generated method stub
		//return 1;
	}

	
	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		//ArrayList<Employee> em = new ArrayList<>();
		for (Employee e : empList) {
			if(!empList.isEmpty()) {
				if(e.getId()==id) 
				{
					return e;
				}
			}
			else {
				throw new EmployeeNotFoundException("Employee Id : "+id+" is Not Found !! ,Please Enter a Vaild User Id.");
			//System.out.println("User "+userId+" is invalid");
			}
		} 
		
		return null;
	}


	@Override
	public Employee[] findEmployees() {
		// TODO Auto-generated method stub
		//Employee [] eDetails ;	
		//ArrayList<Employee> em = empList;
		Employee[] eDetails = new Employee[empList.size()] ;
		for(int i =0; i<=empList.size();i++)
		{
			if(!empList.isEmpty()) {
			eDetails[i]=empList.get(i);
			return eDetails;
			}
		}
		return null;
	}

	
	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		for(Employee e:empList)
		{
			if(e.getId()==id)
			{
				empList.remove(e);
				System.out.println("Entered Emplyee id: " + e+"Deleted ");
				break;
			}
			
		}
		if(empList.isEmpty())
		{
			throw new EmployeeNotFoundException("Employee Id : is Not Found !! ,Please Enter a Vaild User Id.");
		}
	}
}