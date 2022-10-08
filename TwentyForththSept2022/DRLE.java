package TwentyForththSept2022;

import java.util.Arrays;

public class DRLE {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int n = nums.length;
    int freq = 0;
    for (int i = 0; i < n; i += 2) {
      freq += nums[i];
    }
    int[] result = new int[freq];
    DRLE drle = new DRLE();
    result = drle.decompressRLElist(nums);
    for (int value : result) {
      System.out.print(value + " ");
    }
  }

  public int[] decompressRLElist(int[] nums) {
    int freq = 0;
    for (int i = 0; i < nums.length; i += 2) {
      freq += nums[i];
    }
    int[] result = new int[freq];
    int startIdx = 0;
    for (int i = 0; i < nums.length; i += 2) {
      Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
      startIdx += nums[i];
    }
    return result;
  }
}