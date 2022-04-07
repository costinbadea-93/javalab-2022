package impl;

@FunctionalInterface
public interface DatabaseConnection {
    void connect();

    default void m1() {
        System.out.println("Hello!!!");
    }

    static void m2() {
        System.out.println("Hello Again!!!");
    }
}
