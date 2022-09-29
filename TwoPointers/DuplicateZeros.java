package TwoPointers;

public class DuplicateZeros {
  public static void main(String[] args) {
    int[] array = { 1, 0, 2, 3, 0, 4, 5, 0 };
    duplicateZeros(array);
  }

  static void duplicateZeros(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        for (int j = arr.length - 1; j > i; j--) {
          arr[j] = arr[j - 1];
        }
        i = i + 1;
      }
    }
  }
}
