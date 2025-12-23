package ProtoypePattern;

public class PrototypePattern {
    public static void main(String[] args) {
        Object2 obj2 = new Object2("Object2");
        Object1 obj1 = new Object1(1, "Object1", obj2);
        Object3 obj3 = new Object3(2, "Object3", obj2);
        
        Object1 obj1Clone = obj1.clone();
        var obj1CloneClass = obj1Clone.getObj2();

        Object3 obj3Clone = obj3.clone();
        var obj3CloneClass = obj3Clone.getObj2();

        System.out.println("\n" + "Before changing obj2");
        System.out.println("obj1 clone: " + obj1CloneClass.getClassName());
        System.out.println("obj3 clone: " + obj3CloneClass.getClassName());

        obj2.setClassName("Object2New");

        System.out.println("\n" + "After changing obj2");
        System.out.println("obj1 clone: " + obj1CloneClass.getClassName());
        System.out.println("obj3 clone: " + obj3CloneClass.getClassName());
    }
}
