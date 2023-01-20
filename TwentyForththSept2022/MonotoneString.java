package TwentyForththSept2022;

public class MonotoneString {
  public static void main(String[] args) {
    String s = "00110";
    System.out.println(minFlipsMonoIncr(s));
  }

  public  static int minFlipsMonoIncr(String s) {
    int flips = 0, counter = 0;
    for(int i =0; i < s.length(); i++){
        if(s.charAt(i) == '1') 
        counter++;
        else 
        flips++;
        flips= Math.min(flips,counter);
    }
    return flips;
}
}
