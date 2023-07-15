package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.INSTANCE;
        singleObject.hello();
    }
}
