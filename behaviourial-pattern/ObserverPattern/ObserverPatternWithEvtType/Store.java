package ObserverPattern.ObserverPatternWithEvtType;

import java.util.List;

public class Store {
    private final NotificationService notificationService;
    
    public Store() {
        notificationService = new NotificationService();
    }
    
    public void newItemPromotion(List<EvtType> types) {
        types.forEach(type -> notificationService.notifySubscriber(type));
    }
    
    public NotificationService getService() {
        return notificationService;
    }
}
