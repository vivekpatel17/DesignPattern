package MediatorPattern;

public class Dialog implements IMediator {
    IMediator mediator;
    
    @Override
    public void login() {
        System.out.println("Logged In");
    }
    
    @Override
    public void forgetPassword() {
        System.out.println("Forgot Password");
    }
}
