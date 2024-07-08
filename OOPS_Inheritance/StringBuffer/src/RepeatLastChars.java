public class RepeatLastChars {
    public static String repeatLastN(String str, int n) {
        String lastNChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Wipro";
        int n = 3;
        System.out.println(repeatLastN(input, n));
    }
}