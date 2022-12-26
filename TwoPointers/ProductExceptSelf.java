package TwoPointers;

public class ProductExceptSelf {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int[] prod = new int[nums.length];
    prod = ProductSelf(nums);
    for (int value : prod) {
      System.out.print(value + " ");
    }
    int[] res = new int[nums.length];
    res = productSelfwithoutOperator(nums);
    for (int value : res) {
      System.out.print(value + " ");
    }
  }

  // With using '/' operator
  public static int[] ProductSelf(int[] nums) {
    int n = nums.length;
    int mul = 1;
    int[] prod = new int[n];
    for (int i = 0; i < n; i++) {
      mul *= nums[i];
    }
    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        prod[i] = mul / nums[i];
      } else {
        prod[i] = mul;
      }
    }
    return prod;
  }

  // Without using '/' operator
  public static int[] productSelfwithoutOperator(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    // prefix product
    int left = 1;
    for (int i = 0; i < n; i++) {
      if (i > 0) {
        left *= nums[i - 1];
      }
      res[i] = left;
      System.out.print(res[i] + " ");
    }
    // Suffix product
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
      if (i < n - 1) {
        right *= nums[i + 1];
      }
      System.out.print(right + " ");
      res[i] *= right;

    }
    return res;
  }
}
