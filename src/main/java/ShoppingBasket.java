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

    public double calculateTotalValueOfBasket(ArrayList<Item> items, Customer customer) {
        double total = 0;

        for (Item item : items) {
            total += item.getPrice();
        }
        if (total > 20.00) {
            double discountToAdd = total *= 0.10;
            double newTotal = total - discountToAdd;
            return newTotal;

        } else if (customer.getLoyaltyCard()) {
            double loyalyDiscount = total *= 0.02;
            double newLoyTotal = total - loyalyDiscount;
            return newLoyTotal;
        }

        return total;
    }

}
