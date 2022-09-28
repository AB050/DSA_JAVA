public class sumOfMatrixElement {
  public static void main(String[] args) {
    int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
    System.out.println(sumofMatrix(mat));
  }

  // Array can be jagged or Square Matrix
  static long sumofMatrix(int[][] mat) {
    int row = mat.length;
    System.out.println(row);
    int col = mat[0].length;
    System.out.println(col);
    long sum = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        sum += mat[i][j];
      }
    }
    return sum;
  }
}
