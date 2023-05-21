package Recursion;

public class IsArraySorted {
  public static void main(String[] args) {
    int[] arr = { 1, 9, 3 };
    int size = arr.length;
    System.out.println(isSorted(arr, size));
  }

  public static boolean isSorted(int[] arr, int size) {
    // Base Case
    if (size <= 1)
      return true;
    if (arr[0] > arr[1]) // If the first element is greater than the next element, array is not
                         // sorted
                         // we can check for last and second last element as well
      /* arr[size-1]<arr[size-2] */
      return false;
    else
      return isSorted(arr, size - 1);
  }
}
