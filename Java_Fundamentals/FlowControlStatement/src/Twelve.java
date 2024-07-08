import java.util.Scanner;

public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int cnt=0;
		for(int i=1;i*i<=s;i++)
		{
			if(s%i==0)
			{
				cnt++;
				if((s/i)!=i)
				{
					cnt++;
				}
			}
			
		}
		if(cnt==2)
		{
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
	}

}
