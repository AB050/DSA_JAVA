public class MoveNegative {
  public static void main(String[] args) {
    int[] arr = { 1, -2, 3, -4, 5 };
    int[] ans = move(arr);
    for (int val : ans) {
      System.out.print(val + " ");
    }
  }

  public static int[] move(int[] arr) {
    int n = arr.length;
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] < 0)
        continue;
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j++;
    }
    return arr;
  }
}
