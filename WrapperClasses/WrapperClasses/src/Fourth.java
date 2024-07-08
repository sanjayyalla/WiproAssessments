class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

public class Fourth {

	public static void main(String[] args) {
		Employee emp = new Employee("Sanjay");
		Employee empClone = emp.clone();
		empClone.setName("Sanjay Yalla");
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}