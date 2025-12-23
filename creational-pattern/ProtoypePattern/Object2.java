package ProtoypePattern;

public class Object2 implements IObject {
    private String className;

    public Object2() {}

    public Object2(String className) {
        this.className = className;
    }

    public Object2(Object2 obj2) {
        this.className = obj2.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    @Override
    public Object2 clone() {
        return new Object2(this);
    }
}
