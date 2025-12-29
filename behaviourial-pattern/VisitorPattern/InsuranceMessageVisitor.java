package VisitorPattern;

import java.util.List;

public class InsuranceMessageVisitor implements IVisitor {
    public void sendInsuranceMails(List<AbstractClient> clients) {
        for(AbstractClient client: clients) {
            client.accept(this);
        }
    }

    public void visitBank(Bank bank) {
        System.out.println("Sending mail to Bank");
    }

    public void visitResident(Resident resident) {
        System.out.println("Sending mail to Resident");
    }
}
