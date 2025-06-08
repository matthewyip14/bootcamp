public class Person {
  private Long id;
  private Double height;
  private Double weight;

  public static Builder builder() {
    return new Builder();
  }

  private Person(Builder builder) {
    this.id = builder.id;
    this.height = builder.height;
    this.weight = builder.weight;
  }

  // getter, setter, etc

  public static class Builder {
    private Long id;
    private Double height;
    private Double weight;

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder height(Double height) {
      this.height = height;
      return this;
    }

    public Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
  
  public static void main(String[] args) {
    // ! Traditional Constructor
    // Person p1 = new Person(1L, 1.76, 75.0);

    // ! Builder Pattern
    Person p2 = Person.builder() //
        .id(1L) //
        .height(1.76) //
        .weight(75.0) //
        .build();
    
    // ! Advantages:
    // 1. Easy to place value and review the mapping
    // 2. Easy to manage null values for initial object
  }
}