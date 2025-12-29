package VisitorPatter;

public class Resident extends AbstractClient {
    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitResident(this);
    }
}
