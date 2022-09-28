public class LeaderArray {
  public static void main(String[] args) {
    int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
    int n = arr.length;
    LeaderInArrays(arr, n);
    Leader(arr, n);
  }

  // Brute Force Approach
  // Using two for loop
  public static void LeaderInArrays(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      int j;
      for (j = i + 1; j < n; j++) { // value on Right
        // There is value greater than arr[i] , Not a Leader
        if (arr[i] < arr[j]) {
          break;
        }
      }
      if (j == n) { // Yes it's a leader
        System.out.println(arr[i]);
      }
    }
  }

  // optimal Solution

  static void Leader(int[] arr, int n) {
    int max = arr[n - 1];
    System.out.println(max);// Always a leader
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > max) {
        max = arr[i]; // update the max
        System.out.println(arr[i]); // Leader
      }
    }
  }

}
