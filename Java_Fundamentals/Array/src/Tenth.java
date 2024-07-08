import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tenth {

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
		sc.close();
		System.out.println("After modifying:");
		 List<Integer> evenNums = new ArrayList<>();
	        List<Integer> oddNums = new ArrayList<>();
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenNums.add(num);
	            } else {
	                oddNums.add(num);
	            }
	        }
	        int[] result = new int[n];
	        int index = 0;
	        
	        for (int num : evenNums) {
	            result[index++] = num;
	        }
	        
	        for (int num : oddNums) {
	            result[index++] = num;
	        }

	        for(int i=0;i<n;i++)
			{
				System.out.print(result[i]+" ");
			}
	       
	    }
	}