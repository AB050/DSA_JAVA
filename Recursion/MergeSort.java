package Recursion;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 3, 2, 4 };
    mergeSort(arr, 0, arr.length - 1);
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }

  public static void mergeSort(int[] arr, int start, int end) {
    if (start < end) {
      int mid = start + (end - start) / 2;
      // Left Part Sort karna hai
      mergeSort(arr, start, mid);
      // Right Part Sort karna hai
      mergeSort(arr, mid + 1, end);
      // merge
      merge(arr, start, mid, end);
    }
  }

  public static void merge(int[] arr, int start, int mid, int end) {
    int len1 = mid - start + 1;
    int len2 = end - mid;

    int[] leftArray = new int[len1];
    int[] rightArray = new int[len2];

    for (int i = 0; i < len1; i++) {
      leftArray[i] = arr[start + i];
    }

    for (int i = 0; i < len2; i++) {
      rightArray[i] = arr[mid + 1 + i];
    }

    int i = 0, j = 0, k = start;

    while (i < len1 && j < len2) {
      if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        j++;
      }
      k++;
    }

    while (i < len1) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < len2) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }
}
