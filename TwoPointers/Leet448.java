package TwoPointers;

import java.util.*;

public class Leet448 {
  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    List<Integer> result = new ArrayList<>();
    result = findDisappearedNumbers(nums);
    for (Integer lst : result) {
      System.out.print(lst.intValue() + " ");
    }

  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    List<Integer> missing = new ArrayList<>();
    for (int num : nums) {
      seen.add(num);
    }
    for (int i = 1; i <= nums.length; i++) {
      if (!seen.contains(i)) {
        missing.add(i);
      }
    }
    return missing;
  }
}
