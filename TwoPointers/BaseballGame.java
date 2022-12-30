package TwoPointers;

import java.util.Stack;

public class BaseballGame {
  public static void main(String[] args) {
    String[] opearations = { "5", "2", "C", "D", "+" };
    System.out.println(calPoints(opearations));
  }

  public static int calPoints(String[] ops) {
    // Use a stack to store the scores of the previous rounds
    Stack<Integer> stack = new Stack<>();
    // Iterate through the array of strings
    for (String op : ops) {
      // If the string is an integer, simply push it onto the stack
      if (Character.isDigit(op.charAt(0)) || op.charAt(0) == '-') {
        stack.push(Integer.parseInt(op));
      }
      // If the string is a "+" operation, pop the last two elements from the stack,
      // add them together, and push the result back onto the stack
      else if (op.equals("+")) {
        int last = stack.pop();
        int secondLast = stack.pop();
        stack.push(secondLast);
        stack.push(last);
        stack.push(last + secondLast);
      }
      // If the string is a "D" operation, pop the last element from the stack, double
      // it, and push the result back onto the stack
      else if (op.equals("D")) {
        stack.push(stack.peek() * 2);
      }
      // If the string is a "C" operation, simply pop the last element from the stack
      else if (op.equals("C")) {
        stack.pop();
      }
    }

    // Add up all the elements in the stack to get the final result
    int result = 0;
    for (int score : stack) {
      result += score;
    }
    return result;
  }
}
