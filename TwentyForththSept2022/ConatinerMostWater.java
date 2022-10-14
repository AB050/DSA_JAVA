package TwentyForththSept2022;

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
      maximumWater = Math.max(maximumWater, (high - low) * Math.min(height[low], height[high]));
      if (height[low] < height[high])
        low++;
      else
        high--;
    }
    return maximumWater;
  }
}
