package Recursion;

import java.util.*;

public class SubSet {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> output = new ArrayList<>();
    int index = 0;
    solve(nums, ans, output, index);
    for (List<Integer> val : ans) {
      System.out.println(val);
    }
  }

  private static void solve(int[] nums, List<List<Integer>> ans, List<Integer> output, int index) {
    // Base Case
    if (index >= nums.length) {
      ans.add(new ArrayList<>(output));
      return;
    }
    output.add(nums[index]);
    // Include Case
    solve(nums, ans, output, index + 1);
    // BackTrackking
    output.remove(output.size() - 1);
    // Exclude
    solve(nums, ans, output, index + 1);
  }
}
