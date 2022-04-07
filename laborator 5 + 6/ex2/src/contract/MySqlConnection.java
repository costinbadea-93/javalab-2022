package contract;

import impl.DatabaseConnection;

public class MySqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to database from mysql!!!");
    }
}
