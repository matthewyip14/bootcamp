public class Company {
  private String name;
  private Dept[] depts;

  public Company(String name) {
    this.name = name;
    this.depts = new Dept[0];
  }
  public void add(Dept newDept) {
    Dept[] newDepts = new Dept[this.depts.length + 1];
    for (int i = 0; i < this.depts.length; i++) {
      newDepts[i] = depts[i];
    }
    newDepts[newDepts.length - 1] = newDept;
    this.depts = newDepts;
  }

  
  public static void main(String[] args) {
    Company[] Companys = new Company[1];

    Companys[0] = new Company("ABC");
    System.out.println(Companys[0].name);
    
    Dept[] depts = new Dept[2];

    depts[0] = new Dept("Ops");
    System.out.println(depts[0].getName());
    depts[1] = new Dept("Fin");
    System.out.println(depts[1].getName());
    System.out.println("--- --- --- --- ---");

    Staff staffA = new Staff("Ada", 99, 40);
    depts[0].add(staffA);

    Staff staffB = new Staff("Billy", 200, 50);
    depts[0].add(staffB);

    Staff staffC = new Staff("Carol", 150, 50);
    depts[0].add(staffC);

    Companys[0].add(depts[0]);

    System.out.println(Companys[0].name, depts[0].name, depts[0].substotalOfDept());
    
  }
}
