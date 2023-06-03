import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShoppingBasket {


    ShoppingBasket shoppingBasket;

    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Item item5;

    Customer customer1;
    Customer customer2;

    @Before
    public void setUp(){

        customer1 = new Customer("Keith", 35, true);
        customer2 = new Customer("Mar", 28, false);
        shoppingBasket = new ShoppingBasket();
        item1 = new Item("Bannans", 3.25, true);
        item2 = new Item("Apple", 5.00, true);
        item3 = new Item("Oats", 3.60, true);
        item4 = new Item("Guinness", 5.00, true);
        item5 = new Item("Cereal", 4.00, true);

    }

    @Test
    public void shoppingBasketStartsEmpty(){
        assertEquals(0, shoppingBasket.shoppingBasketSize());
    }

    @Test
    public void canAddItemsToShoppingBasket(){
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item3);
        shoppingBasket.addItem(item4);
        assertEquals(4, shoppingBasket.shoppingBasketSize());
    }

    @Test
    public void canRemoveItem(){
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item3);
        shoppingBasket.addItem(item4);
        shoppingBasket.removeItem(item1);
        assertEquals(3, shoppingBasket.shoppingBasketSize());
    }
    @Test
    public void canClearBasket(){
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item3);
        shoppingBasket.addItem(item4);
        shoppingBasket.clearShoppingBasket();
        assertEquals(0, shoppingBasket.shoppingBasketSize());
    }

    @Test
    public void totalValueOfBasket(){
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item3);
        shoppingBasket.addItem(item4);
        shoppingBasket.addItem(item5);
        assertEquals(18.39,shoppingBasket.calculateTotalValueOfBasket(shoppingBasket.getItems(), customer1), 0.1);
    }

    @Test
    public void customerCanAddItem(){
        customer1.customerBuysItem(item1);
        customer1.customerBuysItem(item2);
        customer1.customerBuysItem(item3);
        assertEquals(3, customer1.customerBasketSize());
    }

    @Test
    public void customerPutsItemBack(){
        customer1.customerBuysItem(item1);
        customer1.customerBuysItem(item2);
        customer1.customerBuysItem(item3);
        customer1.putsItemBack(item1);
        assertEquals(2, customer1.customerBasketSize());
    }


}
