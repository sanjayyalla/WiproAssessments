public class Palindrome {
    public static boolean isPalindrome(String str) {
        StringBuffer reversed = new StringBuffer(str).reverse();
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is palindrome: " + isPalindrome(input));
    }
}
