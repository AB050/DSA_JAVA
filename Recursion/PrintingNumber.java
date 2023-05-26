package Recursion;

public class PrintingNumber {
  public static void main(String[] args) {
    printNumber(10);
  }

  public static void printNumber(int n) {
    // Base Case
    if (n <= 0)
      return;
    // Recursive Relation
    System.out.println(n);
    printNumber(n - 1);

  }
}
