import java.util.Iterator;
import java.util.TreeSet;

public class Third {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		
		set.add("Sanjay");
		set.add("Sanjay Yalla");
		
		Iterator<String> it = set.iterator();
		String query = "Sanjay";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}