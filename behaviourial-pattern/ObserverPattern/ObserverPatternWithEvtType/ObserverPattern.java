package ObserverPattern.ObserverPatternWithEvtType;

import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Store store = new Store();
        List<EvtType> types = List.of(EvtType.Promo, EvtType.Sale);

        EmailMsgListners email1 = new EmailMsgListners("email1@gamil.com");
        EmailMsgListners email2 = new EmailMsgListners("email2@gamil.com");
        EmailMsgListners email3 = new EmailMsgListners("email3@gmail.com");

        MobileMsgListners user1 = new MobileMsgListners("user1");
        MobileMsgListners user2 = new MobileMsgListners("user2");
        MobileMsgListners user3 = new MobileMsgListners("user3");

        System.out.println("\n");
        store.newItemPromotion(types);
        System.out.println("\n");
        store.getService().subscribe(EvtType.Sale, email1);
        store.getService().subscribe(EvtType.Promo, email2);
        store.getService().subscribe(EvtType.Promo, user1);
        store.newItemPromotion(types);
        System.out.println("\n");
        store.getService().unsubscribe(EvtType.Promo, email2);
        store.getService().subscribe(EvtType.Sale, user2);
        store.getService().subscribe(EvtType.Promo, email3);
        store.getService().unsubscribe(EvtType.Sale, user1);
        store.getService().subscribe(EvtType.Sale, user3);
        store.getService().unsubscribe(EvtType.Sale, user3);
        store.newItemPromotion(types);
        System.out.println("\n");
    }
}
