package TwoPointers;

import java.util.HashSet;

public class subArraywithZeroSum {
  public static void main(String[] args) {
    int[] nums = { 4, 2, -3, 1 }; // OP -true , SubArray :[2 -3 1] Sum =0
    int n = nums.length;
    System.out.println(ZeroSumSubArray(nums, n));
    System.out.println(SumofSubArray(nums));

  }

  // prefix Sum and SubArrays concept
  static boolean ZeroSumSubArray(int[] nums, int n) {
    HashSet<Integer> set = new HashSet<Integer>();
    int prefixSum = 0;
    for (int i = 0; i < n; i++) {
      prefixSum += nums[i];
      if (prefixSum == 0 || set.contains(prefixSum)) {
        return true;
      }
      set.add(prefixSum);
    }
    return false;
  }

  // Brute Force Approach
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
