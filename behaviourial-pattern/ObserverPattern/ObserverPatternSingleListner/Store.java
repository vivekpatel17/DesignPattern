package ObserverPattern.ObserverPatternSingleListner;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifySubscriber();
    }

    public NotificationService getService() {
        return notificationService;
    }
}
