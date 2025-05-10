public class Human {
  private long id;
  
  public Human(long id) {
    this.id = id;
  }
  public long getId () {
    return this.id;
  }


  public boolean equals(Human human) {
    if (this.id == Human.getId()) {
      return true;
    }
    return false;
  }
  // equals() -> String, Integer, Double



  public static void main(String[] args) {
    Human s1 = new Human(1L);
    Human s2 = new Human(1L);

    if (s1.getId() == 1L) {

    }
    System.out.println(s1.equals(new Human(1L))); // suppose true, but falase now

    //! by default, Java implicitly say that equals() checking object's address



  }
}
