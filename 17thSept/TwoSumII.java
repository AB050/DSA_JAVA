public class TwoSumII {
  public static void main(String[] args) {
    int[] numbers = { 2, 7, 11, 15 };
    int target = 9;
    int[] output = new int[numbers.length];
    output = twoSum(numbers, target);
    for (int value : output) {
      System.out.println(value);
    }

  }

  public static int[] twoSum(int[] numbers, int target) {
    int n = numbers.length, i = 0, j = n - 1;
    while (i < j) {
      int sum = numbers[i] + numbers[j];
      if (sum == target)
        return new int[] { i + 1, j + 1 };
      if (sum > target)
        j--;
      else
        i++;
    }
    return null;
  }
}
