import java.util.Scanner;

public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int arr[]=new int[3];
		int brr[]=new int[3];
		int res[]=new int[2];
		System.out.println("Enter elements into A");
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elements into B");
		for(int i=0;i<3;i++)
		{
			brr[i]=sc.nextInt();
		}
		res[0]=arr[1];
		res[1]=brr[1];
		for (int i : res) {
			System.out.println(i);
		}
	}

}
