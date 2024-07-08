import java.util.Scanner;

public class Eleventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for (int i : arr) {
			if(i==1||i==4)
			{
				flag=true;
			}else {
				flag=false;
			}
		}
		System.out.println(flag);
	}

}
