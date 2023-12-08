package homeworks.hm14.coffee.order;

import java.util.List;

public class CoffeeOrderBoard {
private List<Order> orders;
    private  static int orderCounter = 1; // Змінна для генерації унікальних номерів замовлен

    public CoffeeOrderBoard() {
        this.orders = orders;
    }
    public void addOrder(Order order){
        orderCounter++;
        order.setNumOrder(orderCounter);
        orders.add(order);
    }
    public void deliver(){
        if (!orders.isEmpty()){
            Order delorder = orders.remove(0) ;
            System.out.println("Товар доставлен: " + delorder.Show());
        } else {
            System.out.println("Нет заказов на доставку.");
        }
    }
    public void draw() {
        if (!orders.isEmpty()) {
            System.out.println("===================");
            System.out.println("Num | Name");
            System.out.println("===================");

            for (int i = 0; i < orders.size(); i++) {
                Order order = orders.get(i);
                System.out.printf("%-3d | %s\n", order.getNumOrder(), order.getName());
            }
        } else {
            System.out.println("Нет заказов в очереди.");
        }
    }
}
