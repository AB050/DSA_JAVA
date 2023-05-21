package Recursion;

public class powerusingRecur {
  public static void main(String[] args) {
    int a = 2;
    int b = 5;
    System.out.print(power(a, b));
  }

  public static int power(int a, int b) {
    // Base case
    if (b == 0)
      return 1;
    // Ek case khud solve kar lo banki Recurrssion Sambhal lega
    if (b % 2 != 0) {
      return a * power(a, b - 1);
    } else {
      int ans = power(a, b / 2);
      return ans * ans;
    }
  }
}
