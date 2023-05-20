public class kadanes {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, -2, 5 };
    System.out.println(kadanesAlgo(arr, arr.length));
  }

  public static int kadanesAlgo(int[] arr, int n) {
    int prefixSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      prefixSum += arr[i];
      maxSum = Math.max(prefixSum, maxSum);
      if (prefixSum < 0) {
        prefixSum = 0;
      }
    }
    return maxSum;
  }

}