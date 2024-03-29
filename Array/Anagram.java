package Array;

public class Anagram {
  public static void main(String[] args) {
    String s = "rat";
    String t = "car";
    System.out.println(isAnagram(s, t));

  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    if (s == t) {
      return true;
    }
    int[] freq = new int[26];
    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'a']++;
      freq[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
      if (freq[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
