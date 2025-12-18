package DecoratorPattern;

import java.util.Map;

public class DecoratorPattern {
    public static void main(String[] args) {
        Map<String, UserData> userMailMapping = Map.of(
            "user1", new UserData("user1@mail.com", "1234567890"),
            "user2", new UserData("user2@mail.com", "0987654321"),
            "user3", new UserData("user3@mail.com", "1122334455")
        );

        DatabaseService databaseService = new DatabaseService(userMailMapping);
        

        INotifier notifier = new WhatsAppNotifierDecorator(
            new EmailNotifierDecorator(
                new Notifier("user1", databaseService),
                databaseService
            ),
            databaseService
        );
        notifier.send("Hello");
        
        System.out.println("Decorator pattern demonstration");

    }
}
