import java.util.Scanner;

public class Second {

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
			
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<arr[0])
				min=arr[i];
			if(arr[i]>arr[0])
				max=arr[i];
		}
		System.out.println("Min "+min);
		System.out.println("Max "+max);
		
	}

}
