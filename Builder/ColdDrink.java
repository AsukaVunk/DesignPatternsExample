package Builder;

public abstract class ColdDrink implements FoodItem{
    @Override
    public FoodPacking foodPacking() {
        return new Bottle();
    }
    @Override
    public abstract String name();
    @Override
    public abstract float price() ;
}
