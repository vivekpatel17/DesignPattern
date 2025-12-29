package VisitorPatter;

public class Bank extends AbstractClient {
    private final String insuranceClass;

    public Bank(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    public String getInsuranceClass() {
        return insuranceClass;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitBank(this);
    }
}
