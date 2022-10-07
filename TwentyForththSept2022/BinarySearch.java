package TwentyForththSept2022;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 10 };
    int key = 10;
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

  public static int[] twoSum(int[] numbers, int target) {
    int end = numbers.length - 1;
    int[] ans = new int[2];
    int n = numbers.length;
    int strat = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (numbers[i] + numbers[j] == target) {
          break;

        } else if (numbers[i] + numbers[j] > target) {
          end--;
        } else {
          start++;

        }
      }
      ans[0] = start + 1;
      ans[1] = end - 1;
      return ans;
    }
  }

}
