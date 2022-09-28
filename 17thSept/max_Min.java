public class max_Min {
  public static void main(String[] args) {
    int[] arr = { -10, 10, 20 };
    MaxMinArray(arr, arr.length);
  }

  static void MaxMinArray(int[] arr, int n) {
    int min_e = arr[0];
    int max_e = arr[0];
    int i = 1;
    for (i = 1; i < n; i++) {
      if (arr[i] <= min_e) {
        min_e = arr[i];
      }
      if (arr[i] >= max_e) {
        max_e = arr[i];
      }
    }
    System.out.println("Max: " + max_e + " Min:" + min_e);
  }
}
