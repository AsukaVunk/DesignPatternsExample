package Flyweight;

public class FlyweightDemo {
    private static final String colors[] = {"Red","Green","Blue","White","Black"};
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomCoordinate());
            circle.setY(getRandomCoordinate());
            circle.setRadius(10);
            circle.draw();

        }

    }
    public static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    public static int getRandomCoordinate(){
        return (int)(Math.random()*100);
    }

}
