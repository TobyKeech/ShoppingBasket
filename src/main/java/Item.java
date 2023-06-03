public class Item {

    private String name;
    private double price;

    private boolean boGo;

    public Item(String name, double price, boolean boGo) {
        this.name = name;
        this.price = price;
        this.boGo = boGo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getBoGo() {
        return this.boGo;
    }

    public void setBoGo(boolean discount) {
        this.boGo = discount;
    }
}
