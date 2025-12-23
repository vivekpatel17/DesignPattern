package ProtoypePattern;

public class Object3 implements IObject {
    private int id;
    private String name;
    private Object2 obj2;

    public Object3(int id, String name, Object2 obj2) {
        this.id = id;
        this.name = name;
        this.obj2 = obj2;
    }

    public Object3(Object3 obj1) {
        this.id = obj1.id;
        this.name = obj1.name;
        this.obj2 = new Object2(obj1.obj2);
    }

    public Object2 getObj2() {
        return this.obj2;
    }

    @Override
    public Object3 clone() {
        return new Object3(this);
    }
}
