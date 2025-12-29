package ObserverPattern.ObserverPatternSingleListner;

public class ObserverPattern1 {
    public static void main(String[] args) {
        Store store = new Store();

        EmailMsgListners email1 = new EmailMsgListners("email1@gamil.com");
        EmailMsgListners email2 = new EmailMsgListners("email2@gamil.com");
        EmailMsgListners email3 = new EmailMsgListners("email3@gmail.com");

        store.newItemPromotion();
        System.out.println("\n");
        store.getService().subscribe(email1);
        store.getService().subscribe(email2);
        store.newItemPromotion();
        System.out.println("\n");
        store.getService().unsubscribe(email2);
        store.getService().subscribe(email3);
        store.newItemPromotion();
        System.out.println("\n");
    }
}
