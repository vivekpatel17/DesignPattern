package AdapterPattern;

class FancyServiceApp {
    public void displayCatlog(JsonData jsonData) {
        System.out.println("Displaying catlog json");
    }

    public void displayRecommendation(JsonData jsonData) {
        System.out.println("Displaying recommendation json");
    }
}

public class FancyServiceAppAdapter implements SomeApp {
    private final FancyServiceApp fancyServiceApp;

    public FancyServiceAppAdapter() {
        fancyServiceApp = new FancyServiceApp();
    }

    @Override
    public void displayCatlog(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyServiceApp.displayCatlog(jsonData);
    }

    @Override
    public void displayRecommendation(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyServiceApp.displayRecommendation(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        System.out.println("Converted xml to json");
        return new JsonData();
    }
}