package AbstractFactoryPattern;

public class Restaurant2 extends BaseAbstractClass {
    
    @Override
    public IBurger createBurger() {
        System.out.println("Creating Chicken Burger");
        return new ChickenBurger();
    }

    @Override
    public IPizza createPizza() {
        System.out.println("Creating Chicen Pizza");
        return new ChickenPizza();
    }
}
