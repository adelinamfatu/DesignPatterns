package creational.object_pool;

import java.util.LinkedList;
import java.util.Queue;

//Clasa ObjectPool
public class ConnectionPool {
    //Obiect de tip ObjectPool - singleton
    private static ConnectionPool instance;
    private final Queue<DatabaseConnection> availableConnections;
    private final Queue<DatabaseConnection> usedConnections;
    private final int maxPoolSize;

    //Constructor privat
    private ConnectionPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        this.availableConnections = new LinkedList<>();
        this.usedConnections = new LinkedList<>();
        initializePool();
    }

    private void initializePool() {
        for (int i = 1; i <= maxPoolSize; i++) {
            availableConnections.add(new DatabaseConnection("Conn-" + i));
        }
    }

    //Metoda getInstance specifica Singleton
    public static ConnectionPool getInstance(int maxPoolSize) {
        if (instance == null) {
            instance = new ConnectionPool(maxPoolSize);
        }
        return instance;
    }

    public synchronized DatabaseConnection getConnection() {
        if (availableConnections.isEmpty()) {
            System.out.println("No available connections. Waiting...");
            return null;
        }

        DatabaseConnection connection = availableConnections.poll();
        usedConnections.add(connection);
        return connection;
    }

    //Metoda releaseObject care elibereaza conexiunea
    public synchronized void releaseObject(DatabaseConnection connection) {
        if (connection != null) {
            usedConnections.remove(connection);
            availableConnections.add(connection);
            System.out.println("Connection released: " + connection.getId());
        }
    }

    //Metoda getObject
    public int getObject() {
        return availableConnections.size();
    }
}
