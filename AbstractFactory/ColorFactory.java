package AbstractFactory;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color==null) return null;
        switch(color)
        {
            case "RED":
                return new Red();
            case "BLUE":
                return new Blue();
            case "GREEN":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
