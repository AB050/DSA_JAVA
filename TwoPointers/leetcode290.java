package TwoPointers;

import java.util.*;

public class leetcode290 {
  public static void main(String[] args) {
    String pattern = "aaaa";
    String s = "dog cat cat dog";
    leetcode290 l = new leetcode290();
    System.out.println(l.wordPattern(pattern, s));
  }

  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (pattern.length() != words.length) {
      return false;
    }
    Map<Character, String> map = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);
      if (map.containsKey(c)) {
        if (!map.get(c).equals(words[i])) {
          return false;
        }
      } else {
        if (map.containsValue(words[i])) {
          return false;
        }
        map.put(c, words[i]);
      }
    }
    return true;
  }
}
