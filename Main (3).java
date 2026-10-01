class Employee {
  protected String id;
  protected String name;
  protected double baseSalary;
  public Employee(String id, String name, double baseSalary) {
    this.id=id;
    this.name=name;
    this.baseSalary=baseSalary;
  }
  public String getName() {
    return name;
  }
  public double salary() {
    return baseSalary;
  }
}
class FullTimeEmployee extends Employee {
  private double allowance;
  public FullTimeEmployee(String id, String name, double baseSalary, double allowance){
    super(id,name,baseSalary);
    this.allowance=allowance;
  }
  @Override
  public double salary(){
    return baseSalary+allowance;
  }
}
class Intern extends Employee{
  private String school;
  public Intern(String id, String name, double baseSalary, String school){
    super(id,name,baseSalary);
    this.school=school;
  }
  @Override
  public double salary() {
    return baseSalary*0.7;
  }
}
public class Main{
  public static void main(String[] args){
    Employee[] employees = new Employee[] {
      new FullTimeEmployee("NV01","A",10000000,2000000),
      new Intern("NV02","B",5000000, "PTIT")
    };
    double totalPayroll=0;
    for (Employee emp : employees) {
            double currentSalary = emp.salary();
            System.out.println("Nhân viên " + emp.getName() + ": " + (long)(currentSalary));
            totalPayroll += currentSalary;
    }
  System.out.println("--------------------------------");
  System.out.println("Tổng quỹ lương in ra: " + (long)(totalPayroll));
  }
}