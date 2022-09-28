public class MajorityElement {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 3 }; // O/p = 3
    int ans = majorityElement(arr);
    System.out.println(ans);
  }

  public static int majorityElement(int[] nums) {
    int majorityCount = nums.length / 2;
    for (int num : nums) {
      int count = 0;
      for (int elem : nums) {
        if (elem == num) {
          count += 1;
        }
      }
      if (count > majorityCount) {
        return num;
      }

    }
    return -1;
  }
}
