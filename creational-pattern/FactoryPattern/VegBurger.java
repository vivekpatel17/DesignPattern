package FactoryPattern;

public class VegBurger implements Burger {
    
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}
