package creational.factory_method;

//ConcreteProductFactoryB
public class ManagerFactory extends EmployeeFactory {
    @Override
    public Employee createEmployee(String name, String function, double salary, String additionalInfo) {
        return new Manager(name, function, salary, additionalInfo);
    }
}
