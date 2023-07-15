package Builder;

public abstract class Burger implements FoodItem{
    @Override
    public abstract float price();

    @Override
    public abstract String name();

    @Override
    public FoodPacking foodPacking() {
        return new Wrapper();
    }
}
