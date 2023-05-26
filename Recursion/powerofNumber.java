package Recursion;

class PowerofNumber {
  public static void main(String[] args) {
    System.out.println(isPowerOfFour(100));
  }

  private static boolean isPowerOfFour(int n) { // Base case
    if (n == 1)
      return true;
    if (n <= 0 || n % 4 != 0)
      return false;
    return isPowerOfFour(n / 4);
  }
}
