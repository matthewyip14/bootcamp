import java.util.ArrayList;

public class LeetCode {

  
//Hint
//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
  public static void main(String[] args) {
    String s = "zaz";  
    ArrayList<Character> charS = new ArrayList<>();
    for (char ch : s.toCharArray()) {
      charS.add(ch);
    }
    System.out.println(charS);
    int sum = 0;
    for(int i = 0; i<charS.size()-1; i++) {
        sum += Math.abs(charS.get(i)-charS.get(i +1));
    }
    System.out.println(sum);

     public int scoreOfString(String s) {
        int size = s.length();
        int score = 0;
        for (int i = 0; i < size-1; i++) {
            int ascii1 = (int) s.charAt(i);
            int ascii2 = (int) s.charAt(i+1);
            score += Math.abs(ascii1-ascii2);
        } return score;
    }
  }
}