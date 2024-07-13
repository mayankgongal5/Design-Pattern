import  java.util.*;

public class Meal {

    private List<Item> tiems = new ArrayList<Item>();
    public void addItem(Item item) {
        tiems.add(item);
    }
    public float getCost() {
        float cost = 0.0f;
        for (Item item : tiems) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : tiems) {
            System.out.println("Item: "+item.name());
            System.out.println("Packing: "+item.packing().pack());
            System.out.println("Cost: "+item.price());
        }
    }
}
