public class printArray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    int n = array.length;
    ArrayPrint(array, n);
  }

  public static void ArrayPrint(int[] arr, int n) {
    // 1st Method
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println(" ");

    // 2nd method
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }
}
