public class InterchnageRows {
  public static void main(String[] args) {
    int K = 2, L = 3;
    int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    exchangeAnyTwoRows(mat, K, L);
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
}
