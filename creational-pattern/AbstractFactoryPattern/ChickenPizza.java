package AbstractFactoryPattern;

public class ChickenPizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicen Pizza");
    }
}
