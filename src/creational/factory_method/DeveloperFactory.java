package creational.factory_method;

//Fabrica concreta pentru Developer
//ConcreteProductFactoryA
public class DeveloperFactory extends EmployeeFactory {
    //Implementeaza metoda ce creeaza obiecte de tip Developer
    @Override
    public Employee createEmployee(String name, String function, double salary, String additionalInfo) {
        return new Developer(name, function, salary, additionalInfo);
    }
}
