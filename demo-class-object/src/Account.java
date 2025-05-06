public class Account {
  // Attributes
  private String userId;
  private String name;
  private double balance;
  

  //! Can be more than 1 constructors
  // Constructor
  public Account() { // empty constructor (no parameter)
    // empty constructor implicitly exists
    this.balance = 10.0;
  }
  // Technically OK
  // public Account(String userId){
    //this.userId = userId;
  //}


  // All arguments constructor (All parameters)
    public Account(String userId, String name, double balance){
      this.userId = userId;
      this.name = name;
      this.balance = balance;
    }
    //! write
    public void setBalance(double balance) {
    this.balance = balance;
    }
    //! read
    public double getBalance() {
      return this.balance;
    }
    public String getUserId() {
      return this.userId;
    }
    public void setUserId(String userId) {
      this.userId = userId;
    }

    public String getName() {
      return this.name;
    }
    public void setName(String name) {
      this.name = name;
    }
  
    // object reference
    // "new" -> create an object of Account
    public static void main(String[] args) {
      
    
    Account a1 = new Account();
    a1.setBalance(100.0);
    System.out.println(a1.getBalance());
    Account a2 = new Account();
    a2.setBalance(200.0);
    System.out.println(a2.getBalance());
    Account a3 = new Account();
    a3.setBalance(300.0);
    a2 = a1;
    a2.setBalance(1000000.0);
    a1.setBalance(99999.9);
    a2.setBalance(99.9);
    System.out.println(a2.getBalance());
    System.out.println(a1.getBalance());

    Account a4 = new Account("a0001", "johnwong", 900.0);
    System.out.println(a4.getUserId());
    System.out.println(a4.getName());
    System.out.println(a4.getBalance());

    // Local Variable
    // String userId = "123";
    // System.out.println(userId); // "123"
  

  


  }
}
