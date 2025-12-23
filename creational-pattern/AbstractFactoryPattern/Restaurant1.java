package AbstractFactoryPattern;

public class Restaurant1 extends BaseAbstractClass {
    
    @Override
    public IBurger createBurger() {
        System.out.println("Creating Veg Burger");
        return new VegBurger();
    }

    @Override
    public IPizza createPizza() {
        System.out.println("Creating Veg Pizza");
        return new VegPizza();
    }
}
