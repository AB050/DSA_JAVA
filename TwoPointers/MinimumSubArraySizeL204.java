package TwoPointers;

public class MinimumSubArraySizeL204 {
  public static void main(String[] args) {
    int target = 7;
    int[] nums = { 2, 3, 1, 2, 4, 3 };
    System.out.println(minSubArrayLen(target, nums));

  }

  public static int minSubArrayLen(int target, int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int left = 0, right = 0;
    int minLen = Integer.MAX_VALUE;
    int curSum = 0;
    while (right < nums.length) {
      curSum += nums[right];
      while (curSum >= target) {
        minLen = Math.min(minLen, right - left + 1);
        curSum -= nums[left];
        left++;
      }
      right++;
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
  }
}
