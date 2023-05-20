package Recurssion;

public class SayDigits {
  public static void main(String[] args) {
    String[] str = { "Zero", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    digits(214, str);
  }

  public static void digits(int n, String[] arr) {
    // Base case
    if (n == 0)
      return;
    // Processing
    int digit = n % 10;
    n = n / 10;
    // Recursive Call
    digits(n, arr);
    System.out.print(arr[digit] + " ");
  }
}
