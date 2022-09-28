public class SumInteger {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 2, 7, 9 };
    System.out.println(ArrayIntSum(arr, arr.length));
    IndexKeyArray(arr, arr.length - 1);
    NumberofElements(arr, 2, arr.length);
  }

  private static long ArrayIntSum(int[] arr, int n) {
    long Sum = 0;
    for (int i = 0; i < n; i++) {
      Sum += arr[i];
    }
    return Sum;
  }

  private static void IndexKeyArray(int[] arr, int k) {
    System.out.println(arr[k]);
  }

  private static void NumberofElements(int[] arr, int k, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] <= k) {
        count++;
      }
    }
    System.out.println(count);
  }
}
