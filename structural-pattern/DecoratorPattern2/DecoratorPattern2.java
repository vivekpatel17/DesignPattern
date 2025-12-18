package DecoratorPattern2;

public class DecoratorPattern2 {
    public static void main(String[] args) {
        ISomeOperation someOperation = new SomeOperation(1, 2);
        int addResult = someOperation.add();
        int subResult = someOperation.sub();
        System.out.println("Result Add: " + addResult + subResult);

        ISomeOperation loggingDecorator = new LoggingDecorator(someOperation);
        int resultAdd = loggingDecorator.add();
        int resultSub = loggingDecorator.sub();
        System.out.println("Result Add: " + resultAdd + resultSub);
    }
}
