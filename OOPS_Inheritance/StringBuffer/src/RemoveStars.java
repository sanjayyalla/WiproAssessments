public class RemoveStars {
    public static String removeStars(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i > 0) 
                	result.deleteCharAt(result.length() - 1);
                i++;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "ab*cd";
        System.out.println("Result: " + removeStars(input));
    }
}
