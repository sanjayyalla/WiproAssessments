import java.util.Scanner;

public class Seventeenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int temp=s;
		int rem=0;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		if(s==rev)
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
