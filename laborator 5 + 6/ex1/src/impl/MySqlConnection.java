package impl;

import contract.DBConnection;

public class MySqlConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to mysql!!!");
    }
}
