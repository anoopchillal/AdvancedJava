import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMainApp {
	
	public static void main(String[] args) {
		Department marketing = new Department(1,"Marketing");
		Department finance = new Department(2,"Finance");
		Department informationTech = new Department(3,"IT");
		Department operations = new Department(4,"Operations");
		
		JobTitle associate = new JobTitle(1,"Associate");
		JobTitle srAssociate = new JobTitle(2,"SrAssociate");
		JobTitle manager = new JobTitle(3,"Manager");
		JobTitle director = new JobTitle(4,"Director");
		JobTitle vicePresident = new JobTitle(5,"VicePresident");
		JobTitle president = new JobTitle(6,"President");
		
		Employee emp1 =new Employee(1,"Rakesh",marketing,15000.00,25,associate);
		Employee emp2 =new Employee(2,"Rajesh",finance,15500.00,27,srAssociate);
		Employee emp3 =new Employee(3,"Ram",marketing,25000.00,30,srAssociate);
		Employee emp4 =new Employee(4,"Raja",operations,15500.00,29,associate);
		Employee emp5 =new Employee(5,"Kumar",marketing,45000.00,38, manager);
		Employee emp6 =new Employee(6,"Sita",finance,65500.00, 46,director);
		Employee emp7 =new Employee(7,"Geeta",informationTech,35000.00, 44, manager);
		Employee emp8 =new Employee(8,"Neeta",operations,11500.00, 34, associate);
		Employee emp9 =new Employee(9,"Rocky",finance,85000.00, 54, director);
		Employee emp10 =new Employee(10,"Toddy",operations,455000.00,53,president);
		Employee emp11 =new Employee(11,"Gani",informationTech,325000.00,48,vicePresident);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		empList.add(emp9);
		empList.add(emp10);
		empList.add(emp11);
		
//		Map<Department,List<Employee>> groupedEmployee =empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		System.out.println(groupedEmployee);
		
//		Map<Double,List<Employee>> groupedEmployeBySalary = empList.stream().collect(Collectors.groupingBy(Employee::getSalary));
//		System.out.println(groupedEmployeBySalary);
		
		Map<JobTitle, List<Employee>> groupedEmployeByJobTitle = empList.stream().collect(Collectors.groupingBy(Employee::getJobTitle));
		System.out.println(groupedEmployeByJobTitle);
	}

}
