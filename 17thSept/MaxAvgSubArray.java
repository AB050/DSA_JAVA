public class MaxAvgSubArray {
  public static void main(String[] args) {
    int[] nums = { 1, 12, -5, -6, 50, 3 }; // O/p---- {12-5-6+50}/4.0;
    int k = 4;
    System.out.println(findMaxAverage(nums, k));
    int[] nums1 = { 5 }; // o/p-5
    int k1 = 1;
    System.out.println(findMaxAverage(nums1, k1));
  }

  public static double findMaxAverage(int[] nums, int k) {
    // calculate the sum of initial window
    int sum = 0;
    for (int i = 0; i < k; i++)
      sum += nums[i];
    // assign it to maxSum
    int maxSum = sum;
    // loop and calculate maxSum
    // sum can be also obtained by decrementing the start of previous window and
    // incrementing the end of current window.
    for (int i = k; i < nums.length; i++) {
      sum += nums[i] - nums[i - k];
      maxSum = Math.max(sum, maxSum);
    }
    // return the output
    return (double) maxSum / (double) k;
  }
}
