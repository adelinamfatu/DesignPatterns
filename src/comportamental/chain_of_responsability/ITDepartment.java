package comportamental.chain_of_responsability;

//ConcreteHandlerA
public class ITDepartment implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("IT Support")) {
            System.out.println("IT Department: Cererea a fost procesată de departamentul IT.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Cererea nu poate fi procesată.");
        }
    }
}
