import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = { 3, 2, 4 };
    int target = 6;
    // for (int val : twoSum(nums, target)) {
    // System.out.println(val);
    // }
    // TwoPointerApproach(nums, target);
    // int[] myans = inputtwoSum(nums, target);
    // for (int val : myans) {
    // System.out.println(val);
    // }
    int[] ans = twoSumUsingMap(nums, target);
    for (int val : ans) {
      System.out.println(val);
    }
  }

  public static int[] inputtwoSum(int[] numbers, int target) {
    int[] arr = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (i != j && i > j) {
          if (numbers[i] + numbers[j] == target) {
            arr[0] = i + 1;
            arr[1] = j + 1;
          }
        }
      }
    }
    return arr;
  }

  // Below method Time Complexity O(n^2)
  public static int[] twoSum(int[] nums, int target) {
    int[] arr = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        if (i != j) {
          if (nums[i] + nums[j] == target) {
            arr[0] = j;
            arr[1] = i;
          }
        }
      }

    }
    return arr;
  }

  public static void TwoPointerApproach(int[] nums, int target) {
    int start = 0;
    int sum = 0;
    int[] arr = new int[2];
    for (int i = 1; i < nums.length; i++) {
      sum = start + nums[i];
      if (sum == target) {
        arr[1] = i;
      }
      start++;
    }
  }

  public static int[] twoSumUsingMap(int[] nums, int target) {
    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
    int[] ans = new int[2];
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      if (myMap.containsKey(target - nums[i])) {
        ans[1] = i;
        ans[0] = myMap.get(target - nums[i]);
        return ans;
      }
      myMap.put(nums[i], i);

    }
    return ans;
  }
}
