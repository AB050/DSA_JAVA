package Array;

public class KadaneAlgo {
  public static void main(String[] args) {
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    KadaneAlgo MaxSubArray = new KadaneAlgo();
    System.out.println(MaxSubArray.maxSubArray(nums));
    System.out.println(BFApproach(nums));
  }

  public static int BFApproach(int[] nums) {
    int n = nums.length;
    int maxSum = nums[0];
    for (int i = 0; i < n; i++) {
      int currSum = 0;
      for (int j = i; j < n; j++) {
        currSum += nums[j];
        maxSum = Math.max(currSum, maxSum);
      }
    }
    return maxSum;
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
