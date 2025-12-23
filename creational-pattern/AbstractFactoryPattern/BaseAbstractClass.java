package AbstractFactoryPattern;

/*
* BaseAbstractClass is an abstract class that defines the factory method
* This is representing the Restaurant.
*/
public abstract class BaseAbstractClass {
    public IPizza orderPizza() {
        IPizza pizza = createPizza();
        pizza.prepare();
        return pizza;
    }

    public void orderBurger() {
        IBurger burger = createBurger();
        burger.prepare();
    }

    public abstract IBurger createBurger();
    public abstract IPizza createPizza();
}
