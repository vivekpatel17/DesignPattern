package DecoratorPattern;

import java.util.Map;

public class DatabaseService {
    private final Map<String, UserData> userMailMapping;

    public DatabaseService(Map<String, UserData> userMailMapping) {
        this.userMailMapping = userMailMapping;
    }

    public String getMailForUser(String userName){
        return userMailMapping.get(userName).getMail();
    }

    public String getPhoneNumberForUser(String userName){
        return userMailMapping.get(userName).getPhoneNumber();
    }
}

class UserData {
    private final String mail;
    private final String phoneNumber;

    public UserData(String mail, String phoneNumber) {
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
