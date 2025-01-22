package creational.object_pool;

//Compania XYZ gestionează conexiuni la o bază de date pentru o aplicație de monitorizare.
//Fiecare conexiune este costisitoare de creat și de distrus, astfel încât trebuie implementat un sistem care să
//gestioneze un număr limitat de conexiuni reutilizabile.
//Se dorește implementarea unui Object Pool care să asigure următoarele:
//Gestionarea unui set fix de conexiuni reutilizabile.
//Obținerea unei conexiuni disponibile din pool (dacă există) sau așteptarea eliberării unei conexiuni ocupate.
//Eliberarea conexiunii după utilizare, astfel încât să poată fi reutilizată de alte procese.

public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = ConnectionPool.getInstance(3);

        //Obtinere conexiuni din pool
        DatabaseConnection conn1 = pool.getConnection();
        DatabaseConnection conn2 = pool.getConnection();
        DatabaseConnection conn3 = pool.getConnection();

        //Incercare obtinere unei conexiuni aditionale
        DatabaseConnection conn4 = pool.getConnection();
        if (conn4 == null) {
            System.out.println("No available connections. Please release one.");
        }

        //Utilizare conexiuni
        if (conn1 != null) conn1.connect();
        if (conn2 != null) conn2.connect();
        if (conn3 != null) conn3.connect();

        //Eliberare conexiune
        pool.releaseObject(conn1);

        DatabaseConnection conn5 = pool.getConnection();
        if (conn5 != null) {
            conn5.connect();
        }
    }
}
