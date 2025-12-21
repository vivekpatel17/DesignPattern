package FactoryPattern;

public class Restaurant1 extends BaseAbstractClass {
    
    @Override
    public Burger createBurger() {
        System.out.println("Creating Veg Burger");
        return new VegBurger();
    }
}
