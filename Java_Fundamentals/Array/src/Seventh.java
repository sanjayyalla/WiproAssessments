import java.util.HashSet;
import java.util.Scanner;

public class Seventh {

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
		HashSet<Integer> hs= new HashSet<>();
		for(int i=0;i<n;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println("After removing duplicate elements are:");
		for (Integer val : hs) {
			System.out.println(val+" ");
		}
	}

}
