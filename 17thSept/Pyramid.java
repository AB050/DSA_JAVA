class Pyramid {
  public static void main(String[] args) {
    int n = 4;
    int m = 4;
    SquarePattern(n, m);
  }

  public static void SquarePattern(int n, int m) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}