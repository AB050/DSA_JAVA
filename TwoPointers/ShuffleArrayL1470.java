package TwoPointers;

public class ShuffleArrayL1470 {
  public static void main(String[] args) {
    int[] nums = { 2, 5, 1, 3, 4, 7 };
    int n = 3;
    int[] array = new int[nums.length];
    array = shuffle(nums, n);
    for (int a : array) {
      System.out.print(a + " ");
    }

  }

  public static int[] shuffle(int[] nums, int n) {
    int length = nums.length;
    int[] Array = new int[length];
    for (int i = 0; i < length; i++) {
      if (i % 2 == 0) {
        Array[i] = nums[i / 2];
      } else {
        Array[i] = nums[n + i / 2];

      }
    }
    return Array;
  }
}
