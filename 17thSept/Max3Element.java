public class Max3Element {
  public static void main(String[] args) {
    int arr1[] = { -2, 1, 10, 15 };
    int n1 = arr1.length;
    Find3MaxElement(arr1, n1);
    int arr2[] = { -2, 1, 10, 15, 15 };
    int n2 = arr2.length;
    Find3MaxElement(arr2, n2);
    int arr3[] = { 2, 13, 15, 17, 19, 9, 5, 8, 16, 18, 19 };
    int n3 = arr3.length;
    Find3MaxElement(arr3, n3);
    int arr4[] = { 4, 1, 4 };
    int n4 = arr4.length;
    Find3MaxElement(arr4, n4);
  }

  static void Find3MaxElement(int[] arr, int n) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    int i = 1;
    if (n < 3) {
      System.out.println("Invalid Inuput");
    }
    for (i = 0; i < n; i++) {
      if (arr[i] >= first) {
        third = second;
        second = first;
        first = arr[i];

      } else if (arr[i] >= second) {
        third = second;
        second = arr[i];

      } else {
        third = arr[i];
      }
    }
    System.out.println("First Max:" + first + " Second Max : " + second + " Third Max : " + third);
  }
}
