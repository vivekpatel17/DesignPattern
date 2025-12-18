package AdapterPattern;

public class AdapterPattern {
  public static void main(String[] args) {
    XmlData xmlData = new XmlData();
    JsonData jsonData = new JsonData();
    
    MultiServiceApp app1 = new MultiServiceApp();
    app1.displayCatlog(xmlData);
    app1.displayRecommendation(xmlData);
    
    System.out.println("\n");
    FancyServiceApp app2 = new FancyServiceApp();
    app2.displayCatlog(jsonData);
    app2.displayRecommendation(jsonData);
    
    System.out.println("\n");
    FancyServiceAppAdapter app2adap = new FancyServiceAppAdapter();
    app2adap.displayCatlog(xmlData);
    app2adap.displayRecommendation(xmlData);
  }
}