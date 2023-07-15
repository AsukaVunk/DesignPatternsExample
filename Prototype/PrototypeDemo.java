package Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shapeCache1 = ShapeCache.getShape("1");
        System.out.println("Shape: "+shapeCache1.getType());
        Shape shapeCache2 = ShapeCache.getShape("2");
        System.out.println("Shape: "+shapeCache2.getType());
        Shape shapeCache3 = ShapeCache.getShape("3");
        System.out.println("Shape: "+shapeCache3.getType());
    }
}
