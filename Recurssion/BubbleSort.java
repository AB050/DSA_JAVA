package Recurssion;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    int[] ans = Bubble(arr, arr.length);
    for (int val : ans) {
      System.out.print(val);
    }
  }

  public static int[] Bubble(int[] arr, int n) {
    // Base Case
    if (n == 0 || n == 1)
      return arr;
    // Ek Case khud kar do banki recurssion sambhal lega
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    // Recurssive Call
    return Bubble(arr, n - 1);
  }
}
