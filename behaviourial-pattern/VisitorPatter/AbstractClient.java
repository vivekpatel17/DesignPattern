package VisitorPatter;

public abstract class AbstractClient {
    public final String name;
    public final String address;
    public final String number;
    
    public AbstractClient(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }



    public abstract void accept(IVisitor visitor);
}
