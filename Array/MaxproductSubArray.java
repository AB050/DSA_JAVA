package Array;

public class MaxproductSubArray {
  public static void main(String[] args) {
    int[] A = { -2, 0, -1 };
    MaxproductSubArray productSubArray = new MaxproductSubArray();
    System.out.println(productSubArray.maxProduct(A));
  }

  public int maxProduct(int[] A) {
    int len = A.length;
    int currProd = 1;
    int maxProd = Integer.MIN_VALUE;
    int i = 0;

    // Prefix Product
    // prefix_prod = prefix_prod * A[i] = Multiply form Beginning

    for (i = 0; i < len; i++) {
      // int val = prod*=A[i];
      maxProd = Math.max(currProd *= A[i], maxProd);
      // Edge Case for 0 in Subarray
      // [-3, 0, 1, -2]
      // If prod, not set to 1:
      // prefix_prod = [-3,0,0,0] - Need Special Handling
      // Need: [-3 0 1 -2]

      if (A[i] == 0)
        currProd = 1;
    }

    currProd = 1;

    // Suffix Product
    // suffix_prod = suffix_prod * A[n-i-1] = Multiply form End

    for (i = len - 1; i >= 0; i--) {
      maxProd = Math.max(currProd *= A[i], maxProd);

      // Edge Case for 0 in Subarray
      if (A[i] == 0)
        currProd = 1;
    }

    return maxProd;

  }
}
