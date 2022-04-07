package impl;

import contract.DBConnection;

public class OracleConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to oracle!!!!");
    }
}
