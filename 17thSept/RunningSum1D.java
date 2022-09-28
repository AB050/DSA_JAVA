public class RunningSum1D {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 }; // O/p - [1,3,6,10]
    int[] output = SumRunningArray(arr, arr.length);
    for (int value : output) {
      System.out.println(value);
      int[] arr1 = { 1, 1, 1, 1 }; // O/p - [1,2,3,4]
      int[] output1 = SumRunningArray(arr1, arr1.length);
      for (int value1 : output1) {
        System.out.println(value1);
      }
      int[] arr2 = { 3, 1, 2, 10, 1 }; // O/p- [3,4,6,16,17]
      int[] output2 = SumRunningArray(arr2, arr2.length);
      for (int value2 : output2) {
        System.out.println(value2);
      }
    }
  }

  private static int[] SumRunningArray(int[] arr, int n) {
    int[] ans = new int[n];
    ans[0] = arr[0];
    for (int i = 1; i < n; i++) {
      ans[i] = ans[i - 1] + arr[i];
    }
    return ans;
  }
}
