import com.sun.org.apache.xpath.internal.operations.And;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int age;

    private boolean loyaltyCard;

    private ArrayList<Item> basket;

    public Customer(String name, int age, boolean loyaltyCard) {
        this.name = name;
        this.age = age;
        this.loyaltyCard = loyaltyCard;
        this.basket= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Item> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Item> basket) {
        this.basket = basket;
    }

    public void customerBuysItem(Item item){
        this.basket.add(item);
    }

    public int customerBasketSize(){
        return this.basket.size();
    }

    public void putsItemBack(Item item){
        this.basket.remove(item);
    }

    public void leavesStore(){
        this.basket.clear();
    }

    public boolean getLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }


}
