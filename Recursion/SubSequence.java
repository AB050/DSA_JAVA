package Recursion;

import java.util.*;

public class SubSequence {
  public static void main(String[] args) {
    String str = "abc";
    List<List<Character>> ans = new ArrayList<>();
    List<Character> output = new ArrayList<>();
    int index = 0;
    solve(str, ans, output, index);
    for (List<Character> val : ans) {
      System.out.println(val);
    }
  }

  private static void solve(String str, List<List<Character>> ans, List<Character> output, int index) {
    if (index >= str.length()) {
      ans.add(new ArrayList<>(output));
      return;
    }
    // Exclude
    solve(str, ans, output, index + 1);
    // Include
    output.add(str.charAt(index));
    solve(str, ans, output, index + 1);
    // Backtracking
    output.remove(output.size() - 1);
  }
}
