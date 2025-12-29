package VisitorPattern;

import java.util.Arrays;
import java.util.List;

public class VisitorPattern2 {
    public static void main(String[] args) {
        InsuranceMessageVisitor visitor = new InsuranceMessageVisitor();

        String name = "name";
        String address = "address";
        String number = "number";
        String insuranceClass = "gold";

        AbstractClient bank = new Bank(name, address, number, insuranceClass);
        AbstractClient resident = new Resident(name, address, number, insuranceClass);

        List<AbstractClient> clients = Arrays.asList(bank, resident);
        visitor.sendInsuranceMails(clients);
    }
}
