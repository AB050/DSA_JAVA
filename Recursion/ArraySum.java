package Recursion;

public class ArraySum {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(Arraysum(arr, arr.length));
  }

  public static int Arraysum(int[] arr, int size) {
    // Base Case
    if (size == 0)
      return 0;
    if (size == 1)
      return arr[0];
    // Processing
    int remnainingPart = Arraysum(arr, size - 1);
    int sum = arr[size - 1] + remnainingPart;
    return sum;
  }
}
