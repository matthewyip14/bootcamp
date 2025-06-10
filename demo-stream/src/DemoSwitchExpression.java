public class DemoSwitchExpression {
  public static void main(String[] args) {
    // switch is a bad idea:
    // 1) you have to remember to break
    // 2) no range checking
    // 3) eye ball check if all values has been covered
    // 4) Not allow to do "AND" event

    Currency currency = Currency.USD;
    if (currency == Currency.HKD) {

    } else if (currency == Currency.USD) {

    } else if (currency == Currency.CNY) {

    }

    // switch expression
    // 1) Avoid Duplicate case
    // 2) Java 21: missing case -> warning; Java 17: missing value -> error
    // 3) default case is allowed, but you can ignore
    // 4) switch expression is good for enum

    Currency amountCurrency = Currency.USD;
    double amount = 10.0;

    double amountInHKD = switch (amountCurrency) {
      case HKD -> amount * 1.0;
      case USD -> amount * 7.85;
      case CNY -> amount * 1.13;
    };
    System.out.println(amountInHKD);

    double amountInHKD2 = switch (amountCurrency) {
      case HKD -> {
        System.out.println("No Conversion.");
        yield amount * 1.0; // "yield" silmiar to "return"
      }
      case USD -> {
        System.out.println("Converting CNY to HKD...");
        yield amount * 7.85;
      }
      case CNY -> {
        System.out.println("Converting CNY to HKD...");
        yield amount * 1.13;
      }
    };
    System.out.println(amountInHKD2);

  }

  public static enum Currency {
    HKD, USD, CNY,;
    // 50 currency
  }
}