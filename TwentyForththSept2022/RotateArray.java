package TwentyForththSept2022;

public class RotateArray {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    RotateArray ArrayRotation = new RotateArray();
    ArrayRotation.rotate(nums, k); // O/p Array --{7,6,5,1,2,3,4}
  }

  public void rotate(int[] nums, int k) {
    k %= nums.length;
    // Reverse whole Array first
    reverse(nums, 0, nums.length - 1); // {7,6,5,4,3,2,1}
    // Now Reverse First Part of Array from 0 till K
    reverse(nums, 0, k - 1); // {5,6,7,4,3,2,1}
    // Now Reverse second part of Array starting from index k to n
    reverse(nums, k, nums.length - 1); // {5,6,7,1,2,3,4}
  }

  public void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
