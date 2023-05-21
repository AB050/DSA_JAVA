package Recurssion;

public class PailandromeCheck {
  public static void main(String[] args) {
    String str = "KATAK";
    System.out.println(pailandrome(str, 0, str.length() - 1));

  }

  public static boolean pailandrome(String str, int i, int j) {
    // Base Case
    if (i > j)
      return true;
    // Ek case khud kar do banki recurrssion sambhal lega
    if (str.charAt(i) != str.charAt(j))
      return false;
    // Recursive Call
    return pailandrome(str, i + 1, j - 1);

  }
}
