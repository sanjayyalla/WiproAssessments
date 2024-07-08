import java.util.HashMap;
import java.util.TreeMap;



public class Fourth {

	public static void main(String[] args) {
		CountryTreeMap countryMapp = new CountryTreeMap();

		countryMapp.saveCountryCapital("India", "Delhi");
		countryMapp.saveCountryCapital("Japan", "Tokyo");
		countryMapp.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMapp.getCapital("India"));
		System.out.println(countryMapp.getCountry("Tokyo"));
		System.out.println(countryMapp.toArrayList());
		
		TreeMap<String, String> M2 = countryMapp.swapKeyValue();
		System.out.println(M2);
	}

}