package TwoPointers;

import java.util.Stack;

public class BackSpaceStringCompare {
  public static void main(String[] args) {
    String s = "ab##";
    String t = "ad#c";
    BackSpaceStringCompare bc = new BackSpaceStringCompare();
    System.out.println(bc.backspaceCompare(s, t));

  }

  public boolean backspaceCompare(String S, String T) {
    return compute(S).equals(compute(T));
  }

  private Stack<Character> compute(String S) {
    Stack<Character> stack = new Stack<>();
    for (char c : S.toCharArray()) {
      if (c != '#') {
        stack.push(c);
      } else if (!stack.isEmpty()) {
        stack.pop();
      }
    }
    return stack;
  }

}