package TwoPointers;

import java.util.Arrays;

public class WiggleSort {
  public static void main(String[] args) {
    int[] nums = { 3, 5, 2, 1, 6, 4 }; // One possible ouput :{ 1, 6, 2, 5, 3, 4}
    BruteForceWiggleSort(nums);
    OptimisedWiggleSort(nums);
  }

  static void BruteForceWiggleSort(int[] nums) {

    int n = nums.length;

    if (n < 2)
      return;
    Arrays.sort(nums);
    int i = 1; // Odd Index Swapping

    for (i = 1; i < n - 1; i += 2) {
      // Swap the values: Odd Index should be higher: Swapping
      int temp = nums[i];
      nums[i] = nums[i + 1];
      nums[i + 1] = temp;
    }
    for (int value : nums) {
      System.out.print(value + " ");
    }
  }

  static void OptimisedWiggleSort(int[] nums) {
    if (nums.length < 2)
      return;

    for (int i = 0; i < nums.length - 1; i++) {
      // If Index is Even
      if (i % 2 == 0) {
        if (nums[i] > nums[i + 1]) // Even Index Val > Odd Index Value
        {
          swap(nums, i, i + 1);
        }
      }

      else // // If Index is Odd
      {
        if (nums[i] < nums[i + 1]) // Odd Index Val < Even Index Val
        {
          swap(nums, i, i + 1);
        }
      }

    }
    for (int value : nums) {
      System.out.print(value + " ");
    }

  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}
