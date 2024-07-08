import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		if(a>b)
		{
			System.out.println(b+","+a);
		}else {
			System.out.println(a+","+b);
		}
		
	}

}
