import contract.MySqlConnection;
import impl.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.connect();

        DatabaseConnection dbConnection = () -> System.out.println("Connecting to database from mysql!!!");
        dbConnection.connect();

    }
}
