public class DemoRuntimeException {
  public static void main(String[] args) {
    //NullPointerException (NPE)
    String userInput = "hello";
    if (userInput != null) {
      getStringLength(userInput); // avoidable program issue.
    }

    int[] arr = new int[] {3, 8, -1};
    for (int i = 0; i < arr.length; i++) { // avoidable program issue (java.lang.ArrayIndexOutOfBound)
      System.out.println(arr[i]);
    }

    // StringIndexOutOfBound (s.charAt(3)), which is avoidable

    // Unavoidable + forseeable Exception
    String number = "13";
    try {
      Integer converted = Integer.parseInt(number); // java.lang.NumberFormatException
      System.out.println(converted);
    } catch (NumberFormatException ex) { // catch the issue.
      System.out.println("Goodbye.");
    }

    // try + catch -> normal flow + exception flow (line 19 -> line 22, skip line 20)
    // if + else -> either if or else program flow

    // wrong handling for NPE, because if + else is able to handle NPE
    try {
      String s2 = null;
      s2.length();
    } catch (NullPointerException ex) {
      System.out.println("Goodbye.");
    }

    // divided by 0

    double averageScore = (3 + 8 +10) / 3.0;
    averageScore = (3 + 8 + 10) / quantity; //error, java.lang.Arith






  }


  public static int getStringLength(String s) {
    return s.length();
  }
}
