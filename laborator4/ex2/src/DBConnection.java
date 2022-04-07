public final class DBConnection {
    private final String userName;
    private final String password;
    private final String url;
    private final Connection connection;


    public DBConnection(String userName, String password, String url) {
        this.userName = userName;
        this.password = password;
        this.url = url;
        this.connection =  new Connection(userName, password, url);
    }
    
    public Connection getConnection(){
        return connection;
    }
}
