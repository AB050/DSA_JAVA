public class PivotIndex {
  public static void main(String[] args) {
    int[] nums = { 1, 7, 3, 6, 5, 6 };
    System.out.println(pivotIndex(nums));
    int[] arr = { 1, 2, 3 };
    System.out.println(pivotIndex(arr));
    int[] ans = { 2, 1, -1 };
    System.out.println(pivotIndex(ans));
  }

  public static int pivotIndex(int[] nums) {
    int sum = 0; // for sum of all the numbers
    for (int i = 0; i < nums.length; i++) { // nums = [1,7,3,6,5,6]
      sum += nums[i]; // sum = 28 ( Because sum = 1 + 7 + 3 + 6 + 5 + 6 = 28)
    }
    int leftsum = 0; // leftsum = 0
    int rightsum = sum; // rightsum = sum || rightsum = 28

    for (int i = 0; i < nums.length; i++) {
      rightsum -= nums[i]; // rightsum = rightsum - nums[i]
      if (leftsum == rightsum) {
        return i; // 3
      }
      leftsum += nums[i];
    }
    return -1;
  }
}
