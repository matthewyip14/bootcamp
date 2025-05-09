public class Order {
  // checkoutAmount
  // private double[] prices;
  // private int[] quantities;

  // Alternative
  private Item[] items;

  public Order() {
    this.items = new Item[0];
  }
  public void add(Item newItem) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }
  // BigDecimal
  //! Item.java owns price & quantity (attribute), so Item has to present price and quantity.
  public double checkoutAmount() {
    double total = 0.0;
    for (int i = 0; i < this.items.length; i++) {
      total += this.items[i].subtotal();
    }
    return total;

    

  }


  public static void main(String[] args) {
    Order order = new Order(); // array length = 0

    Item itemA = new Item(99.0, 2);
    order.add(itemA); // array length = 1

    Item itemB = new Item(14.0, 3);
    order.add(itemB); // array length = 2


    System.out.println(order.checkoutAmount()); // 240
  }
}
