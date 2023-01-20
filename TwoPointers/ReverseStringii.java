package TwoPointers;

public class ReverseStringii {
  public static void main(String[] args) {
    String s = "abcd";
    int k = 2;
    System.out.println(reverseStr(s, k));
  }

  public static String reverseStr(String s, int k) {
    char[] str = s.toCharArray();
    int n = str.length;
    for (int i = 0; i < n; i += 2 * k) {
      if (i + k - 1 < n) {
        reverse(str, i, i + k - 1);
      } else {
        // for fewer than k characters left (edge case)
        reverse(str, i, n);
      }
    }
    return new String(str);
  }

  public static void reverse(char[] str, int start, int end) {
    while (start <= end) {
      char temp = str[start];
      str[start] = str[end];
      str[end] = temp;
      start++;
      end--;
    }
  }

}
