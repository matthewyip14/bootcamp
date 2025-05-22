// JVM create enum objects by your constructor
public enum Currency {
  HKD(1, "Hong Kong Dollar"), //
  USD(2, "US Dollar"), //
  CNY(3, ""), //
  JPY(4, ""), //
  ;

  private int value;
  private String description;

  private Currency (int value, String description) {
    this.value = value;
    this.description = description;
  }

  public int getValue() {
    return this.value;
  }

  public String getDescription() {
    return this.description;
  }

  public static void main(String[] args) {
    System.out.println(Currency.USD.getValue()); // 2
    System.out.println(Currency.USD.getDescription()); // US Dollar
  }

}