import java.util.Scanner;

public class FirstHalf {
    public static String getFirstHalf(String str) {
        if (str.length() % 2 != 0) 
        	return null;
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s=sc.next();
        sc.close();
        System.out.println(getFirstHalf(s));
    }
}
