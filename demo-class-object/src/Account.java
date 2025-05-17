public class Account {
  // Attributes
  private String userId;
  private double balance;

  // ! Can be more than 1 constructors
  // Constructor
  public Account() { // empty constructor (no parameter)
    // ! empty constructor implicitly exists (When there is no constructor)
    this.balance = 10.0;
  }

  // Technically OK
  // public Account(String userId) {
  //   this.userId = userId;
  // }

  // All arguments constructor (All parameters)
  public Account(String userId, double balance) {
    this.userId = userId;
    this.balance = balance;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId){
    this.userId = userId;
  }

  // ! write
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // ! read
  public double getBalance() {
    return this.balance;
  }

  public static void main(String[] args) {
    Account[] accounts = new Account[3]; // create Account Array Object
    Account a1 = new Account();
    Account a2 = new Account();
    a2.setBalance(800.0);
    Account a3 = new Account();
    // accounts[0] = a1;
    accounts[1] = a2;
    // accounts[2] = a3;

    System.out.println(accounts[1].getBalance()); // 800.0
    // System.out.println(accounts[0].getBalance()); // ! error, why not 0.0 ?

    String[] names = new String[3];
    String s1 = "John";
    String s2 = "Peter";
    String s3 = "Sally";
    names[0] = s1;
    // names[1] = s2;

    System.out.println(names[0].length()); // 4
    // System.out.println(names[1].length()); // error
  }
}