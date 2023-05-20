package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArray {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 2, 1 }; // O/p --- {2}
    int[] nums2 = { 2, 2 };
    IntersectionTwoArray itsArray = new IntersectionTwoArray();
    itsArray.intersection(nums1, nums2);
  }

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<Integer>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0, j = 0;
    int m = nums1.length;
    int n = nums2.length;
    // Two Pointers ----> Find Common Values: O(M+N)
    while (i < m && j < n) { // Runs for min(m,n)
      if (nums1[i] < nums2[j])
        i++;
      else if (nums1[i] > nums2[j])
        j++;
      else {
        set.add(nums1[i]);
        i++;
        j++;
      }
    }

    int[] res = new int[set.size()];
    i = 0;

    for (Integer num : set)
      res[i++] = num;

    return res;
  }
}
