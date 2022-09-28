public class DiagonalDifference {
  public static void main(String[] args) {
    int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } }; // o/p- {1+5+9}-{3+5+9} = 2
    System.out.println(diagonalDifference(mat));
  }

  static int diagonalDifference(int[][] mat) {
    int d1 = 0, d2 = 0;
    int n = mat.length;
    int j = 1;
    for (int i = 0; i < n; i++) {
      d1 += mat[i][j];
      d2 += mat[i][n - i - 1];
    }
    return Math.abs(d1 - d2);
  }

}
