package comportamental.command;

//Clasa Invoker
//Are un obiect de tip Command
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Nicio comandă nu este setată.");
        }
    }
}
