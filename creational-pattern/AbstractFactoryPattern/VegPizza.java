package AbstractFactoryPattern;

public class VegPizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza");
    }
}
