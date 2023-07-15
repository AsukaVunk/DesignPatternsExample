package AbstractFactory;

public class FactoryProducer {
    public static  AbstractFactory getFactory(String factory){
        if(factory==null) return null;
        switch(factory)
        {
            case "COLOR":
                return new ColorFactory();
            case "SHAPE":
                return new ShapeFactory();
            default:
                return null;
        }
    }
}
