import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size:");
			int n=sc.nextInt();
			int arr[]= new int[n];
			System.out.println("Enter elements in to the array:");
			int sum=0;
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			int avg=sum/n;
			System.out.println("Sum:"+sum+" Average:"+avg);
			
			
			
	}

}
