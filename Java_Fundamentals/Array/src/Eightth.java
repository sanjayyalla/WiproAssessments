import java.util.Scanner;

public class Eightth {
	
	static void conditionalSum(int l[], int a, int b) {

		int sum = 0;
		boolean add = true;
		
		for (int i=0; i<l.length; i++) {

			if (l[i] != a && add == true)

				sum = sum + l[i];
			
			else if (l[i] == a)
				add = false;

			else if (l[i] == b)
				add = true;

		}

		System.out.println(sum);

	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements to array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a = 6;
		int b = 7;
		conditionalSum(arr,a,b);

        }

}
