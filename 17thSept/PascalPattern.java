public class PascalPattern {

  public static void main(String[] args) {
    PascalTriangle(9);
  }

  public static void PascalTriangle(int n) {
    int spaces = n;
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      int number = 1;
      for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        number = number * (i - j) / (j + 1);
      }
      spaces--;
      System.out.println(" ");
    }
  }
}
