public class ReverseAnArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    // 1st way Create Extra Array & move from Right to left
    int b[] = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      b[n - i - 1] = arr[i];
    }
    // printing the reversed array
    System.out.println("Reversed array is:");
    for (int k = 0; k < n; k++) {
      System.out.println(b[k]);
    }

    reverse(arr, n);
    reverse2Pointer(arr, n);

  }

  // 2nd way two pointer & swap
  static void reverse(int arr[], int n) {
    int start = 0;
    int end = n - 1;
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
    // printing the reversed array
    System.out.println("Reversed array is:");
    for (int k = 0; k < n; k++) {
      System.out.println(arr[k]);
    }
  }

  // 3rd way -- Two Pointer & Swap --Variation
  static void reverse2Pointer(int arr[], int n) {
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }

    // printing the reversed array
    System.out.println("Reversed array is:");
    for (int k = 0; k < n; k++) {
      System.out.println(arr[k]);
    }
  }
}
