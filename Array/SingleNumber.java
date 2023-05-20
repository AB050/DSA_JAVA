package Array;

public class SingleNumber {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 1 };
    System.out.println(xorSingle(nums));
  }

  // Using XOR -- Expected Answer
  public static int xorSingle(int[] nums) {
    int n = nums.length;
    int ans = nums[0];
    for (int i = 1; i < n; i++) {
      ans ^= nums[i];
    }
    return ans;
  }
  // TC:O(N)
  // SC: O(1)
}
