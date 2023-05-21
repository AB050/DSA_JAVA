package Recursion;

public class ReverseString {
  public static void main(String[] args) {
    String str = "Abh";
    System.out.println(reverse(str, 0, str.length() - 1));
  }

  public static String reverse(String str, int i, int j) {
    // Base Case
    if (i > j)
      return new String(str);
    // Ek case khud solve kar lo banki Recurrssion Sambhal lega
    char[] charArray = str.toCharArray();
    char temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    i++;
    j--;
    // Recursive Call
    return reverse(new String(charArray), i, j);
  }

}
