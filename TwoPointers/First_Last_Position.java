package TwoPointers;

public class First_Last_Position {
  public static void main(String[] args) {
    int nums[] = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    System.out.println(result[0] + " " + result[1]);
  }

  private static int findFirst(int[] nums, int target) {
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = start + (start - end) / 2;
      if (nums[mid] >= target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      if (nums[mid] == target)
        idx = mid;
    }
    return idx;
  }

  private static int findLast(int[] nums, int target) {
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = start + (start - end) / 2;
      if (nums[mid] <= target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
      if (nums[mid] == target)
        idx = mid;
    }
    return idx;
  }
}
