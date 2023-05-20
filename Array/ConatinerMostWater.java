package Array;

public class ConatinerMostWater {
  public static void main(String[] args) {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    ConatinerMostWater mostwater = new ConatinerMostWater();
    System.out.println(mostwater.maxArea(height));
  }

  public int maxArea(int[] height) {
    int maximumWater = 0;
    int low = 0;
    int high = height.length - 1;
    while (low < high) {
      int min_height = Math.min(height[low], height[high]);
      maximumWater = Math.max(maximumWater, (high - low) * min_height);
      if (height[low] < height[high])
        low++;
      else
        high--;
    }
    return maximumWater;
  }
}
