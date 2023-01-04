package TwoPointers;

public class FindTheDifferenceL389 {
  public static void main(String[] args) {
    String s = "abcd";
    String t = "abcde";
    System.out.print(findTheDifference(s, t));

  }

  public static char findTheDifference(String s, String t) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      result ^= (int) s.charAt(i);
    }
    for (int i = 0; i < t.length(); i++) {
      result ^= (int) t.charAt(i);
    }
    return (char) result;
  }
}
