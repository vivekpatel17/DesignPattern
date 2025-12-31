package MediatorPattern;

public class MediatorPattern {
    public static void main(String[] args) {
        IMediator mediator = new Dialog();

        AbstractButtons loginBtn = new LoginButton();

        loginBtn.setMediator(mediator);
        System.out.println(loginBtn.getName());
        System.out.println('\n');
        loginBtn.fireActionPerformed();
    }
}
