public class ReverseVowelString {
    public static void main(String[] args) {
        System.out.println(reverseVowel("hello"));
        System.out.println(reverseVowel("leetCode"));
    }

    public static String reverseVowel(String s) {
        // Start Two Indices from two corners and move toward each other
        int start = 0, end = s.length() - 1;
        char[] str = s.toCharArray();
        while (start < end) {
            if (!isVowel(str[start])) {
                start++;
                continue;
            }

            if (!isVowel(str[end])) {
                end--;
                continue;
            }
            // Swapping
            char t = str[start];
            str[start] = str[end];
            str[end] = t;

            start++;
            end--;
        }

        String ans = new String(str);
        return ans;
    }

    // utility function
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U');
    }

}
