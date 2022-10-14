package TwentyForththSept2022;

public class SingleNumber {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 1 };
    System.out.println(singleNumber(nums));

  }

  public static int singleNumber(int[] nums) {
    int n = nums.length;
    int number = 0;
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = i + 1; j < n; j++) {
        if (nums[i] != nums[j]) {
          count++;
        }
        if (count == 0) {
          number = nums[i];
        }
      }
    }
    return number;
  }
}
