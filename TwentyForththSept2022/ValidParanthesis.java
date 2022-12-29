package TwentyForththSept2022;

import java.util.Stack;

// LeetCode -20 
// TC : O(N)
// SC : O(N)
public class ValidParanthesis {
  public static void main(String[] args) {
    String s = "()[]{}";
    System.out.println(isValid(s));

  }

  public static boolean isValid(String s) {
    if (s == "") {
      return false;
    }
    int n = s.length();
    // Odd length Return False;
    if (n % 2 != 0) {
      return false;
    }
    if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') {
      return false;
    }
    Stack<Character> st = new Stack<Character>();
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);

      // Opening Brackets - Inserted into Stack
      if (c == '[' || c == '{' || c == '(') {
        st.push(c);
        continue;
      }

      // No Opening Brackets - return false
      if (st.isEmpty())
        return false;

      char check;
      switch (c) {
        case ')':
          check = st.peek();
          if (check == '{' || check == '[')
            return false;
          st.pop();
          break;

        case '}':
          check = st.peek();
          if (check == '(' || check == '[')
            return false;
          st.pop();
          break;

        case ']':
          check = st.peek();
          if (check == '{' || check == '(')
            return false;
          st.pop();
          break;
      }
    }
    return st.isEmpty();
  }
}
