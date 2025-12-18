package DecoratorPattern2;

public class LoggingDecorator implements ISomeOperation {
    ISomeOperation someOperation;

    public LoggingDecorator(ISomeOperation someOperation) {
        this.someOperation = someOperation;
    }

    public int add() {
        System.out.println("LoggingDecorator: add");
        return someOperation.add();
    }

    public int sub() {
        System.out.println("LoggingDecorator: sub");
        return someOperation.sub();
    }
}
