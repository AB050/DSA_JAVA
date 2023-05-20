public class Max_MinInArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    maxMin(arr);
  }

  public static void maxMin(int[] arr) {
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];
      }
      if (arr[i] < minValue) {
        minValue = arr[i];
      }
    }
    System.out.println(maxValue + " , " + minValue);

  }
}
