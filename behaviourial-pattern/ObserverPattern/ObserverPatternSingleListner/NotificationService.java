package ObserverPattern.ObserverPatternSingleListner;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<IEvtListner> customers;

    public NotificationService() {
        customers = new ArrayList<>();
    }

    public void subscribe(IEvtListner listner) {
        System.out.println("subscribe email to " + listner.getData());
        customers.add(listner);
    }

    public void unsubscribe(IEvtListner listner) {
        System.out.println("unsubscribe email to " + listner.getData());
        customers.remove(listner);
    }

    public void notifySubscriber() {
        customers.forEach(c -> c.update());
    }
}
