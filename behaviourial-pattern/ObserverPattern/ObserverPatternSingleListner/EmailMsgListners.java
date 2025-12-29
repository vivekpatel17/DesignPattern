package ObserverPattern.ObserverPatternSingleListner;

public class EmailMsgListners implements IEvtListner {
    private final String email;

    public EmailMsgListners(String email) {
        this.email = email;
    }

    public String getData() {
        return email;
    }
    
    public void update() {
        System.out.println("updating email to " + email);
    }
}
