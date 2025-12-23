package ProtoypePattern;

public class Object1 implements IObject {
    private int id;
    private String name;
    private Object2 obj2;

    public Object1(int id, String name, Object2 obj2) {
        this.id = id;
        this.name = name;
        this.obj2 = obj2;
    }

    public Object1(Object1 obj1) {
        this.id = obj1.id;
        this.name = obj1.name;
        this.obj2 = obj1.obj2;
    }

    public Object2 getObj2() {
        return this.obj2;
    }

    @Override
    public Object1 clone() {
        return new Object1(this);
    }
}
