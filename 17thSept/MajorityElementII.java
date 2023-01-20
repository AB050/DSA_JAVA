import java.util.*;
public class MajorityElementII {
  public static void main(String[] args) {
    int []  nums = {3,2,3};
    List<Integer> lst = new ArrayList<>();
    lst = majorityElement(nums);
    System.out.println(lst);
  }

  public static List<Integer> majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> res = new ArrayList<>();
    int n = nums.length;
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int key : map.keySet()) {
        if (map.get(key) > n / 3) {
            res.add(key);
        }
    }
    return res;
}
}
