
public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[2][2];
		arr[0][0]=Integer.parseInt(args[0]);
		arr[0][1]=Integer.parseInt(args[1]);
		arr[1][0]=Integer.parseInt(args[2]);
		arr[1][1]=Integer.parseInt(args[3]);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After reversing : ");
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
