import java.util.Arrays;

public class MajorityElement {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 3 }; // O/p = 3
    int ans = majorityElement(arr);
    System.out.println(ans);
    System.out.println(majorityElementBruteForce(arr));
    System.out.println(sort_Checking(arr));
    System.out.println(majorityElementBMorre(arr));
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

  // Boyer - Moore Algorithm
  static int majorityElementBMorre(int[] nums) {
    int major = nums[0], count = 1;
    int i = 1;
    int n = nums.length;

    for (i = 1; i < n; i++) {
      // New Element -> Increase frequency from 0 -> 1
      if (count == 0) {
        ++count;
        major = nums[i];
      }

      // Same Element -> Increase Frequency By 1
      else if (nums[i] == major)
        ++count;

      // Different Element -> Decrease Frequency By 1
      else
        --count;
    }

    return major;
  }
}
