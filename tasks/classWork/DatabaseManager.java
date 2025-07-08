import java.util.*;

public class DatabaseManager {
    public void insert(String data) {
        System.out.println("Inserting data: " + data);
    }

    public String fetch(int id) {
        return "Data with ID " + id;
    }

    public void delete(int id) {
        System.out.println("Deleting record with ID: " + id);
    }

    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        manager.insert("Sample data");
        String result = manager.fetch(123);
        System.out.println("Fetched: " + result);
        manager.delete(123);
    }
}
    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        manager.insert("Sample data");
        String result = manager.fetch(123);
        System.out.println("Fetched: " + result);
        manager.delete(123);
    }
}

