class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calculateSalary() {
        return salary;
    }
}
class OfficeEmployee extends Employee {
    public OfficeEmployee(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calculateSalary() {
        return salary + 1000000;
    }
}
class TechnicalEmployee extends Employee {
    public TechnicalEmployee(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calculateSalary() {
        return salary + 2000000;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Employee[] employees = {
                new OfficeEmployee("An", 10000000),
                new TechnicalEmployee("Binh", 10000000)
        };
        for (Employee e : employees) {
            System.out.println(e.name + " - Luong: " + (long) e.calculateSalary());
        }
    }
}