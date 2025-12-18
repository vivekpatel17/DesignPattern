package AdapterPattern;

public class MultiServiceApp implements SomeApp {
    @Override
    public void displayCatlog(XmlData xmlData) {
        System.out.println("Displaying catlog xml");
    }

    @Override
    public void displayRecommendation(XmlData xmlData) {
        System.out.println("Displaying recommendation xml");
    }
}
