import java.util.Arrays;

public class MajorityElement {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 3 }; // O/p = 3
    int ans = majorityElement(arr);
    System.out.println(ans);
    System.out.println(majorityElementBruteForce(arr));
    System.out.println(sort_Checking(arr));
  }

  // Iterate over Value
  public static int majorityElement(int[] nums) {
    int majorityCount = nums.length / 2;
    for (int num : nums) {
      int count = 0;
      for (int elem : nums) {
        if (elem == num) {
          count += 1;
        }
      }
      if (count > majorityCount) {
        return num;
      }

    }
    return -1;
  }

  static int majorityElementBruteForce(int[] nums) {
    int majorityCount = nums.length / 2;
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          ++count;
          ans = nums[i];
        }
      }
      if (count > majorityCount) {
        return ans;
      }
    }
    return -1;
  }

  // Sort and Check the value
  static int sort_Checking(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}
