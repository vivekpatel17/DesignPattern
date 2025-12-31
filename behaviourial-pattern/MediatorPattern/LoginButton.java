package MediatorPattern;

public class LoginButton extends AbstractButtons {
    private IMediator mediator;

    @Override
    public void fireActionPerformed() {
        mediator.login();
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Login Button";
    }
}
