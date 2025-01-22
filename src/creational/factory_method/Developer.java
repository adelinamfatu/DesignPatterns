package creational.factory_method;

//Clasa ce implementeaza interfata
//ConcreteProductA
public class Developer implements Employee {
    private String name;
    private String function;
    private double salary;
    private String programmingLanguage;

    public Developer(String name, String function, double salary, String programmingLanguage) {
        this.name = name;
        this.function = function;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void showEmployeeData() {
        System.out.println(getClass() + ": name - " + name + ", function - " + function +
                ", salary - " + salary + ", programming language - " + programmingLanguage);
    }
}
