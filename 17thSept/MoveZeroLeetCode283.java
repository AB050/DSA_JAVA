/*Date : 13rd September 2022
Approach : Two Pointers & Swap  */
public class MoveZeroLeetCode283 {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 3, 12 }; // O/P --- {1,3,12,0,0}
    int n = nums.length;
    moveZeros(nums, n);
    for (int k = 0; k < n; k++) {
      System.out.println(nums[k]);
    }
  }

  private static void moveZeros(int[] nums, int n) {

    if (n == 0 || n == 1)
      return;
    int left = 0, right = 0;
    int temp;
    // Swap
    while (right < n) {
      if (nums[right] == 0)
        right++; // do nothing increment right pointer
      else {
        temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right++;
      }
    }
  }
}
