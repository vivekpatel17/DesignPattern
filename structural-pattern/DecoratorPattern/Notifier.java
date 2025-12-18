package DecoratorPattern;

public class Notifier implements INotifier {
    private final String userName;
    private final DatabaseService databaseService;

    public Notifier(String userName, DatabaseService databaseService) {
        this.userName = userName;
        this.databaseService = databaseService;
    }

    public void send(String message){
        String mail = databaseService.getMailForUser(userName);
        System.out.println("Sending " + message + " to " + mail);
    }

    public String getUserName() {
        return userName;
    }
}
