import java.util.Scanner;

public class Sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int rem=0,rev=0;
		while(s!=0)
		{
			rem=s%10;
			rev=(rev*10)+rem;
			s=s/10;
		}
		System.out.println(rev);
	}

}
