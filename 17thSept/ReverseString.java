public class ReverseString {
  public static void main(String[] args) {
    String s = "hello";
    System.out.println(reverseString(s));
  }

  public static String reverseString(String s) {
    char[] word = s.toCharArray();
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      // Swapping
      char t = word[start];
      word[start] = word[end];
      word[end] = t;
      start++;
      end--;
    }
    return new String(word);
  }
}
