package jcore.oop.additional2.designPrinciples.singleton;

public class DataBaseConnection {
    
    // Calling it's own private constructor
    private static final DataBaseConnection INSTANCE = new DataBaseConnection();

    // Prevent external istatiation
    private DataBaseConnection() {
        System.out.println("Database connection created!");
    }

    public static DataBaseConnection getInstance() {
        return INSTANCE;
    }

}
