import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isUpperCase(c))
		{
			System.out.println(Character.toLowerCase(c));
		}else {
			System.out.println(Character.toUpperCase(c));
		}
	}

}
