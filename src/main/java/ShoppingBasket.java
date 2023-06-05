import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item>items;

    public ShoppingBasket() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int shoppingBasketSize(){
        return items.size();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void clearShoppingBasket(){
        this.items.clear();
    }

    public double calculateTotalValueOfBasket(ArrayList<Item> basket, Customer customer) {
        double total = 0.0;
        for (Item item : basket) {
            total += item.getPrice();
        }

        if (total > 20.00) {
            total *= 0.9;
        }

        if (customer.getLoyaltyCard()) {
            total *= 0.98;
        }

        return total;
    }

}
