import impl.MySqlConnection;
import impl.OracleConnection;

public class Main {
    public static void main(String[] args) {
        MySqlConnection mySqlConnection = new MySqlConnection();
        OracleConnection oracleConnection = new OracleConnection();
        oracleConnection.connect();
        mySqlConnection.connect();
    }
}
