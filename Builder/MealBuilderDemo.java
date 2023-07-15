package Builder;

public class MealBuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("-> Veg Meal");
        vegMeal.ShowMeal();
        System.out.println("Total Cost: "+vegMeal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("-> Non-Veg Meal");
        nonVegMeal.ShowMeal();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
    }

}
