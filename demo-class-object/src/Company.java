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
    
    Dept[] depts = new Dept[2];
    depts[0] = new Dept("Ops");
    depts[1] = new Dept("Fin");
    

    Staff staffA = new Staff("Ada", 99, 40);
    depts[0].add(staffA);
    System.out.println(staffA.getName() + "," + staffA.payroll());

    Staff staffB = new Staff("Billy", 200, 50);
    depts[0].add(staffB);
    System.out.println(staffB.getName() + "," + staffB.payroll());

    Staff staffC = new Staff("Carol", 150, 50);
    depts[0].add(staffC);
    System.out.println(staffC.getName() + "," + staffC.payroll());


    Companys[0].add(depts[0]);
    System.out.println(depts[0].substotalOfDept());

    System.out.println("--- --- --- --- ---");
    System.out.println(Companys[0].name + ", " + Companys[0].depts[0].getName() + ", " + Companys[0].depts[0].getSubtotalOfDept());
  }
}
