package Recursion;

public class Fibbonacci {
  public static void main(String[] args) {
    System.out.println(fibb(9));
  }

  public static int fibb(int n) {
    // Base Case
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;
    int ans = fibb(n - 2) + fibb(n - 1);
    return ans;
  }
}
