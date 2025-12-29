package PizzaSystem;

public abstract class BaseFunctionality implements BaseFunctionalityInterface {
    private int orderId, price;
    public int getOrderId() {
        return this.orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
