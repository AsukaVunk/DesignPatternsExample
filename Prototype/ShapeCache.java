package Prototype;

import java.util.Hashtable;

public class ShapeCache {
    /* Hashtable是线程安全的(已淘汰，使用ConcurrentHashMap)  */
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();
    public static Shape getShape(String id) {
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }
    /* 模拟数据库操作缓存 */
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }


}
