package SingletonPattern;

public class SingletonPattern {

    public static void main(String[] args) {
        var data = "Instance 1";
        var data2 = "Instance 2";
        Singleton s1 = Singleton.getInstance(data);
        Singleton s2 = Singleton.getInstance(data2);

        System.out.println(s1 == s2); // should print true
        System.out.println(s1.getData()); // should print "Instance 1"
        System.out.println(s2.getData()); // should print "Instance 1"
    }
}
