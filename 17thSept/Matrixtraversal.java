public class Matrixtraversal {
  public static void main(String[] args) {
    int[][] mat = { { 1, 2 }, { 5, 6, 7 }, { 9, 10, 11, 12 } };
    traversal(mat);
  }

  // Jagged Array as well as Square Matrix
  // Time Complexity will be O(row*row.length)
  static void traversal(int[][] mat) {
    int i = 0, j = 0;
    int row = mat.length;
    for (i = 0; i < row; i++) {
      for (j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }

  }
}
