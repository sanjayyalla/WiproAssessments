import java.util.ArrayList;
import java.util.Iterator;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Sanjay");
		list.add("Manu");
		list.add("Janu");
		
		
		
		printAll(list);
	}

	static void printAll(ArrayList<String> list) {
		// TODO Auto-generated method stub
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}