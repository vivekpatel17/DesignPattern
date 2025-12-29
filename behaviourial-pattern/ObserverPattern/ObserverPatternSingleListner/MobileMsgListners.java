package ObserverPattern.ObserverPatternSingleListner;

public class MobileMsgListners implements IEvtListner {
    public final String userName;

    public MobileMsgListners(String userName) {
        this.userName = userName;
    }

    public void update() {
        System.out.println("updating mobile to " + userName);
    }

    public String getData() {
        return userName;
    }
}
