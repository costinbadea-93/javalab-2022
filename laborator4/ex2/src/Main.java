public class Main {
    public static void main(String[] args) {

        /**
         * pasi pentru definirea unei clase imutabile:
         * definirea clasei trb sa foloseasca "final"
         * proprietatile clasei trb sa fie si ele "final"
         * nu se va declara setter, se vor defini doa getter
         */

        DBConnection dbConnection = new DBConnection("userName", "password", "url");
        Connection connection = dbConnection.getConnection();
    }
}
