import java.util.Scanner;

public class Nineth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("After removing the elements 10 ");
		int cpy[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=10)
			{
				cpy[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(cpy[i]+" ");
		}
		
	}

}
