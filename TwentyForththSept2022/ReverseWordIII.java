package TwentyForththSept2022;

public class ReverseWordIII {
  public static void main(String[] args) {
    String str = "Let's take LeetCode contest"; // O/p--s'teL ekat edoCteeL tsetnoc
    ReverseWordIII rev = new ReverseWordIII();
    System.out.println(rev.reverseWords(str));
  }

  public String reverseWords(String s) {
    char[] str = s.toCharArray();
    int anchor = 0;
    for (int i = 0; i < str.length; i++) {
      if (str[i] == ' ') {
        reverse(str, anchor, i - 1);
        anchor = i + 1;
      } else if (i == str.length - 1) {
        reverse(str, anchor, i);
      }
    }
    return new String(str);
  }

  private void reverse(char[] str, int start, int end) {
    while (start <= end) {
      char temp = str[start];
      str[start++] = str[end];
      str[end--] = temp;
    }

  }

}
