import java.util.Arrays;

public class MaxInarray {
  public static void main(String[] args) {
    int[] array = { 10, 12, 13, 15, 17 };
    int n = array.length;
    MaxNumberArray(array, n);
    ReverseArray(array, n);
  }

  private static void MaxNumberArray(int[] array, int n) {
    int max = array[0];
    for (int i = 0; i < n; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    System.out.println("Max in an Array : " + max);
    Arrays.sort(array);
    System.out.println(array[array.length - 1]);
    System.out.println(array[0]);
  }

  private static void ReverseArray(int[] array, int n) {
    for (int i = n - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }
  }
}
