package VisitorPatter;

public class VisitorPattern1 {
    public static void main(String[] args) {
        InsuranceMessageVisitor visitor = new InsuranceMessageVisitor();

        String name = "name";
        String address = "address";
        String number = "number";
        String insuranceClass = "gold";

        AbstractClient bank = new Bank(name, address, number, insuranceClass);
        bank.accept(visitor);

        AbstractClient resident = new Resident(name, address, number, insuranceClass);
        resident.accept(visitor);
    }
}
