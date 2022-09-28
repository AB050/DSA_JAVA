public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int key = 1;
    System.out.println(SearchBinary(arr, key));
  }

  public static int SearchBinary(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;
    int mid;
    while (low <= high) {
      mid = low + (high - low) / 2; // Optimisation
      if (key == arr[mid]) {
        return mid;
      } else if (key > arr[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

}
