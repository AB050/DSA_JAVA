package TwoPointers;

import java.util.*;

public class MakeStringGreatL1544 {
  public static void main(String[] args) {
    String s = "abBAcC";
    System.out.println(makeGood(s));
  }

  public static String makeGood(String s) {
    Stack<Character> stack = new Stack<>();
    for (char t : s.toCharArray()) {
      if (!stack.isEmpty() && Math.abs(t - stack.peek()) == 'a' - 'A') {
        stack.pop();
      } else {
        stack.push(t);
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.reverse().toString();
  }
}