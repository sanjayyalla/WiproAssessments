import java.util.Scanner;

public class LastFirstLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        sc.close();
		String output;

		if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;
		
		System.out.println(output);
	}

}