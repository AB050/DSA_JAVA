package Recurssion;

public class PowerofTwo {
  public static void main(String[] args) {
    System.out.println(power(3));
  }

  public static int power(int n) {
    // Base case
    if (n == 0)
      return 1;
    return 3 * power(n - 1);
  }
}
