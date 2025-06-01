import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoRuntimeException {
  public static void main(String[] args) {
    // ! 1. NullPointerException (NPE)
    String userInput = "hello";
    if (userInput != null) { // avoidable program issue.
      getStringLength(userInput);
    } else {
      System.out.println("Goodbye.");
    }

    // ! 2. ArrayIndexOutOfBoundsException
    int[] arr = new int[] {3, 8, -1};
    for (int i = 0; i < arr.length; i++) { // avoidable program issue (java.lang.ArrayIndexOutOfBoundsException)
      System.out.println(arr[i]);
    }

    // ! 3. divided by 0, ArithmeticException
    double averageScore = (3 + 8 + 10) / 3.0;

    int quantity = 0;
    // averageScore = (3 + 8 + 10) / quantity; // error, java.lang.ArithmeticException
    System.out.println(averageScore);

    // ! 4. StringIndexOutOfBound (s.charAt(3)), which is avoidable

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

    // caller -> method
    try {
      getStringLength(null);
    } catch (IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }

    Staff staff = null;
    try {
      isAdult(staff);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    if (staff != null) {
      staff.getAge();
    }

    List<Staff> staffs =
        new ArrayList<>(Arrays.asList(new Staff(13), new Staff(19)));
    try {
      searchStaffByAge(staffs, 18); // checked exception -> Must handle
    } catch (NotFoundException ex) {

    }

    // 1. error -> catch -> finally
    // 2. no error -> finally
    try {
      searchStaffByAge(staffs, 18);
    } catch (NotFoundException ex) {
      System.out.println("There is no staff in age " + 18);
    } catch (Exception ex) { // catch Parent Exception
      System.out.println("Staff is too old.");
    } finally {
      System.out.println("This is the finally code block");
    }

    // ! for catch sequence, you should catch child exception first, then parent exception.
  }

  public static class Staff {
    private int age;

    public Staff(int age) {
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }
  }

  // ! You have 2 ways to handle "checked" exception
  // 1. try + catch
  // 2. Method Signature -> throws
  public static Staff searchStaffByAge(List<Staff> staffs, int age)
      throws NotFoundException {
    boolean isTooOld = false;
    Staff target = null;
    for (Staff staff : staffs) {
      if (staff.getAge() >= 65)
        isTooOld = true;
      if (staff.getAge() == age)
        target = staff;
    }
    if (isTooOld)
      throw new StaffTooOldException();
    if (target == null)
      throw new NotFoundException(SysError.STAFF_NOT_FOUND);
    return target;
  }

  // ! Javadoc
  /**
   * 
   * @param staff
   * @return
   * @throws IllegalArgumentException. Please take care of your code.
   */
  public static boolean isAdult(Staff staff) {
    if (staff == null)
      throw new RuntimeException("No staff.");
    return staff.getAge() >= 18;
  }

  // Method Author is not able to control the data integrity
  public static int getStringLength(String s) throws IllegalArgumentException {
    if (s == null)
      throw new IllegalArgumentException("Are you crazy?"); // 遺言 -> object
    return s.length();
  }
}