package TwoPointers;

public class RepeatAlphabet {
  public static void main(String[] args) {
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(repeatAlphabet(str));
  }


  public static String repeatAlphabet(String str){
    StringBuilder sb = new StringBuilder();
    sb.append("ABCDE");
    for(int i = 0;i<26;i++){
      char c = str.charAt(i);
      if(c=='E'){
        sb.append("FFGGHHI");
      }
      if(c=='I'){
        sb.append("JJJKKKLLLMMMNNNO");
      }
      if(c=='O'){
        sb.append("PPPPQQQQRRRRSSSSTTTTU");
      }
    }
    sb.append("VVVVVWWWWWXXXXXYYYYYZZZZZ");
    return sb.toString();
  }
}
