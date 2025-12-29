package VisitorPatter;

public abstract class AbstractClient {
    private final String name;
    private final String address;
    private final String number;
    
    public AbstractClient(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract void accept(IVisitor visitor);
}
