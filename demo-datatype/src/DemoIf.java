public class DemoIf {
  public static void main(String[] args) {
    int x = 13;
    if (x < 4) { // true / false
      System.out.println("Hello~");
    }
    if (x < 10){
      System.out.println("Goodbye~");
    } else{
      System.out.println("welcome~");
    }

    //! Rules:
    // Step 1: try "if" condition, if it is true, execute the action, and then EXIT
    // Step 2: if the Step 1 result is false, then "else if" condition, if it is true, excute the action, and then EXIT
    // Step 3: if ste 2 resuit is false, it is  true, excute the action, and then EXIT

    // if + else if + else
    int y = 16;
    if(y < 90){ 
      System.out.println("y is smaller than 90.");
    } else if (y >= 90 && y <= 100) {
      System.out.println("y is 90 < y < 99");

    } else { // y >= 100
      System.out.println(" y >= 100");
    }
    
    // double w
    // if  w < 100, print "ABC"
    // w between 103 and 110, print "DEF"
    // for other values, print "XYZ"
    double w = 1105.99;
    if (w < 100) {
      System.out.println("ABC");
    } else if ( w >= 103 && w < 110) {
      System.out.println("DEF");
    } else {
      System.out.println("XYZ");
    }

    // AND &&
    // OR ||
    int a = 2;
    int b = 20;
    if (a > 3 || b < 15) { // OR
      System.out.println("a > 3 OR b < 15");
    } else {
      System.out.println("Error.");
    }

    int q = 4;
    int u = 80;
    if (q > 2) {
      u = u + 2;
    } else if (q <5) {
      u = u + 10;
    }
    System.out.println(u);

    q = 10;
    u = 100;
    if (q > 5 && u < 99) {
      System.out.println("hello");
    } else if (q <= 5) {
      System.out.println("bye");
    } else {
      System.out.println("bootcamp");
    }
    
    // String
    String s1 = "hi";
    System.out.println(s1.length()); //5

    if (s1.length() > 3) {
      System.out.println("Java");
    } else {
      System.out.println("Python");
    }

    // equals() + if

    String s2 = "Good";
    int score = 0;
    if (s2.equals("Java")) {
      score += 1;
    } else {
      score += 2;
    }
    System.out.println(score);

    // charAt
    // Check if the first character of string is 'c', or the last character is 'd',
    //if yes, print "yes", if no, print "no"
    String s3 = "oh my god";
    if (s3.charAt(0) == 'c'|| s3.charAt(s3.length() - 1) == 'd') {
    System.err.println("yes"); 
    } else {
      System.out.println("no");
    }
    
    String s4 = "Matthew";
    if (s4.charAt(3) == 't') {
      System.out.println("bingo");
    } else {
      System.out.println("thank you");
    }

  }
}
