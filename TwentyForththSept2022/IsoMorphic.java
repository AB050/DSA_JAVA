package TwentyForththSept2022;

public class IsoMorphic {
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
    int[] countChars1 = new int[256];
    int[] countChars2 = new int[256];
    for (int i = 0; i < n; i++) {
      countChars1[s.charAt(i)]++;
      countChars2[t.charAt(i)]++;
    }
    for (int i = 0; i < n; i++) {
      if (countChars1[s.charAt(i)] != countChars2[t.charAt(i)]) {
        return false;
      }

    }
    return true;
  }

}
