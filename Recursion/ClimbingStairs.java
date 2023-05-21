package Recursion;

public class ClimbingStairs {
  public static void main(String[] args) {
    System.out.println(climbstairs(5));
  }

  public static int climbstairs(int n) {
    // Base Case
    if (n < 0)
      return 0;
    if (n == 0)
      return 1;
    // Recurssive Approach
    return climbstairs(n - 1) + climbstairs(n - 2);
  }
}
