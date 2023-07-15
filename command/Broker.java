package Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void executeOrder(){
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
