package study20260407.kiosk;

public class SnackItem<T> {
    private T name;
    private int price;
    private int quantity;

    public SnackItem(T name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public T getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
