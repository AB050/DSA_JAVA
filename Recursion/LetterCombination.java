package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
  public static void main(String[] args) {
    List<String> ans = letterCombinations("23");
    System.out.println(ans);
  }

  public static List<String> letterCombinations(String digits) {
    List<String> ans = new ArrayList<>();
    if (digits.length() == 0) {
      return ans;
    }
    String output = "";
    int index = 0;
    String[] mapping = { " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    solve(digits, output, index, ans, mapping);
    return ans;
  }

  private static void solve(String digit, String output, int index, List<String> ans, String[] mapping) {
    // Base Case
    if (index >= digit.length()) {
      ans.add(output);
      return;
    }
    int number = digit.charAt(index) - '0';
    String value = mapping[number];
    for (int i = 0; i < value.length(); i++) {
      output += value.charAt(i);
      solve(digit, output, index + 1, ans, mapping);
      // Backtracking
      output = output.substring(0, output.length() - 1);
    }
  }
}
