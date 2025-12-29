package PizzaSystem;

public class Customer extends BaseFunctionality implements CustomerInterface {
    private int  size;
    private String  pizzaType;

    //user definded cunstructor
public Customer(int orderId, String pizzaType,int size){
    this.getOrderId();
    this.pizzaType=pizzaType;
    this.size=size;

}
//default cunstructor
public Customer(){
this.size=0;
this.pizzaType=null;
this.getOrderId();
}
// getter setter
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPizzaType() {
        return this.pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }
}
