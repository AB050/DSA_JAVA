public class TwoSum {
  public static void main(String[] args) {
    int[] nums = { 5, 25, 75 };
    int target = 100;
    for (int val : twoSum(nums, target)) {
      System.out.println(val);
    }
    TwoPointerApproach(nums, target);
    int[] myans = inputtwoSum(nums, target);
    for (int val : myans) {
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

}
