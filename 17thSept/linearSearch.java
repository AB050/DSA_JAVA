public class linearSearch {
  public static void main(String[] args) {
    int[] arr = { 5, 2, 1, 3, 4, -6, -2 };
    int key = -6;
    linearArraySearch(arr, key);
    System.out.println(linearArraySearch(arr, key));
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        System.out.println(i);
      }
    }
  }

  public static int linearArraySearch(int[] arr, int key) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        ans = i;
        break;
      }
    }
    return ans;
  }
}
