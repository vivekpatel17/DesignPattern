package ObserverPattern.ObserverPatternSingleListner;

public class ObserverPattern2 {
    public static void main(String[] args) {
        Store store = new Store();

        EmailMsgListners email1 = new EmailMsgListners("email1@gamil.com");
        EmailMsgListners email2 = new EmailMsgListners("email2@gamil.com");
        EmailMsgListners email3 = new EmailMsgListners("email3@gmail.com");

        MobileMsgListners user1 = new MobileMsgListners("user1");
        MobileMsgListners user2 = new MobileMsgListners("user2");
        MobileMsgListners user3 = new MobileMsgListners("user3");

        store.newItemPromotion();
        System.out.println("\n");
        store.getService().subscribe(email1);
        store.getService().subscribe(email2);
        store.getService().subscribe(user1);
        store.newItemPromotion();
        System.out.println("\n");
        store.getService().unsubscribe(email2);
        store.getService().subscribe(user2);
        store.getService().subscribe(email3);
        store.getService().unsubscribe(user1);
        store.getService().subscribe(user3);
        store.getService().unsubscribe(user3);
        store.newItemPromotion();
        System.out.println("\n");
    }
}
