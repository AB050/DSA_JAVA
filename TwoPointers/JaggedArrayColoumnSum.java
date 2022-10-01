package TwoPointers;

public class JaggedArrayColoumnSum {
  public static void main(String[] args) {
    int[][] nums = { { 1 },
        { 1, 2 },
        { 1, 2, 3 },
        { 1, 2, 3, 4, 5, 6, 7 } };
    coloumnSum(nums);

  }

  static void coloumnSum(int[][] nums) {
    int maxCol = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x].length > maxCol)
        maxCol = nums[x].length;
    }
    for (int y = 0; y < maxCol; y++) {
      int sum = 0;
      for (int x = 0; x < nums.length; x++)
        if (y < nums[x].length)
          sum += nums[x][y];
      System.out.println("Sum of col " + y + ": " + sum);
    }
  }
}
