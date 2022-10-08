package TwentyForththSept2022;

public class KadaneAlgo {
  public static void main(String[] args) {
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    KadaneAlgo MaxSubArray = new KadaneAlgo();
    System.out.println(MaxSubArray.maxSubArray(nums));
  }

  public int maxSubArray(int[] nums) {
    int n = nums.length;
    // int maxSum = 0; when empty subArray is allowed
    int maxSum = Integer.MIN_VALUE; // maxSum =0 when empty SubArray is not allowed
    int curSum = 0;
    for (int i = 0; i < n; i++) {
      curSum += nums[i];
      maxSum = Math.max(curSum, maxSum);
      if (curSum < 0) {
        curSum = 0;
      }
    }
    return maxSum;
  }
}
