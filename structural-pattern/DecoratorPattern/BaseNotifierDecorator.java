package DecoratorPattern;

public class BaseNotifierDecorator implements INotifier {
    private final INotifier wrappedNotifier;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier notifier, DatabaseService databaseService) {
        this.wrappedNotifier = notifier;
        this.databaseService = databaseService;
    }

    @Override
    public void send(String msg) {
        wrappedNotifier.send(msg);
    }

    @Override
    public String getUserName() {
        return wrappedNotifier.getUserName();
    }
}

class EmailNotifierDecorator extends BaseNotifierDecorator {
    public EmailNotifierDecorator(INotifier notifier, DatabaseService databaseService) {
        super(notifier, databaseService);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String mail = databaseService.getMailForUser(getUserName());
        System.out.println("Sending Email " + msg + " to " + mail);
    }
}

class WhatsAppNotifierDecorator extends BaseNotifierDecorator {
    public WhatsAppNotifierDecorator(INotifier notifier, DatabaseService databaseService) {
        super(notifier, databaseService);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String phoneNumber = databaseService.getPhoneNumberForUser(getUserName());
        System.out.println("Sending WhatsApp " + msg + " to " + phoneNumber);
    }
}
