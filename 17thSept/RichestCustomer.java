public class RichestCustomer {
  public static void main(String[] args) {
    int[][] accounts = { { 1, 5, 6 }, { 7, 3, 4 }, { 3, 5, 5 } }; // O/p--- 10
    System.out.println(maximumWealth(accounts));
    System.out.println(maxWealthinCOloumn(accounts));
  }

  private static int maximumWealth(int[][] accounts) {
    int max = 0, sum = 0;
    for (int i = 0; i < accounts.length; i++) {
      sum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        sum += accounts[i][j];
        max = Math.max(sum, max);
      }
    }
    return max;
  }

  private static int maxWealthinCOloumn(int[][] accounts) {
    int max = 0, sum = 0;
    int rows = accounts.length;
    int cols = accounts[0].length;
    for (int i = 0; i < cols; i++) {
      sum = 0;
      for (int j = 0; j < rows; j++) {
        sum += accounts[j][i];
        max = Math.max(sum, max);
      }
    }
    return max;
  }
}
