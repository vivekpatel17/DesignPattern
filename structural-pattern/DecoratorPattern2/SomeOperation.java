package DecoratorPattern2;

public class SomeOperation implements ISomeOperation {
    private int a;
    private int b;

    public SomeOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        System.out.println("Adding");
        return a + b;
    }

    public int sub(){
        System.out.println("Subtracting");
        return a - b;
    }
}
