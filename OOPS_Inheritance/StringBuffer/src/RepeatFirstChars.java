import java.util.Scanner;

public class RepeatFirstChars {
    public static String repeatFirstTwo(String str) {
        if (str.length() < 2) return str;
        String firstTwo = str.substring(0, 2);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(firstTwo);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        sc.close();
        System.out.println(repeatFirstTwo(s));
    }
}
