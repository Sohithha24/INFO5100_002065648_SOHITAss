import java.util.Scanner;

public class DesignPatternsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Singleton Pattern Demonstration
        System.out.println("=== Singleton Pattern Demo ===");
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.query("SELECT * FROM users");

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.query("SELECT * FROM orders");

        // Factory Pattern Demonstration
        System.out.println("\n=== Factory Pattern Demo ===");
        System.out.print("Enter notification type (sms/email/push): ");
        String type = scanner.nextLine();
        Notification notification = NotificationFactory.createNotification(type);
        notification.send("This is a " + type + " notification.");

        // Observer Pattern Demonstration
        System.out.println("\n=== Observer Pattern Demo ===");
        NewsAgency newsAgency = new NewsAgency();
        NewsSubscriber subscriber1 = new NewsSubscriber("Alice");
        NewsSubscriber subscriber2 = new NewsSubscriber("Bob");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        System.out.print("Enter news to broadcast: ");
        String news = scanner.nextLine();
        newsAgency.notifySubscribers(news);

        scanner.close();
    }
}
