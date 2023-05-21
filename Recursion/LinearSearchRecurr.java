package Recursion;

public class LinearSearchRecurr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    int key = 3;
    int size = arr.length;
    System.out.println(search(arr, size, key));

  }

  public static boolean search(int[] arr, int size, int key) {
    // Base Case
    if (arr[size - 1] == key)
      return true;
    if (size == 0)
      return false;
    // Recurrance Relation
    return search(arr, size - 1, key);
  }
}
