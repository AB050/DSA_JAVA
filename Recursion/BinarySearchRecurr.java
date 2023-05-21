package Recursion;

public class BinarySearchRecurr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int start = 0;
    int end = arr.length - 1;
    int key = 3;
    System.out.println(binary(arr, start, end, key));
  }

  public static boolean binary(int[] arr, int start, int end, int key) {
    // Base Case
    if (start > end)
      return false;
    int mid = start + (end - start) / 2;
    // Base Case
    if (arr[mid] == key)
      return true;
    else if (arr[mid] < key)
      return binary(arr, mid + 1, end, key);
    else
      return binary(arr, start, mid - 1, key);
  }
}
