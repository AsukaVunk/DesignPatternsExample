package Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<FoodItem> meal = new ArrayList<FoodItem>();

    public void addFoodItem(FoodItem foodItem){
        meal.add(foodItem);
    }

    public float getCost(){
        float cost = 0.0f;
        for(FoodItem foodItem:meal){
            cost += foodItem.price();
        }
        return cost;
    }

    public void ShowMeal(){
        for(FoodItem foodItem:meal){
            System.out.print("Item : "+foodItem.name());
            System.out.print(", Packing : "+foodItem.foodPacking().pack());
            System.out.println(", Price : "+foodItem.price());
        }
    }
}
