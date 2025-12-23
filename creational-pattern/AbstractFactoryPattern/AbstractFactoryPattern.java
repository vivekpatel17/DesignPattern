package AbstractFactoryPattern;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        var Restaurant1 = new Restaurant1();
        var Restaurant2 = new Restaurant2();

        Restaurant2.orderBurger();
        Restaurant1.orderBurger();
        Restaurant2.orderPizza();
    }
}
