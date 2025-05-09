public class Customer {
  private long id;
  private String name;
  private Order[] orders;

  public Customer(long id, String name) {
    this.orders = new Order[0];
    this.id  = id;
    this.name = name;
    //this.orders = orders();
  }
  
  
  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  }
  public boolean isVIP() {
    double total = 0.0;
    for (int i = 0; i <this.orders.length; i++) {
      total += this.orders[i].checkoutAmount();
    }
    if (total > 100000) {
      return true;
    } else {
      return false;
    }
  }
  //main()
  // John -> many Orders -> items
  // isVIP()
  // total amount of orders > 100_000
  public static void main(String[] args) {
    Customer[] customers = new Customer[0];
    
    Customer john = new Customer(customers.length+1, "John");
    System.out.println("length order :" + john.orders.length);

    Order order1 = new Order();

    Item order1ItemA = new Item(69.0, 21);
    order1.add(order1ItemA);

    Item order1ItemB = new Item(1500, 52);
    order1.add(order1ItemB);

    john.add(order1);
   
    System.out.println("ID number is " + john.id);
    System.out.println("user name is " + john.name);
    System.out.println("length order : " + john.orders.length);
    System.err.println("checkoutAmount : " + john.orders[0].checkoutAmount());
    System.out.println("is John a VIP ? : " + john.isVIP());

    Order order2 = new Order();

    Item order2itemA = new Item(59.0, 121);
    order2.add(order2itemA);

    Item order2itemB = new Item(150.0, 112);
    order2.add(order2itemB);

    john.add(order2);
   
    System.out.println("ID number is " + john.id);
    System.out.println("user name is " + john.name);
    System.out.println("length order : " + john.orders.length);
    System.err.println("checkoutAmount : " + john.orders[1].checkoutAmount());
    System.out.println("is John a VIP ? : " + john.isVIP());
  }
}















