package Array;

public class SortColor {
  public static void main(String[] args) {
    int[] nums = { 2, 0, 2, 1, 1, 0 };
    SortColor color = new SortColor();
    color.sortColors(nums);
    color.sortColorsDutchFlagAlgo(nums);
  }

  public void sortColors(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    int index = 0;
    while (index <= high) {
      if (nums[index] == 0) {
        nums[index] = nums[low];
        nums[low] = 0;
        low++;
      }
      if (nums[index] == 2) {
        nums[index] = nums[high];
        nums[high] = 2;
        high--;
        index--;
      }
      index++;
    }
  }

  // Using Dutch National Flag Algorithm (3 Way Partition)
  public void sortColorsDutchFlagAlgo(int[] nums) {
    int i = 0;
    int j = 0;
    int n = nums.length - 1;
    int p = 1;
    while (j <= n) {
      if (nums[j] < p) {
        swap(nums, i, j);
        i++;
        j++;
      } else if (nums[j] > p) {
        swap(nums, j, n);
        n--;
      } else {
        j++;
      }
    }
  }

  private void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
}
