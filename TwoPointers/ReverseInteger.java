package TwoPointers;

public class ReverseInteger {
  public static void main(String[] args) {
    System.out.println(reverse(1534));
    System.out.println(reverse(1534236469));
  }

  static int reverse(int x) {
    long reverse = 0;
    while (x != 0) {
      reverse = reverse * 10 + x % 10;
      x /= 10;
    }
    if (reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE) {
      return (int) reverse;
    } else
      return 0;
  }
}
