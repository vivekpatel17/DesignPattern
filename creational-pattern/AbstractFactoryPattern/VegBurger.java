package AbstractFactoryPattern;

public class VegBurger implements IBurger {
    
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}
