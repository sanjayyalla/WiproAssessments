
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int empId;
	private String empName, email, gender;
	private float salary;
	
	Employee(int empId, String empName, String empEmail, String empGender, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		email = empEmail;
		gender = empGender;
		salary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public float getSalary() {
		return salary;
	}

	void GetEmployeeDetails() {
		System.out.println("Employee [EmpId=" + empId + ", EmpName=" + empName + ", EmpEmail=" + email 
				+ ", EmpGender=" + gender + ", EmpSalary=" + salary + "]");
	}
}

class EmployeeDB {
	List<Employee> employeeDb = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return employeeDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = employeeDb.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getSalary();
			}
		}
		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}
}

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Sanjay", "sanjayyalla4661@gmail.com", "Male", 2500000);
		Employee emp2 = new Employee(102, "Janu", "jahnavipadala10@gmail.com", "Female", 2500000);
		
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		

		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		//empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(102));
	}

}