public class SortedByElderly {
  @Override
  public int compare(Person p1, Person p2) {
    if (p1.isElderly())
      return -1;
    if (p2.isElderly())
      return 1;
    return -1;



  }
}
