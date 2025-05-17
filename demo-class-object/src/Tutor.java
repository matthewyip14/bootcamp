public class Tutor {

  public static void main(String[] args) {
    // object reference: a1, a2
    // "new" -> create an object of Account
    Account a1 = new Account();
    a1.setBalance(100.0);
    System.out.println(a1.getBalance());

    Account a2 = new Account();
    a2.setBalance(200.0);
    System.out.println(a2.getBalance());

    a2 = a1;
    a2.setBalance(500.0);
    System.out.println(a1.getBalance()); // 500.0
    System.out.println(a2.getBalance()); // 500.0

    Account a3 = new Account("johnwong", 900.0);
    System.out.println(a3.getBalance()); // 900.0

    // Local Variable
    String userId = "123";
    System.out.println(userId);

    Employee e1 = new Employee();
    e1.setName("Mary");
    System.out.println(e1.getName());
  }
}