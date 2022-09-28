public class Max2Elem {
  public static void main(String[] args) {
    int arr1[] = { -2, 1, 10, 15 };
    int n1 = arr1.length;
    Find2maxElement(arr1, n1);
    int arr2[] = { -2, 1, 10, 15, 15 };
    int n2 = arr2.length;
    Find2maxElement(arr2, n2);
    int arr3[] = { 2, 13, 15, 17, 19, 9, 5, 8, 16, 18, 19 };
    int n3 = arr3.length;
    Find2maxElement(arr3, n3);
    int arr4[] = { 4, 1 };
    int n4 = arr4.length;
    Find2maxElement(arr4, n4);
    int arr5[] = { 1, 1 };
    int n5 = arr5.length;
    Find2maxElement(arr5, n5);

  }

  static void Find2maxElement(int[] arr, int n) {
    int first = Integer.MIN_VALUE; // lowest integer value
    int second = Integer.MIN_VALUE; // Maximum integer Value
    int i = 0;
    if (n < 2) {
      System.out.println("Invalid Inuput");
    }
    for (i = 0; i < n; i++) {
      if (arr[i] > first) {
        second = first;
        first = arr[i];
      } else if (arr[i] > second) {
        second = arr[i];
      }
    }
    System.out.println("First Max:" + first + " Second Max : " + second);
  }
}
