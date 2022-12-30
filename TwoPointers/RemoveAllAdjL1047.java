package TwoPointers;

import java.util.*;

public class RemoveAllAdjL1047 {
  public static void main(String[] args) {
    String s = "abbaca";
    System.out.println(removeDuplicates(s));
  }

  public static String removeDuplicates(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (!stack.isEmpty() && stack.peek() == c) {
        stack.pop();
      } else {
        stack.push(c);
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.reverse().toString();
  }

}
