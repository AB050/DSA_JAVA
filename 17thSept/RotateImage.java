public class RotateImage {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] resultArray = new int[row][col];
    resultArray = rotateMyWay(matrix);
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(resultArray[i][j] + " ");
      }
      System.out.println("");
    }

  }

  public static int[][] rotate(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] resultArray = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        resultArray[i][j] = matrix[j][i];
      }

    }
    return resultArray;
  }

  public static int[][] rotateMyWay(int[][] matrix) {
    // Reverse every Row of matrix
    int start = 0;
    int end = matrix.length - 1;
    while (start < end) {
      int[] temp = matrix[start];
      matrix[start] = matrix[end];
      matrix[end] = temp;
      start++;
      end--;
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix[i].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    return matrix;
  }
}