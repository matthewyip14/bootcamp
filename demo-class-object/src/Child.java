public class Child {
  //! Static -> common attribute, NOT belongs to any object
  //! but all objects can access the static variable 
  private static int counter = 0;

  // Every Child object has id, firstName and lastName. But no counter.
  // Attribute (Instance variable)
  // Instance = object
  private long id;
  private String firstName;
  private String lastName;
  //private String hkid;

  // Constructor
  public Child(String firstName, String lastName) {
    counter++;
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  // getter
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public long getID() {
    return this.id;
  }
  //public String getHKID() {
  //  return this.hkid;
  //}
  //! Rewrite the definition of Child in your world.
  public boolean equals(Child child) {
    return this.id == child.getID();
  }
  //public boolean equals(Child child) {
  //  return this.hkid.equals(child.getHKID());
  //}

  public static void main(String[] args) {
    Child c1 = new Child("Leo", "Chan");

    // Approach 1
    if (c1.getFirstName().equals("Leo") && c1.getLastName().equals("Chan")) {
      System.out.println("He is Leo Chan.");
      System.out.println(c1.id);;
    }

    // Approach 2
    System.out.println(c1.equals(new Child("Leo", "Chan")));
    System.out.println(c1.equals(new Child("Leo", "lau")));
    System.out.println(c1.equals(new Child("Peter", "Chan")));
    System.out.println(c1.equals(new Child("Peter", "Chan")));
    
    Child c2 = new Child("Leo", "Wong");
    System.out.println(c2.id);
    System.out.println(c2.equals(new Child("Leo", "Wong")));

  
    
  }





}
