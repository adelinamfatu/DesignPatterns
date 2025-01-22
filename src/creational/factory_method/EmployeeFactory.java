package creational.factory_method;

//Factory Method - clasa abstracta ce creeaza obiecte de tip employee
public abstract class EmployeeFactory {
    public abstract Employee createEmployee(String name, String function, double salary, String additionalInfo);
}
