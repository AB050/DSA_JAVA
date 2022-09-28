public class RichestCustomer {
  public static void main(String[] args) {
    int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } }; // O/p--- 10
    System.out.println(maximumWealth(accounts));
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
}
