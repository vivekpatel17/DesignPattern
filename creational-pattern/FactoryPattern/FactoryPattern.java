package FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        var chickenBurger = new Restaurant1();
        var beefBurger = new Restaurant2();

        chickenBurger.orderBurger();
        beefBurger.orderBurger();
    }
}
