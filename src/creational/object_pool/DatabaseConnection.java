package creational.object_pool;

//Clasa Object
public class DatabaseConnection {
    private final String id;

    public DatabaseConnection(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void connect() {
        System.out.println("Connecting to database with connection ID: " + id);
    }

    public void disconnect() {
        System.out.println("Disconnecting from database with connection ID: " + id);
    }
}
