package PizzaSystem;



public abstract class Pizza extends BaseFunctionality  implements PizzaInterface {

    private Customer customer;
    public Customer getCustomer(){
        return this.customer;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public void orderPizza(int size){
        int price= size * 100;
        this.setPrice(price);
        System.out.print("Price: ");
        System.out.println(this.getPrice());
    }
    public void cancelPizza(){
        System.out.println("Pizza Cancelled");
    }


}
