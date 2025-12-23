package AbstractFactoryPattern;

public class ChickenBurger implements IBurger {
    
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger");
    }
}
