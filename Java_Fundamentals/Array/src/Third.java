import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter elements in to the array:");
		int sum=0,index=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to search");
		int ele=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==ele)
			{
				flag=1;
				index=i;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found at index:"+index );
		}else {
			System.out.println("-1");
		}
	}

}
