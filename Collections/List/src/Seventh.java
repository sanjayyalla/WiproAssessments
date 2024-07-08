import java.util.Iterator;
import java.util.Vector;

class Employeee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employeee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Seventh {

	public static void main(String[] args) {
		Vector<Employeee> list = new Vector<>();
		
		list.add(new Employeee(101, "Sanjay", "123 street, India", 20000.0));
		list.add(new Employeee(102, "Sanjay Yalla", "234 street, India", 30000.0));
		
		
		Iterator<Employeee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}