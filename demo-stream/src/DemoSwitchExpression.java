import java.util.Currency;

public class DemoSwitchExpression {
  public static void main(String[] args) {
    // switch is a bad idea;
    // 1) you have to remember to break
    // 2) no range checking
    // 3) eye ball check if all values has been covered
    // 4) Not allow to do "AND" and "OR"
    //
  
    Currency currency = Currency.USD;
    if (currency == currency.HKD) {

    } else if (currency == Currency.USD) {

    } else if (currency == Currency.CNY) {

    }

    // switch expression
    // 1) Avoid Duplicate case
    // 2) Java 21: missing case -> warning; Java 17: missing value -> error
    // 3) No default case is allowed
    // 4) Is good for enum
    Currency amountCurrency = Currency.USD;
    
    double amount  = 10.0;
    double amountInHKD  = switch (amountCurrency) {
      case HKD -> System.err.println("Hong Kong Dollar");
      // case HKD -> System.err.println("Hong Kong Dollar");
      case USD -> System.err.println("US Dollar");
      // case CNY -> System.err.println("CNY");
    }
  }
  public static enum Currency {
    HKD, USD, CNY,;
  }
}
