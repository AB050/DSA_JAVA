package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class KidsExtraCandies {
  public static void main(String[] args) {
    int[] candies = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;
    System.out.println(KidsWithExtraCandies(candies, extraCandies));
  }

  static List<Boolean> KidsWithExtraCandies(int[] candies, int extraCandies) {
    List<Boolean> check = new ArrayList<Boolean>();
    int max = 0;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] >= max) {
        max = candies[i];
      }
    }
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] + extraCandies >= max) {
        check.add(true);
      } else {
        check.add(false);
      }
    }
    return check;
  }
}
