package Array;

public class IsoMorphicL205 {
  public static void main(String[] args) {
    String s = "bbbaaaba";
    String t = "aaabbbba";
    System.out.println(isIsomorphic(s, t));
  }

  public static boolean isIsomorphic(String s, String t) {
    int n = s.length();
    int m = t.length();
    if (n != m) {
      return false;
    }
    // Use two arrays to store the mapping between characters in s and t
    int[] map1 = new int[256];
    int[] map2 = new int[256];
    // Iterate through the characters in s
    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);
      // Check if the mapping between the characters is correct
      if (map1[c1] != map2[c2]) {
        return false;
      }
      // Update the mapping in the arrays
      map1[c1] = i + 1;
      map2[c2] = i + 1;
    }
    // Return true if all the mappings are correct
    return true;
  }
}
