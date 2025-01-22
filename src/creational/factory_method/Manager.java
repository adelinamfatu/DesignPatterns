package creational.factory_method;

//ConcreteProductB
public class Manager implements Employee {
    private String name;
    private String function;
    private double salary;
    private String department;

    public Manager(String name, String function, double salary, String department) {
        this.name = name;
        this.function = function;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void showEmployeeData() {
        System.out.println(getClass() + ": name - " + name + ", function - " + function +
                ", salary - " + salary + ", department - " + department);
    }
}
