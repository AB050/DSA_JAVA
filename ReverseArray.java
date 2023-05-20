public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] ans = reverse(arr);
    for (int val : ans) {
      System.out.print(val);
    }

  }

  public static int[] reverse(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }
}
