package FactoryPattern;

/*
* BaseAbstractClass is an abstract class that defines the factory method
* This is representing the Restaurant.
*/
public abstract class BaseAbstractClass {
    public abstract Burger createBurger();
    
    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
    }
}
