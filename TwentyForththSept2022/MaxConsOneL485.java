package TwentyForththSept2022;

public class MaxConsOneL485 {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 1, 1 };
    System.out.println(findMaxConsecutiveOnes(nums));
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int res = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
      }
      if (nums[i] == 0) {
        count = 0;
      }
      res = Math.max(res, count);
    }
    return res;
  }
}
