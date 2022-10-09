public class InterchnageRows {
  public static void main(String[] args) {
    int K = 1, L = 4;
    int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    // exchangeAnyTwoRows(mat, K, L);
    exchangeAnyTwoCols(mat);
  }

  public static void exchangeAnyTwoRows(int[][] matrix,
      int K, int L) {
    int[] temp = matrix[K - 1];
    matrix[K - 1] = matrix[L - 1];
    matrix[L - 1] = temp;
    printMatrix(matrix);
  }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
  }

  public static void exchangeAnyTwoCols(int[][] matrix) {
    int row = matrix.length;
    for (int i = 0; i < row; i++) {
      int temp = matrix[i][0];
      matrix[i][0] = matrix[i][1];
      matrix[i][1] = temp;
    }
    printMatrix(matrix);

  }

  public static void printColMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(" ");
    }
  }
}