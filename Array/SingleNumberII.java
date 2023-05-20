package Array;

import java.util.*;

public class SingleNumberII {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 3, 2 };
    System.out.println(singleNumber(nums));
    int[] input = { 1, 2, 1, 3, 2, 5 };
    int[] result = SingleNumberIII(input);
    for (int val : result) {
      System.out.print(val + " ");
    }
  }

  public static int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else
        map.put(nums[i], 1);
    }
    for (int num : nums) {
      if (map.get(num) == 1) {
        return num;
      }
    }
    return -1;
  }

  public static int[] SingleNumberIII(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else
        map.put(nums[i], 1);
    }
    int[] result = new int[2];
    int index = 0;
    for (int num : map.keySet()) {
      if (map.get(num) == 1) {
        result[index] = num;
        index++;
      }
    }
    return result;
  }
}
