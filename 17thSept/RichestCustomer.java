public class RichestCustomer {
  public static void main(String[] args) {
    int[][] accounts = { { 1, 5, 6 }, { 7, 3, 4 }, { 3, 5, 5 } }; // O/p--- 10
    System.out.println(maximumWealth(accounts));
    System.out.println(maxWealthInCOloumn(accounts));
    int[][] nums = { { 1 },
        { 1, 2 },
        { 1, 2, 3 },
        { 1, 2, 3, 4, 5, 6, 7 } };
    System.out.println(ReachestCustomerColoumn(accounts));
    System.out.println(ReachestCustomerColoumn(nums));
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

  private static int maxWealthInCOloumn(int[][] accounts) {
    int max = 0, sum = 0;
    int rows = accounts.length;
    int maxCol = 0;
    for (int i = 0; i < rows; i++) {
      if (accounts[i].length > maxCol) {
        maxCol = accounts[i].length;
      }
    }
    for (int i = 0; i < maxCol; i++) {
      sum = 0;
      for (int j = 0; j < rows; j++) {
        sum += accounts[j][i];
        max = Math.max(sum, max);
      }
    }
    return max;
  }

  static int ReachestCustomerColoumn(int[][] nums) {
    int maxCol = 0;
    int max = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x].length > maxCol)
        maxCol = nums[x].length;
    }
    for (int y = 0; y < maxCol; y++) {
      int sum = 0;
      for (int x = 0; x < nums.length; x++)
        if (y < nums[x].length)
          sum += nums[x][y];
      max = Math.max(sum, max);
      // System.out.println("Sum of col " + y + ": " + sum);
    }
    return max;
  }
}
