public class SumOfelementArray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    int n = array.length;
    System.out.print(ArrayElementSum(array, n));
  }

  private static long ArrayElementSum(int[] array, int n) {
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += array[i];
    }
    return sum;

  }
}
