public class ThreeOdds {
  public static void main(String[] args) {
    int[] arr = { 2, 6, 4, 1 };
    threeConsecutiveOdds(arr);
  }

  public static void threeConsecutiveOdds(int[] arr) {
    if (arr.length < 2) {
      System.out.println("Invalid Input");
    } else {
      for (int i = 2; i < arr.length; i++) {
        if (arr[i - 2] % 2 != 0 && arr[i - 1] % 2 != 0 && arr[i] % 2 != 0) {
          System.out.print("valid Value");
        } else {
          System.out.println("InValid Value");
        }

      }
    }
  }
}
