package comportamental.chain_of_responsability;

//Interfata Handler cu metoda specifica HandleRequest
public interface Handler {
    void setNextHandler(Handler nextHandler);

    void handleRequest(String request);
}
