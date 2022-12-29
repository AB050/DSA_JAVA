package TwentyForththSept2022;

import java.util.Stack;

public class ReverseStack {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    reverseStack(nums);

  }

  public static void reverseStack(int[] nums) {
    Stack<Integer> st = new Stack<>();
    for (int i : nums) {
      st.push(i);
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.println(st.pop());
    }
  }
}
