package Recursion;

public class PowerofTwo {
  public static void main(String[] args) {
    System.out.println(power(8));
  }

  public static int power(int n) {
    // Base case
    if (n == 0)
      return 1;
    return 2 * power(n - 1);
  }
}
