
public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=args.length;
		if(len==0)
		{
			System.out.println("No values");
		}
		else {
			for(int i=0;i<len-1;i++)
			{
				System.out.print(args[i]+",");
			}
			System.out.println(args[len-1]);
		}
	}

}
