public class Nine {
    public static String interleave(String a, String b) {
        StringBuilder result = new StringBuilder();
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }
        result.append(a.substring(len)).append(b.substring(len));
        return result.toString();
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println(interleave(a, b));
    }
}
