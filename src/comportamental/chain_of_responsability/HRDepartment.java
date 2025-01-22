package comportamental.chain_of_responsability;

//ConcreteHandlerB
public class HRDepartment implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("HR Issue")) {
            System.out.println("HR Department: Cererea a fost procesată de departamentul HR.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Cererea nu poate fi procesată.");
        }
    }
}
