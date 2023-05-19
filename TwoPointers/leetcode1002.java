package TwoPointers;
import java.util.*;

public class leetcode1002 {
  public static void main(String[] args) {
    String [] str = {"bella","label","roller"};
    List<String > lst = commonChars(str);
    System.out.println(lst);
    
  }


  public static List<String> commonChars(String[] words) {
    // create a list of the common characters
    List<String> common = new ArrayList<>();
    // iterate through each character in the first string
    for (char c : words[0].toCharArray()) {
    // check if the character appears in all of the other strings
    boolean appearsInAll = true;
        for (int i = 1; i < words.length; i++) {
            if (words[i].indexOf(c) == -1) {
                appearsInAll = false;
                break;
            } else {
                words[i] = words[i].replaceFirst(String.valueOf(c), "");
            }
        }
// if the character appears in all of the other strings, add it to the common characters list
        if (appearsInAll) {
            common.add(String.valueOf(c));
        }
    }

    return common;
}
}
