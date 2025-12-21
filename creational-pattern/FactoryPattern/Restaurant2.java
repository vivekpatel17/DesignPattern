package FactoryPattern;

public class Restaurant2 extends BaseAbstractClass {
    
    @Override
    public Burger createBurger() {
        System.out.println("Creating Chicken Burger");
        return new ChickenBurger();
    }
}
