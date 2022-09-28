import java.util.*;

public class fizzBuzz {
  public static void main(String[] args) {
    int n = 15;
    String[] res = new String[n + 1];
    for (int i = 1; i <= n; i++) {
      res[i] = String.valueOf(i);
    }
    for (int i = 3; i <= n; i += 3) {
      res[i] = "Fizz";
    }
    for (int i = 5; i <= n; i += 5) {
      res[i] = "Buzz";
    }
    for (int i = 15; i <= n; i += 15) {
      res[i] = "FizzBuzz";
    }
    for (int i = 1; i < res.length; i++) {
      System.out.println(res[i]);
    }
    System.out.println(FizzBuzz(n));
  }

  public static List<String> FizzBuzz(int n) {
    List<String> list = new ArrayList<String>();
    String current = "";
    for (int i = 1; i <= n; i++) {
      if (i % 5 == 0 && i % 3 == 0) {
        current = "FizzBuzz";
      } else if (i % 5 == 0) {
        current = "Buzz";
      } else if (i % 3 == 0) {
        current = "Fizz";
      } else {
        current = String.valueOf(i);
      }
      list.add(current);
    }
    return list;
  }

}
