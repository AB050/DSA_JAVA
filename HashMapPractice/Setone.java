package HashMapPractice;

import java.util.*;

import java.util.HashMap;

public class Setone {
  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] nums = { 1, 2, 3, 1, 4, 5, 1 };
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (Integer val : map.keySet()) {
      System.out.print(map.get(val) + " ");
    }
  }
}
