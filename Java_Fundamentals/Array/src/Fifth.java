import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter elements in to the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int i;
		for (i = 0; i < n; i++)
		{
		   if (arr[i] < small)
		   {
			  second_small = small;
			  small = arr[i];
		   }
		   else if (arr[i] < second_small && arr[i] != small)
		   {
			  second_small = arr[i];
		   }
		}
		
		System.out.println("First Min "+small);
		System.out.println("Second Min "+second_small);
	}
		
	}



