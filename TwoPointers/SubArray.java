package TwoPointers;

public class SubArray {
  public static void main(String[] args) {
    int[] nums = { 4, 2, -3, 1 };
    System.out.println(SumofSubArray(nums));
  }

  static boolean SumofSubArray(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        for (int k = i; k <= j; k++) {
          sum += nums[j];
          if (sum == 0) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
