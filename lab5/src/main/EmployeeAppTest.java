package main;


	import com.cg.lab5.EmployeeService.empService;
	import com.cg.lab5.EmployeeService.empServiceImpl;
	
	import exception.InvalidAgeException;
	import exception.InvalidNameException;
	import exception.InvalidEntryException;

	public class EmployeeAppTest {

		public static void main(String[] args) {
			empService employeeService =  new empServiceImpl();
			try {
				String john=null;
				String murray = null;
				employeeService.service(20,john,murray,20000);
			} catch (InvalidAgeException e) {
				System.out.println("Problem is : "+e.getMessage());
			} catch (InvalidNameException e) {
				System.out.println("Problem is : "+e.getMessage());
			} catch (InvalidEntryException e) {
				System.out.println("Problem is : "+e.getMessage());

		}

	}
}
