package comportamental.chain_of_responsability;

public class FinanceDepartment implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Finance Request")) {
            System.out.println("Finance Department: Cererea a fost procesată de departamentul financiar.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Cererea nu poate fi procesată.");
        }
    }
}
