public class JewelsStones {
  public static void main(String[] args) {
    String stones = "bbb";
    String jewels = "ebd";
    int n1 = stones.length();
    int n2 = jewels.length();
    System.out.println(n1 + " " + n2);
    int count = 0;
    for (int i = 0; i < stones.length(); i++) {
      for (int j = 0; j < jewels.length(); j++) {
        if (stones.charAt(i) == (jewels.charAt(j))) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
