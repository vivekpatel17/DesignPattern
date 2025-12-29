package ObserverPattern.ObserverPatternWithEvtType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final Map<EvtType, List<IEvtListner>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        customers.put(EvtType.Promo, new ArrayList<>());
        customers.put(EvtType.Sale, new ArrayList<>());
    }

    public void subscribe(EvtType type, IEvtListner listner) {
        System.out.println("subscribe " + type + " to " + listner.getData());
        customers.get(type).add(listner);
    }

    public void unsubscribe(EvtType type, IEvtListner listner) {
        System.out.println("unsubscribe " + type + " to " + listner.getData());
        customers.get(type).remove(listner);
    }

    public void notifySubscriber(EvtType type) {
        if (customers.get(type) == null) {
            return;
        }
        
        System.out.println("notifySubscriber email to " + type);
        customers.get(type).forEach(c -> c.update());
    }
}
