package Recursion;

public class SumofNumber {
  public static void main(String[] args) {
    System.out.println(sumnumber(10));
  }

  private static int sumnumber(int n) {
    // Base Case
    if (n == 1)
      return 1;
    if (n == 0)
      return 0;
    return n + sumnumber(n - 1);

  }
}
